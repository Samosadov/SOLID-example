package com.example.solidexample.srp.right;

import com.example.solidexample.models.Order;
import com.example.solidexample.srp.wrong.MySqlConnection;

public class OrderProcessor {
    public void process(Order order) {
        MySQLOrderRepository repository = new MySQLOrderRepository();
        ConfirmationEmailSender mailSender = new ConfirmationEmailSender();

        if (order.isValid() && repository.save(order)) {
            mailSender.sendConfirmationEmail(order);
        }
    }
}
