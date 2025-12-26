/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.ClothingItems;

public class inventorycontroller {

    private final List<ClothingItems> inventory;
    private int nextId;

    public inventorycontroller() {
        inventory = new ArrayList<>();
        nextId = 1; // start IDs from 1
    }

    public List<ClothingItems> getInventory() {
        return inventory; // simple, just return the list
    }

    // Add item (simple validation)
    public boolean addItem(String name, String category, String size, double price, int stock) {
        if (name.isEmpty() || category.isEmpty() || size.isEmpty()) return false;
        if (price < 0 || stock < 0) return false;

        ClothingItems item = new ClothingItems(nextId++, name, category, size, price, stock);
        inventory.add(item);
        return true;
    }

    // Update item
    public boolean updateItem(int id, String name, String category, String size, double price, int stock) {
        ClothingItems item = getItemById(id);
        if (item == null) return false;
        if (name.isEmpty() || category.isEmpty() || size.isEmpty()) return false;
        if (price < 0 || stock < 0) return false;

        item.setName(name);
        item.setCategory(category);
        item.setSize(size);
        item.setPrice(price);
        item.setStock(stock);
        return true;
    }

    // Delete item
    public boolean deleteItem(int id) {
        return inventory.removeIf(item -> item.getId() == id);
    }

    // Get item by ID
    public ClothingItems getItemById(int id) {
        for (ClothingItems item : inventory) {
            if (item.getId() == id) return item;
        }
        return null;
    }
    // Check duplicate item by name (used by View validation)
public boolean isDuplicateItem(String name, int currentId) {
    for (ClothingItems item : inventory) {
        // Ignore the same item when updating
        if (item.getName().equalsIgnoreCase(name) && item.getId() != currentId) {
            return true;
        }
    }
    return false;
}

}


