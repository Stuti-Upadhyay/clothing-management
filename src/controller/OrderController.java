/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import model.Order;
import model.ClothingItems;

public class OrderController {

     private final Stack<Order> orderStack = new Stack<>();;

    
    public void addOrder(
            String customerName,
            String phone,
            String address,
            ClothingItems item,
            int quantity
    ) {
        // Basic validation
        if (item == null || quantity <= 0) return;
        if (item.getStock() < quantity) return;

        // Reduce stock
        item.setStock(item.getStock() - quantity);

        double total = item.getPrice() * quantity;

        Order order = new Order(
                customerName,
                phone,
                address,
                item.getName(),
                quantity,
                total
        );

        orderStack.push(order);
    }

    public Stack<Order> getOrders() {
        return orderStack;
    }

    // STACK pop
    public Order removeLastOrder() {
        if (orderStack.isEmpty()) return null;
        return orderStack.pop();
    }
}
