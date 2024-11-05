package org.example.redmadenv2.Model;


public class DatoVare {

    private String name;

    private double price;

    private int expirationDays;

    private String location;

    private String storeName;

    private String category;

    public DatoVare() {

    }

    public DatoVare(String name, double price, int expirationDays, String location, String storeName, String category) {
        this.name = name;
        this.price = price;
        this.expirationDays = expirationDays;
        this.location = location;
        this.storeName = storeName;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public void setExpirationDays(int expirationDays) {
        this.expirationDays = expirationDays;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
