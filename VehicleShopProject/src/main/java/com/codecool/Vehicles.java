package com.codecool;

import java.io.Serializable;

public  class Vehicles implements Serializable {

    public String name;
    public int consumption;
    public Fuel fuelType;
    public int space;
    public Craft craftType;
    public boolean parked;


    public Vehicles(String name, int consumption, Fuel fuelType, int space, Craft craftType,boolean parked) {
        this.name = name;
        this.consumption = consumption;
        this.fuelType = fuelType;
        this.space = space;
        this.craftType = craftType;
        this.parked = parked;

    }

    @Override
    public String toString() {
        return "mittudomén: " + name + ", " +
               "Cons: " + consumption + ", " +
                "FuelType: " + fuelType + ", " +
               "Space: " + space + ", " +
            "CraftType: " + craftType + ", " +
            "Parked: " + parked +"\n";
    }

    public String getName() { return this.name; }

    public int getConsumpton() {
        return this.consumption;
    }

    public Fuel getFuelType() {
        return this.fuelType;
    }

    public int getSpace() {
        return this.space;
    }

    public Craft getCraftType() { return this.craftType; }

    public boolean getParked() { return this.parked; }

    public void setName(String name) {
        this.name = name;
    }

    public void setParked(boolean parked) { this.parked = parked; }
}
