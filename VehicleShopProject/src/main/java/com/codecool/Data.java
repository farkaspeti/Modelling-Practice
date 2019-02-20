package com.codecool;

import java.io.*;
import java.sql.SQLOutput;
import java.util.List;

public class Data {

    public void writeTruckToFile(String pathName, List<Vehicles> truckList) {

        try {

            FileOutputStream fileOut = new FileOutputStream(pathName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(truckList);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void writeCarToFile(String pathName, List<Vehicles> carList) {

        try {

            FileOutputStream fileOut = new FileOutputStream(pathName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(carList);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void writeBusToFile(String pathName, List<Vehicles> busList) {

        try {

            FileOutputStream fileOut = new FileOutputStream(pathName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(busList);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Vehicles> readTruckFromFile(String pathName) {
        List<Vehicles> truckList = null;
        try {
            FileInputStream fileIn = new FileInputStream(pathName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            truckList = (List<Vehicles>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException x) {
            x.printStackTrace();
            return truckList;
        } catch (ClassNotFoundException c) {
            System.out.println("There is no trucks!");
            return truckList;
        }
        return truckList;
    }

    public List<Vehicles> readCarFromFile(String pathName) {
        List<Vehicles> carList = null;
        try {
            FileInputStream fileIn = new FileInputStream(pathName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            carList = (List<Vehicles>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException x) {
            x.printStackTrace();
            return carList;
        } catch (ClassNotFoundException c) {
            System.out.println("There is no cars!");
            return carList;
        }
        return carList;
    }

    public List<Vehicles> readBusFromFile(String pathName) {
        List<Vehicles> busList = null;
        try {
            FileInputStream fileIn = new FileInputStream(pathName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            busList = (List<Vehicles>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException x) {
            x.printStackTrace();
            return busList;
        } catch (ClassNotFoundException c) {
            System.out.println("There is no buses!");
            return busList;
        }
        return busList;
    }
}

