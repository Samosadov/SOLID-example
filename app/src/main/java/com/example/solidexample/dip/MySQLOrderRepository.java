package com.example.solidexample.dip;

import com.example.solidexample.models.Order;
import com.example.solidexample.srp.wrong.MySqlConnection;

public class MySQLOrderRepository implements OrderRepository {
    @Override
    public boolean save(Order order) {
        MySqlConnection connection = new MySqlConnection("database.url");
        // save DB

        return true;
    }
}
