package com.example.solidexample.dip;

import com.example.solidexample.models.Order;

public class ConfirmationEmailSender implements MailSender {
    @Override
    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
        // send letter to client
    }
}
