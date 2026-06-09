 package com.foodsystem.servlet;

public class Customer {

    private int customerId;
    private String customerName;
    private String phone;
    private String address;

    // Default Constructor
    public Customer() {
    }

    // Constructor without ID (for AUTO_INCREMENT)
    public Customer(String customerName, String phone, String address) {
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
    }

    // Constructor with ID
    public Customer(int customerId, String customerName,
                    String phone, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
    }

    // Getters and Setters

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId
                + ", customerName=" + customerName
                + ", phone=" + phone
                + ", address=" + address + "]";
    }
}