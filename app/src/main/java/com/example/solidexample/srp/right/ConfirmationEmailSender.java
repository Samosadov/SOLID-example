package com.example.solidexample.srp.right;

import com.example.solidexample.models.Order;

public class ConfirmationEmailSender {
    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
        // send mail to client
    }
}
