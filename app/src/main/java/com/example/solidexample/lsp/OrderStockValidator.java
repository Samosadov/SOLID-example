package com.example.solidexample.lsp;

import com.example.solidexample.models.Item;
import com.example.solidexample.models.Order;

public class OrderStockValidator {
    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (!item.isInStock()) {
                return false;
            }
        }
        return true;
    }
}
