 package com.foodsystem.servlet;

public class Menu {

    private String foodName;
    private String category;
    private double price;
    private String description;
    private String availability;

    public Menu(String foodName,
                String category,
                double price,
                String description,
                String availability) {

        this.foodName = foodName;
        this.category = category;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getAvailability() {
        return availability;
    }
}