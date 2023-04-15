package com.example.solidexample.lsp;

import com.example.solidexample.models.Item;
import com.example.solidexample.models.Order;

public class OrderStockAndPackValidator extends OrderStockValidator {
    @Override
    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (!item.isInStock() || !item.isPacked()) {
                throw new IllegalStateException(
                        String.format("Order %d is not valid!", order.getId())
                );
            }
        }
        return true;
    }
}
