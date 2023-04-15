package com.example.solidexample.srp.wrong;

import com.example.solidexample.models.Order;

public class OrderProcessor {
    public void process(Order order) {
        if (order.isValid() & save(order)) {
            sendConfirmationEmail(order);
        }
    }

    private void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
    }

    private boolean save(Order order) {
        MySqlConnection connection = new MySqlConnection("database.url");

        return true;
    }
}
