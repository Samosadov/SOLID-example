package com.example.solidexample.dip;

import com.example.solidexample.models.Order;

public interface OrderRepository {
    boolean save(Order order);
}
