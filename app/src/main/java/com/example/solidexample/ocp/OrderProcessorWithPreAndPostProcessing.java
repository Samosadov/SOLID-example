package com.example.solidexample.ocp;

import com.example.solidexample.models.Order;
import com.example.solidexample.srp.right.OrderProcessor;

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {
    @Override
    public void process(Order order) {
        beforeProcessing();
        super.process(order);
        afterProcessing();
    }

    private void afterProcessing() {
        // some action
    }

    private void beforeProcessing() {
        // some action
    }
}
