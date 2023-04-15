package com.example.solidexample.dip;

import com.example.solidexample.models.Order;

public interface MailSender {
    void sendConfirmationEmail(Order order);
}
