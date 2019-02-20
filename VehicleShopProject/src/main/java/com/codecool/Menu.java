package com.codecool;

import java.util.*;
import java.lang.*;

public class Menu {
    List<Vehicles> truckList = new ArrayList<>();
    List<Vehicles> carList = new ArrayList<>();
    List<Vehicles> busList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //Methods

    public int handleInputInt(String outputMessage) {
        System.out.print(outputMessage + " ");
        int userInput = scanner.nextInt();
        System.out.println();
        return userInput;
    }

    public String handleInputString(String outputMessage) {
        System.out.print(outputMessage + " ");
        String userInput = scanner.next();
        System.out.println();
        return userInput;
    }


    public void start() {
        boolean notQuit = true;
        while (notQuit) {
            System.out.println();
            System.out.println("    1. Car park status!");
            System.out.println("    2. Vehicle shop!");
            System.out.println("    3. Sell Vehicle!");
            System.out.println("    4. Quit\n");
            int menuOptions = handleInputInt("Pick one menu option!");

            switch (menuOptions) {
                case 1:
                    Data readData = new Data();
                    System.out.println("Car park status!");
                    System.out.println("Trucks:");
                    System.out.println(readData.readTruckFromFile("src/main/resources/truck.txt"));
                    System.out.println("Cars:");
                    System.out.println(readData.readCarFromFile("src/main/resources/car.txt"));
                    System.out.println("Buses:");
                    System.out.println(readData.readBusFromFile("src/main/resources/bus.txt"));
                    break;
                case 2:
                    System.out.println("Vehicle shop!\n" + "");
                    Random rand = new Random();
                    while (true) {
                        String userInput = handleInputString("What type of vehicle do you want to buy?\n" +
                            "Truck, Car or Bus?\n").toLowerCase();
                        if (userInput.equals("truck")) {
                            String truckInput = handleInputString("What will be your Truck name?");
                            System.out.println("What type of fuel do you want to add?[DIESEL,GAS]");
                            Fuel truckInput2 = Fuel.valueOf(scanner.next().toUpperCase());
                            Vehicles truck = new Vehicles(truckInput, rand.nextInt(27) + 15, truckInput2, rand.nextInt(35) + 15, Craft.TRUCK,false);
                            truckList.add(truck);
                            Data writedata = new Data();
                            writedata.writeTruckToFile("src/main/resources/truck.txt",truckList);
                            break;
                        } else if (userInput.equals("car")) {
                            String carInput = handleInputString("What will be your Car name?");
                            System.out.println("What type of fuel do you want to add?[DIESEL,GAS]");
                            Fuel carInput2 = Fuel.valueOf(scanner.next().toUpperCase());
                            Vehicles car = new Vehicles(carInput, rand.nextInt(5) + 10, carInput2, rand.nextInt(1) + 4, Craft.CAR,false);
                            carList.add(car);
                            Data writedata  = new Data();
                            writedata.writeCarToFile("src/main/resources/car.txt",carList);
                            break;
                        } else if (userInput.equals("bus")) {
                            String busInput = handleInputString("What will be your Bus name?");
                            System.out.println("What type of fuel do you want to add?[DIESEL,GAS]");
                            Fuel busInput2 = Fuel.valueOf(scanner.next().toUpperCase());
                            Vehicles bus = new Vehicles(busInput, rand.nextInt(20) + 10, busInput2, rand.nextInt(20) + 10, Craft.BUS,false);
                            busList.add(bus);
                            Data writedata  = new Data();
                            writedata.writeBusToFile("src/main/resources/bus.txt",busList);
                            break;
                        } else if (userInput.equals("q")) {
                            break;
                        } else {
                            System.out.println("Wrong Input,if you didn't want to buy press q\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Sell Vehicle!");
                    //implement!
                    break;
                case 4:
                    notQuit = false;
                    break;
            }
        }
    }
}
