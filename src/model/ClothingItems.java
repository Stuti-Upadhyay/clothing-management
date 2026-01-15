/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class ClothingItems {
    private int id;
    private String name;
    private String category;
    private String size;
    private double price;
    private int stock;

    public ClothingItems(int id, String name, String category, String size, double price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.size = size;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public String getCategory() { 
        return category; 
    }
    public void setCategory(String category) { 
        this.category = category; 
    }
    public String getSize() { 
        return size; 
    }
    public void setSize(String size) { 
        this.size = size; 
    }
    public double getPrice() { 
        return price; 
    }
    public void setPrice(double price) { 
        this.price = price; 
    }
    public int getStock() { 
        return stock; 
    }
    public void setStock(int stock) { 
        this.stock = stock; 
    }
}
