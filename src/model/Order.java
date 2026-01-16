/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
/**
 *
 * @author User
 */
public class Order {

    private static int nextOrderId = 1;

    private int orderId;
    private String customerName;
    private String phone;
    private String address;
    private String itemName;
    private int quantity;
    private double total;
    private Date date;

    public Order(
            String customerName,
            String phone,
            String address,
            String itemName,
            int quantity,
            double total
    ) {
        this.orderId = nextOrderId++;
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
        this.itemName = itemName;
        this.quantity = quantity;
        this.total = total;
        this.date = new Date();    // auto date
    }

    // ===============================
    // GETTERS ONLY (NO SETTERS)
    // ===============================
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public Date getDate() {
        return date;
    }
}
