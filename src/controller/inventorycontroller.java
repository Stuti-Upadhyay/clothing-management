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

    public inventorycontroller() {
        inventory = new ArrayList<>();
        // Start empty — no preloaded items
    }

    public List<ClothingItems> getInventory() {
        return inventory;
    }

    public void addItem(ClothingItems item) {
        inventory.add(item);
    }

    public void updateItem(int id, ClothingItems updatedItem) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId() == id) {
                inventory.set(i, updatedItem);
                break;
            }
        }
    }

    public void deleteItem(int id) {
        inventory.removeIf(item -> item.getId() == id);
    }

    public ClothingItems getItemById(int id) {
        return inventory.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public int getNextId() {
        return inventory.size() + 1;
    }
}

