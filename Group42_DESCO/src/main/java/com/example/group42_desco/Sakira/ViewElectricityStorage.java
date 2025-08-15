package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class ViewElectricityStorage {
    private String ItemName;
    private int Quantity;
    private String Location;
    private String Status;

    public static ArrayList<ViewElectricityStorage> StorageList = new ArrayList<>();

    public ViewElectricityStorage(String ItemName, int Quantity, String Location, String Status) {
        this.ItemName = ItemName;
        this.Quantity = Quantity;
        this.Location = Location;
        this.Status = Status;
    }

    public ViewElectricityStorage() {
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public static ArrayList<ViewElectricityStorage> getStorageList() {
        return StorageList;
    }

    public static void setStorageList(ArrayList<ViewElectricityStorage> storageList) {
        StorageList = storageList;
    }

    @Override
    public String toString() {
        return "ViewElectricityStorage{" +
                "ItemName='" + ItemName + '\'' +
                ", Quantity=" + Quantity +
                ", Location='" + Location + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
