/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import model.ClothingItems;
import model.Order;

public class inventorycontroller {

     // MAIN INVENTORY 
    private final ArrayList<ClothingItems> inventory;

    // QUEUE for dashboard (FIFO)
    private final Queue<ClothingItems> recentQueue;

    private static final int MAX_RECENT = 5;
    private int nextId;

    public inventorycontroller() {
        inventory = new ArrayList<>();
        recentQueue = new LinkedList<>();
        nextId = 1;

        // Preloaded items → MUST go through addItem()
        addItem("Red Saree", "Saree", "M", 1200, 10);
        addItem("Blue Kurti", "Kurti", "L", 800, 15);
        addItem("Nepali Topi", "Topi", "Free Size", 300, 20);
        addItem("Green Cholo", "Cholo", "S", 1000, 5);
        addItem("Yellow Kurti", "Kurti", "M", 900, 12);
    }


    public List<ClothingItems> getInventory() {
        return inventory; //  returns the list
    }
    
     // =====================
    // QUEUE ACCESS (Dashboard)
    // =====================
    public Queue<ClothingItems> getRecentItems() {
        return recentQueue;
    }

    // Add item 
    public boolean addItem(String name, String category, String size,
                           double price, int stock) {

        if (name.isEmpty() || category.isEmpty() || size.isEmpty()) return false;
        if (price < 0 || stock < 0) return false;

        ClothingItems item =
            new ClothingItems(nextId++, name, category, size, price, stock);

        inventory.add(item);

        // enqueue
        recentQueue.add(item);

        // FIFO while keeping only 5
        if (recentQueue.size() > MAX_RECENT) {
            recentQueue.poll(); // dequeue oldest
        }

        return true;
    }

    // Update item
     public boolean updateItem(int id, String name, String category,
                              String size, double price, int stock) {

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


