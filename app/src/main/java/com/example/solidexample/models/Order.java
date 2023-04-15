package com.example.solidexample.models;

public class Order {
    String customerName = "Konstantin";
    String customerEmail = "simpleton1024@yandex.ru";
    private String id;

    public boolean isValid() { return false; }

    public Item[] getItems() { return new Item[0]; }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
