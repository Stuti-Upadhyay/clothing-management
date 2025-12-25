/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.inventorycontroller;
import javax.swing.JOptionPane;
import model.ClothingItems;

/**
 *
 * @author User
 */
public class ItemsAction extends javax.swing.JFrame {
    
    private final inventorycontroller controller;
    private final AdminPage adminPage;
    private final ClothingItems editItem; // null if creating new

    public ItemsAction(inventorycontroller controller, AdminPage adminPage, ClothingItems itemToEdit) {
    this.controller = controller;
    this.adminPage = adminPage;
    this.editItem = itemToEdit;
    initComponents();

    if (editItem != null) {
        // Edit mode
        IDTF.setText(String.valueOf(editItem.getId()));
        IDTF.setEditable(false);
        NameTF.setText(editItem.getName());
        CategoryTF.setText(editItem.getCategory());
        SizeTF.setText(editItem.getSize());
        PriceTF.setText(String.valueOf(editItem.getPrice()));
        StockTF.setText(String.valueOf(editItem.getStock()));
    } 
    else {
        // Add mode
        IDTF.setText(String.valueOf(controller.getNextId()));
        IDTF.setEditable(false);
       }
    }

    
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IDL = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        CategoryL = new javax.swing.JLabel();
        SizeL = new javax.swing.JLabel();
        PriceL = new javax.swing.JLabel();
        StockL = new javax.swing.JLabel();
        IDTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        CategoryTF = new javax.swing.JTextField();
        SizeTF = new javax.swing.JTextField();
        PriceTF = new javax.swing.JTextField();
        StockTF = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        IDL.setForeground(new java.awt.Color(255, 255, 255));
        IDL.setText("ID");

        NameL.setForeground(new java.awt.Color(255, 255, 255));
        NameL.setText("Name");

        CategoryL.setForeground(new java.awt.Color(255, 255, 255));
        CategoryL.setText("Category");

        SizeL.setForeground(new java.awt.Color(255, 255, 255));
        SizeL.setText("Size");

        PriceL.setForeground(new java.awt.Color(255, 255, 255));
        PriceL.setText("Price");

        StockL.setForeground(new java.awt.Color(255, 255, 255));
        StockL.setText("Stock");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StockL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StockTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PriceL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SizeL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoryL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(SaveButton)
                        .addGap(41, 41, 41)
                        .addComponent(CancelButton)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDL)
                    .addComponent(IDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameL)
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryL)
                    .addComponent(CategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SizeL)
                    .addComponent(SizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceL)
                    .addComponent(PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StockL)
                    .addComponent(StockTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
              try {
        int id = Integer.parseInt(IDTF.getText());
        String name = NameTF.getText();
        String category = CategoryTF.getText();
        String size = SizeTF.getText();
        double price = Double.parseDouble(PriceTF.getText());
        int stock = Integer.parseInt(StockTF.getText());

        if (name.isEmpty() || category.isEmpty() || size.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        ClothingItems item = new ClothingItems(id, name, category, size, price, stock);

        if (editItem == null) {
            controller.addItem(item);
            JOptionPane.showMessageDialog(this, "Item added!");
        } else {
            controller.updateItem(id, item);
            JOptionPane.showMessageDialog(this, "Item updated!");
        }

        adminPage.loadInventoryTable();
        this.dispose();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Price and Stock must be numbers!");
    }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CategoryL;
    private javax.swing.JTextField CategoryTF;
    private javax.swing.JLabel IDL;
    private javax.swing.JTextField IDTF;
    private javax.swing.JLabel NameL;
    private javax.swing.JTextField NameTF;
    private javax.swing.JLabel PriceL;
    private javax.swing.JTextField PriceTF;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel SizeL;
    private javax.swing.JTextField SizeTF;
    private javax.swing.JLabel StockL;
    private javax.swing.JTextField StockTF;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
