package com.codecool;

import java.util.List;

public class Buyer {
    private int money;
    private String buyerName;
    private List<Vehicles> ownedCars;

    public Buyer(int money, String buyerName, List<Vehicles> ownedCars) {
        this.money = money;
        this.buyerName = buyerName;
        this.ownedCars = ownedCars;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public List<Vehicles> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(List<Vehicles> ownedCars) {
        this.ownedCars = ownedCars;
    }
}
