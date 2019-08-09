import javax.swing.*;
import java.util.ArrayList;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bedant
 */
public class swingWindows extends javax.swing.JFrame {

        /**
         * Calls the first window of the project.
         */
        public swingWindows(Connection con, Rentalstore rstore,Password p1, Inventory inven) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(swingWindows.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(swingWindows.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(swingWindows.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(swingWindows.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                
                inven.reducePriceAndSellItems();
                this.con = con;
                this.rstore = rstore;
                this.inv = inven;
                this.pass = p1; // password
                this.initComponents();
                
        }

        /**
         * Initialzes with the starting screen.
         */

        private void initComponents() {
            try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
        
                javax.swing.JButton jButton1;
                javax.swing.JButton jButton2;
                javax.swing.JLabel jLabel1;
                javax.swing.JLabel jLabel2;
                javax.swing.JLabel jLabel3;
                javax.swing.JLabel jLabel4;
                javax.swing.JLabel jLabel5;
                javax.swing.JLabel jLabel6;
                javax.swing.JLabel jLabel7;
                javax.swing.JPasswordField jPasswordField1;
                javax.swing.JPasswordField jPasswordField2;
                javax.swing.JScrollPane jScrollPane1;
                javax.swing.JTextArea jTextArea1;
                javax.swing.JTextField jTextField1;
                javax.swing.JTextField jTextField2;
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea1 = new javax.swing.JTextArea();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jPasswordField1 = new javax.swing.JPasswordField();
                jPasswordField2 = new javax.swing.JPasswordField();
                jLabel7 = new javax.swing.JLabel();

                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane1.setViewportView(jTextArea1);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel1.setText("Manager");

                jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel2.setText("Clerk");

                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                managerLogin(evt, jTextField1, jPasswordField1);
                        }
                });

                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                storeKeeperLogin(evt, jTextField2, jPasswordField2);
                        }
                });

                jButton1.setBackground(new java.awt.Color(14, 7, 7));
                jButton1.setForeground(new java.awt.Color(227, 232, 238));
                jButton1.setText("Login");

                jButton2.setBackground(new java.awt.Color(17, 17, 6));
                jButton2.setForeground(new java.awt.Color(249, 239, 239));
                jButton2.setText("Login");

                jLabel3.setText("Username");

                jLabel4.setText("Username");

                jLabel5.setText("Password");

                jLabel6.setText("Password");

                jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel7.setText("Welcome to Video Rental Store Software");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup().addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addContainerGap().addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                128,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(25, 25, 25)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jPasswordField1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                85,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jTextField1)))))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                95,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(113, 113,
                                                                                                                                113))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                49,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel4)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jTextField2,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                83,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                .addGap(5, 5, 5)
                                                                                                                                                .addComponent(jPasswordField2,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                83,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGap(38, 38, 38))))
                                .addGroup(layout.createSequentialGroup().addGap(75, 75, 75).addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2).addGap(75, 75, 75))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel7)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextField2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3)))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5).addComponent(jLabel6)
                                                                .addComponent(jPasswordField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPasswordField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton1).addComponent(jButton2))
                                                .addContainerGap(107, Short.MAX_VALUE)));

                pack();
                setVisible(true);

        }
        // Checks and directs according to manager login
        private void managerLogin(java.awt.event.ActionEvent evt, JTextField username, JPasswordField passwordInput) {

                if (pass.managerUsername.compareTo(username.getText()) == 0
                                && pass.managerPassword.compareTo(passwordInput.getText()) == 0) {
                        System.out.println("Logged in!");
                        getContentPane().removeAll();
                        repaint();
                        managerWindow();
                } else {
                        System.out.println("Wrong Password!");
                        getContentPane().removeAll();
                        initComponents();
                }
        }

        // Checks and redirects as per store keep login
        private void storeKeeperLogin(java.awt.event.ActionEvent evt, JTextField username, JPasswordField passwordIn) {
                if (pass.storeKeeperUsername.compareTo(username.getText()) == 0
                                && pass.storeKeeperPassword.compareTo(passwordIn.getText()) == 0) {
                        System.out.println("Logged in!");
                        getContentPane().removeAll();
                        repaint();
                        storeKeeperWindow();
                } else {
                        System.out.println("Wrong Password!");
                        getContentPane().removeAll();
                        initComponents();
                }
        }

        ////////////////////////////////////////////////////////////
        ///////// End of methods starting window and functions.////////
        ////////////////////////////////////////////////////////////

        // The code for manager functions window
        public void managerWindow() {
                try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
                javax.swing.ButtonGroup buttonGroup1;
                javax.swing.JButton jButton1;
                javax.swing.JLabel jLabel1;
                javax.swing.JLabel jLabel2;
                javax.swing.JRadioButton jRadioButton1;
                javax.swing.JRadioButton jRadioButton2;

                buttonGroup1 = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton2 = new javax.swing.JRadioButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel1.setText("Logged in as Manager");

                jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
                jLabel2.setText("Select the functionality");

                jButton1.setText("Proceed");

                buttonGroup1.add(jRadioButton1);
                jRadioButton1.setText("Add New Item");

                buttonGroup1.add(jRadioButton2);
                jRadioButton2.setText("Check profit/loss Account");

                jRadioButton1.setSelected(true);
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                managerFunctionalityHandler(evt, jRadioButton1, jRadioButton2);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGap(35, 35, 35)
                                                                .addComponent(jLabel2))
                                                .addGroup(layout.createSequentialGroup().addGap(161, 161, 161)
                                                                .addComponent(jButton1))
                                                .addGroup(layout.createSequentialGroup().addGap(97, 97, 97)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jRadioButton1)
                                                                                .addComponent(jRadioButton2)))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)))
                                                .addContainerGap(111, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel1)
                                                .addGap(18, 18, 18).addComponent(jLabel2).addGap(18, 18, 18)
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton2).addGap(18, 18, 18).addComponent(jButton1)
                                                .addContainerGap(155, Short.MAX_VALUE)));

                pack();
                setVisible(true);
        }

        // Handles the naviagation between multiple screens.
        public void managerFunctionalityHandler(java.awt.event.ActionEvent evt, JRadioButton jRadioButton1,
                        JRadioButton jRadioButton2) {
                if (jRadioButton1.isSelected()) {
                        getContentPane().removeAll();
                        repaint();
                        addItemWindow();
                } else {
                        System.out.println("Checking profit loss");
                        getContentPane().removeAll();
                        repaint();
                        checkProfitLoss();
                }

        }

        // Code for the window letting the manager add items
        private void addItemWindow() {
                javax.swing.JButton jButton1;
                javax.swing.JButton jButton2;
                javax.swing.JLabel jLabel1;
                javax.swing.JLabel jLabel2;
                javax.swing.JLabel jLabel3;
                javax.swing.JLabel jLabel4;
                javax.swing.JLabel jLabel5;
                javax.swing.JRadioButton jRadioButton1;
                javax.swing.JRadioButton jRadioButton2;
                javax.swing.JRadioButton jRadioButton3;
                javax.swing.JRadioButton jRadioButton4;
                javax.swing.JRadioButton jRadioButton5;
                javax.swing.JTextField jTextField1;
                javax.swing.JTextField jTextField2;
                javax.swing.JTextField jTextField3;
                java.awt.Label label1;

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton2 = new javax.swing.JRadioButton();
                label1 = new java.awt.Label();
                jRadioButton3 = new javax.swing.JRadioButton();
                jRadioButton4 = new javax.swing.JRadioButton();
                jRadioButton5 = new javax.swing.JRadioButton();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                ButtonGroup typeButtons = new ButtonGroup();
                ButtonGroup formatButtons = new ButtonGroup();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Please enter the details of new item.");
                jLabel2.setText("ItemName");
                jLabel3.setText("Rental Price");
                jLabel4.setText("Cost Price");
                jLabel5.setText("Item Type");

                jRadioButton1.setText("CD");
                jRadioButton2.setText("DVD");
                jRadioButton1.setSelected(true);
                typeButtons.add(jRadioButton1);
                typeButtons.add(jRadioButton2);

                label1.setText("Item Format");

                jRadioButton3.setText("VHS");
                jRadioButton4.setText("MP4");
                jRadioButton5.setText("Music");
                jRadioButton3.setSelected(true);

                formatButtons.add(jRadioButton3);
                formatButtons.add(jRadioButton4);
                formatButtons.add(jRadioButton5);

                jButton1.setText("Add Entry");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                                String ItemType, ItemFormat, ItemName;
                                int Cost = 0, Rental = 0;

                                boolean warned = false;
                                ItemName = jTextField1.getText();

                                if (jRadioButton1.isSelected()) {
                                        ItemType = "CD";
                                } else {
                                        ItemType = "DVD";
                                }

                                if (jRadioButton3.isSelected()) {
                                        ItemFormat = "VHS";
                                } else if (jRadioButton4.isSelected()) {
                                        ItemFormat = "MP4";
                                } else {
                                        ItemFormat = "Music";
                                }

                                try {
                                        Rental = Integer.valueOf(jTextField2.getText());
                                } catch (Exception e) {
                                        Warning warn = new Warning("Rental should be an integer", true);
                                        warned = true;
                                }

                                try {
                                        Cost = Integer.valueOf(jTextField3.getText());
                                } catch (Exception e) {
                                        Warning warn = new Warning("Cost should be an integer", true);
                                        warned = true;
                                }

                                for (int i = 0; i < inv.itemsList.size(); i++) {
                                        if (inv.itemsList.get(i).getItemName().toLowerCase()
                                                        .compareTo(ItemName.toLowerCase()) == 0) {
                                                Warning warn = new Warning("Another item with same name exists", true);
                                                warned = true;
                                                break;
                                        }
                                }

                                if (warned == false && Rental != 0 && Cost != 0 && ItemName.length() != 0) {
                                        Item registered = inv.addItem(ItemName, Rental, Cost, ItemType, ItemFormat);
                                        String message = ("Registered new item " + registered.getItemName()
                                                        + " of type " + registered.getItemType() + " in format "
                                                        + registered.getItemFormat());
                                        System.out.println(message);
                                        System.out.println("Total items in inventory : " + inv.itemsList.size());

                                        PlTransaction newTransac = new PlTransaction(message, (-1 * Cost));
                                        Account.plAccount.add(newTransac);
                                }
                                getContentPane().removeAll();
                                repaint();
                                            try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                System.out.println(ex);
            }
                                addItemWindow();
                        }
                });

                jButton2.setText("Go Back");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                getContentPane().removeAll();
                                repaint();
                                managerWindow();
                        }
                });

                                try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGap(205, 205, 205)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                366,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup().addGap(74, 74, 74)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(label1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                167, Short.MAX_VALUE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                                .addComponent(jTextField1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                342,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jTextField2)
                                                                                                .addComponent(jTextField3))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jRadioButton1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                102,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jRadioButton3))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jButton1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                122,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(48, 48, 48)))
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jButton2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                107,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(35, 35, 35)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jRadioButton2)
                                                                                                                                                .addComponent(jRadioButton4))
                                                                                                                                .addGap(67, 67, 67)
                                                                                                                                .addComponent(jRadioButton5)))))))
                                                .addContainerGap(124, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2).addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jTextField3).addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jRadioButton1)
                                                                .addComponent(jRadioButton2))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(label1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jRadioButton3)
                                                                                .addComponent(jRadioButton4)
                                                                                .addComponent(jRadioButton5)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton1).addComponent(jButton2))
                                                .addContainerGap(62, Short.MAX_VALUE)));

                pack();
                setVisible(true);
        }// </editor-fold>

        ////////////////////////////////////////////////////////////
        ////// End of manager functions window and functions.///////
        ////////////////////////////////////////////////////////////

        /*
         * ////////// All manager related windows finished ////////////
         */

        // The code for store keeper function window
        public void storeKeeperWindow() {
                javax.swing.ButtonGroup buttonGroup1;
                javax.swing.JButton jButton1;
                javax.swing.JLabel jLabel1;
                javax.swing.JLabel jLabel2;
                javax.swing.JRadioButton jRadioButton1;
                javax.swing.JRadioButton jRadioButton2;
                javax.swing.JRadioButton jRadioButton3;
                javax.swing.JRadioButton jRadioButton4;
                javax.swing.JRadioButton jRadioButton5;

                buttonGroup1 = new javax.swing.ButtonGroup();
                jButton1 = new javax.swing.JButton();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton2 = new javax.swing.JRadioButton();
                jRadioButton3 = new javax.swing.JRadioButton();
                jRadioButton4 = new javax.swing.JRadioButton();
                jRadioButton5 = new javax.swing.JRadioButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jButton1.setText("Proceed");

                buttonGroup1.add(jRadioButton1);
                jRadioButton1.setText("Create new member");

                buttonGroup1.add(jRadioButton2);
                jRadioButton2.setText("Issue item");

                buttonGroup1.add(jRadioButton3);
                jRadioButton3.setText("Return item");

                buttonGroup1.add(jRadioButton4);
                jRadioButton4.setText("Cancel membership");

                jRadioButton5.setText("Item lost");
                jRadioButton1.setSelected(true);

                jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
                jLabel2.setText("Select the functionality");

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel1.setText("Logged in as Storekeeper");

                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if (jRadioButton1.isSelected() == true) {
                                        getContentPane().removeAll();
                                        repaint();
                                        newMemberWindow();
                                }
                                if (jRadioButton2.isSelected() == true) {
                                        getContentPane().removeAll();
                                        repaint();
                                        issueItemWindow();
                                }
                                if (jRadioButton3.isSelected() == true) {
                                        if (MemberList.memberList.size() == 0) {
                                                Warning warn = new Warning("No registered customers.", true);
                                        } else {
                                                getContentPane().removeAll();
                                                repaint();
                                                returnItemWindow();
                                        }
                                }
                                if (jRadioButton4.isSelected() == true) {
                                        if (MemberList.memberList.size() == 0) {
                                                Warning warn = new Warning("No registered customers.", true);
                                        } else {
                                                getContentPane().removeAll();
                                                repaint();
                                                cancelMembership();
                                        }
                                }
                        }
                });
                try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGap(130, 130, 130)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jRadioButton3)
                                                                                .addComponent(jRadioButton2)
                                                                                .addComponent(jRadioButton4)
                                                                                .addComponent(jRadioButton1)))
                                                .addGroup(layout.createSequentialGroup().addGap(158, 158, 158)
                                                                .addComponent(jButton1))
                                                .addGroup(layout.createSequentialGroup().addGap(23, 23, 23)
                                                                .addComponent(jLabel2)))
                                                .addContainerGap(110, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(33, 33, 33).addComponent(jLabel1).addGap(18, 18, 18)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                pack();
                setVisible(true);
        }

        // Create new Member (Edit components to Frame)
        public void newMemberWindow() {

                javax.swing.ButtonGroup buttonGroup1;
                javax.swing.JButton jButton1;
                javax.swing.JButton jButton2;
                javax.swing.JLabel jLabel1;
                javax.swing.JLabel jLabel2;
                javax.swing.JLabel jLabel3;
                javax.swing.JLabel jLabel4;
                javax.swing.JLabel jLabel5;
                javax.swing.JRadioButton jRadioButton1;
                javax.swing.JRadioButton jRadioButton2;
                javax.swing.JTextField jTextField1;
                javax.swing.JTextField jTextField2;
                javax.swing.JTextField jTextField3;

                buttonGroup1 = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton2 = new javax.swing.JRadioButton();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                ButtonGroup b1 = new ButtonGroup();
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Add Details for customer!");
                jLabel2.setText("Name :");
                jLabel3.setText("Age :");
                jLabel4.setText("Address");
                jLabel5.setText("MemberShip :");

                jRadioButton1.setText("Premium");
                jRadioButton2.setText("Regular");
                jRadioButton1.setSelected(true);
                jButton1.setText("Collect Security and Register");
                jButton1.setToolTipText("");

                jButton2.setText("Back");

                b1.add(jButton1);
                b1.add(jButton2);
                try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                                String name = jTextField1.getText();
                                String address = jTextField3.getText();
                                int age = 0;
                                boolean isPremium = false, warned = false;

                                if (jRadioButton1.isSelected()) {
                                        isPremium = true;
                                }

                                try {
                                        age = Integer.valueOf(jTextField2.getText());
                                } catch (Exception e) {
                                        Warning warn = new Warning("Age should be an integer", true);
                                        warned = true;
                                }

                                if (name.length() == 0 || address.length() == 0) {
                                        Warning warn = new Warning("Name and Address should not be empty", true);
                                        warned = true;
                                }

                                for (int i = 0; i < MemberList.memberList.size(); i++) {
                                        if (MemberList.memberList.get(i).getName().toLowerCase()
                                                        .compareTo(name.toLowerCase()) == 0) {
                                                Warning warn = new Warning("Another entity with similar details exists",
                                                                true);
                                                warned = true;
                                                break;
                                        }
                                }

                                if (warned == false && age != 0) {
                                        Member newMeme = new Member(isPremium, name, age, address);

                                        System.out.println("Registered new member " + newMeme.getName());
                                        MemberList.memberList.add(newMeme);
                                        System.out.println("Total Members : " + MemberList.memberList.size());

                                        int securityMoney = 1000;
                                        String typeMember = "Regular";
                                        if (isPremium == true) {
                                                securityMoney = 1500;
                                                typeMember = "Premium";
                                        }

                                        PlTransaction newTransac = new PlTransaction(
                                                        ("Add " + typeMember + " Member " + newMeme.getName()),
                                                        securityMoney);
                                        Account.plAccount.add(newTransac);
                                        System.out.println(Account.plAccount.size());
                                } else {

                                }
                                getContentPane().removeAll();
                                repaint();
                                newMemberWindow();
                        }
                });

                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGap(190, 190, 190)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                259,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                142,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false).addComponent(jTextField1)
                                                                                .addComponent(jTextField2)
                                                                                .addComponent(jTextField3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                483,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jRadioButton1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jRadioButton2)
                                                                                                .addGap(93, 93, 93))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                295,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                77,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(16, 16, 16)))))
                                                .addContainerGap(39, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                29,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(27, 27, 27)
                                                                                .addComponent(jTextField2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jLabel3))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5).addComponent(jRadioButton1)
                                                                .addComponent(jRadioButton2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28,
                                                                Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton2))
                                                .addContainerGap()));

                pack();
                setVisible(true);
        }// </editor-fold>

        // Issues and item for a customer
        public void issueItemWindow() {

                javax.swing.JButton jButton1;
                javax.swing.JButton jButton2;
                javax.swing.JComboBox jComboBox1;
                javax.swing.JComboBox jComboBox2;
                javax.swing.JLabel jLabel1;
                javax.swing.JLabel jLabel2;
                javax.swing.JLabel jLabel3;

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox();
                jComboBox2 = new javax.swing.JComboBox();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Issue Item");
                jLabel2.setText("CustomerName");
                jLabel3.setText("Item Name");

                String[] memName = new String[MemberList.memberList.size()];

                for (int i = 0; i < MemberList.memberList.size(); i++) {
                        memName[i] = MemberList.memberList.get(i).getName();
                }

                int item_len = 0;

                for (int i = 0; i < inv.itemsList.size(); i++) {
                        if (inv.itemsList.get(i).getItemStatus() == false) {
                                item_len += 1;
                        }
                }

                String[] itemNames = new String[item_len];
                int i2 = 0;

                for (int i = 0; i < inv.itemsList.size(); i++) {
                        if (inv.itemsList.get(i).getItemStatus() == false) {
                                itemNames[i2] = inv.itemsList.get(i).getItemName();
                                i2 += 1;
                        }
                }

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(memName));
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(itemNames));

                jButton1.setText("Issue Item");
                jButton1.setToolTipText("");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                // Handle if Regular Customer has >2 cds musics or ... issued;

                                String mem = (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) + "");
                                String item = (jComboBox2.getItemAt(jComboBox2.getSelectedIndex()) + "");

                                String format = "";
                                int ind = -1;
                                for (int i = 0; i < inv.itemsList.size(); i++) {
                                        if (inv.itemsList.get(i).getItemName().toLowerCase()
                                                        .compareTo(item.toLowerCase()) == 0) {
                                                format = inv.itemsList.get(i).getItemFormat();
                                                ind = 0;
                                                break;
                                        }
                                }
                                if (ind == -1) {
                                        Warning warn = new Warning("Sorry, item not available!", true);
                                } else {
                                        int indx = 0;
                                        for (int i = 0; i < MemberList.memberList.size(); i++) {
                                                if (MemberList.memberList.get(i).getName().toLowerCase()
                                                                .compareTo(mem.toLowerCase()) == 0) {
                                                        int num_music = MemberList.memberList.get(i).getMusic();
                                                        int num_video = MemberList.memberList.get(i).getVideo();

                                                        boolean isPremium = MemberList.memberList.get(i).getIsPremium();

                                                        if (isPremium == false) {
                                                                if (format.toLowerCase().compareTo("music") == 0) {
                                                                        if (num_music < 1) {
                                                                                // Issue it
                                                                                Member me = MemberList.memberList
                                                                                                .get(i);
                                                                                me.issueItem(inv.itemsList.get(ind));

                                                                                MemberList.memberList.set(i, me);
                                                                                // Item it = inv.itemsList.get(ind);
                                                                                // i.set
                                                                                System.out.println(inv.issueAnItem(item,
                                                                                                mem));
                                                                                Warning warn = new Warning(
                                                                                                "Item has been issued. Rental Price: "
                                                                                                                + inv.itemsList.get(
                                                                                                                                ind)
                                                                                                                                .getRentalPrice(),
                                                                                                false);
                                                                                Transaction t1 = new Transaction(mem,
                                                                                                item);
                                                                                Records.records.add(t1);

                                                                                System.out.println(
                                                                                                Records.records.size());
                                                                        } else {
                                                                                Warning warn = new Warning(
                                                                                                "The customer has booked maximum Music CDs",
                                                                                                true);
                                                                        }
                                                                } else {
                                                                        if (num_video < 2) {
                                                                                Member me = MemberList.memberList
                                                                                                .get(i);
                                                                                me.issueItem(inv.itemsList.get(ind));

                                                                                MemberList.memberList.set(i, me);
                                                                                // Item i = inv.itemsList.get(ind);
                                                                                // i.set
                                                                                System.out.println(inv.issueAnItem(item,
                                                                                                mem));
                                                                                Warning warn = new Warning(
                                                                                                "Item has been issued. Rental Price: "
                                                                                                                + inv.itemsList.get(
                                                                                                                                ind)
                                                                                                                                .getRentalPrice(),
                                                                                                false);
                                                                                Transaction t1 = new Transaction(mem,
                                                                                                item);
                                                                                Records.records.add(t1);

                                                                                System.out.println("here");

                                                                                System.out.println(
                                                                                                Records.records.size());
                                                                        } else {
                                                                                Warning warn = new Warning(
                                                                                                "The customer has booked maximum Video CDs",
                                                                                                true);
                                                                        }
                                                                }
                                                                indx = i;
                                                        } else {
                                                                if (format.toLowerCase().compareTo("music") == 0) {
                                                                        if (num_music < 2) {
                                                                                Member me = MemberList.memberList
                                                                                                .get(i);
                                                                                me.issueItem(inv.itemsList.get(ind));

                                                                                MemberList.memberList.set(i, me);
                                                                                // Item i = inv.itemsList.get(ind);
                                                                                // i.set
                                                                                System.out.println(inv.issueAnItem(item,
                                                                                                mem));
                                                                                Warning warn = new Warning(
                                                                                                "Item has been issued. Rental Price: "
                                                                                                                + inv.itemsList.get(
                                                                                                                                ind)
                                                                                                                                .getRentalPrice(),
                                                                                                false);
                                                                                Transaction t1 = new Transaction(mem,
                                                                                                item);
                                                                                Records.records.add(t1);

                                                                                System.out.println(
                                                                                                Records.records.size());
                                                                        } else {
                                                                                Warning warn = new Warning(
                                                                                                "The customer has booked maximum Music CDs",
                                                                                                true);
                                                                        }
                                                                } else {
                                                                        if (num_video < 5) {
                                                                                Member me = MemberList.memberList
                                                                                                .get(i);
                                                                                me.issueItem(inv.itemsList.get(ind));

                                                                                MemberList.memberList.set(i, me);
                                                                                // Item i = inv.itemsList.get(ind);
                                                                                // i.set
                                                                                System.out.println(inv.issueAnItem(item,
                                                                                                mem));
                                                                                Warning warn = new Warning(
                                                                                                "Item has been issued. Rental Price: "
                                                                                                                + inv.itemsList.get(
                                                                                                                                ind)
                                                                                                                                .getRentalPrice(),
                                                                                                false);
                                                                                Transaction t1 = new Transaction(mem,
                                                                                                item);

                                                                                System.out.println("hejre");
                                                                                Records.records.add(t1);

                                                                                System.out.println(
                                                                                                Records.records.size());
                                                                        } else {
                                                                                Warning warn = new Warning(
                                                                                                "The customer has booked maximum Video CDs",
                                                                                                true);
                                                                        }
                                                                }
                                                        }
                                                        break;
                                                }
                                        }

                                }
                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();
                        }
                });

                jButton2.setText("Go Back");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();
                        }
                });
                try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3))
                                                                .addGap(83, 83, 83)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jComboBox1, 0, 248,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jComboBox2, 0,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)))
                                                .addGroup(layout.createSequentialGroup().addGap(171, 171, 171)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                160,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(195, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                95,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(249, 249, 249))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                                .addComponent(jButton2)
                                                                                                .addContainerGap()))));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2).addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(73, 73, 73)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3).addComponent(jComboBox2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44,
                                                                Short.MAX_VALUE)
                                                .addComponent(jButton1).addGap(25, 25, 25).addComponent(jButton2)
                                                .addContainerGap()));

                pack();

                setVisible(true);

        }

        // Cancel the membership for a customer, can only be possible when member
        // doesn't have any unreturned issues
        public void cancelMembership() {
                            try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
                javax.swing.JButton jButton1;
                javax.swing.JButton jButton2;
                javax.swing.JComboBox jComboBox1;
                javax.swing.JLabel jLabel1;

                jLabel1 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                jLabel1.setText("Cancel Membership");

                String[] memName = new String[MemberList.memberList.size()];

                for (int i = 0; i < MemberList.memberList.size(); i++) {
                        memName[i] = MemberList.memberList.get(i).getName();
                }

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(memName));

                jButton1.setText("Go Back");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();
                        }
                });
                jButton2.setText("Generate Amount & Cancel MemberShip");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                String mem = (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) + "");
                                if (mem.length() == 0) {
                                        getContentPane().removeAll();
                                        repaint();
                                        storeKeeperWindow();
                                }
                                for (int i = 0; i < MemberList.memberList.size(); i++) {
                                        if (MemberList.memberList.get(i).getName().toLowerCase()
                                                        .compareTo(mem.toLowerCase()) == 0) {
                                                if (MemberList.memberList.get(i).getMusic() != 0
                                                                || MemberList.memberList.get(i).getVideo() != 0) {
                                                        Warning warn = new Warning(
                                                                        "The customer needs to return items before removal",
                                                                        true);
                                                } else {
                                                        boolean isPrem = MemberList.memberList.get(i).getIsPremium();
                                                        int money = 1000;
                                                        if (isPrem == true) {
                                                                money = 1500;
                                                        }
                                                        PlTransaction pl = new PlTransaction(
                                                                        "Cancelling " + MemberList.memberList.get(i)
                                                                                        .getName() + "'s membership",
                                                                        -1500);
                                                        Account.plAccount.add(pl);
                                                        MemberList.memberList.remove(i);
                                                        Warning warn = new Warning("Cancelled membership for " + mem,
                                                                        false);

                                                }
                                                break;
                                        }
                                }

                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(jButton1))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(83, 83, 83)
                                                                                .addComponent(jComboBox1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                253,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(83, 83, 83)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                319,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 66, Short.MAX_VALUE)))
                                                .addContainerGap())
                                .addGroup(layout.createSequentialGroup().addGap(142, 142, 142).addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
                                                .addGap(38, 38, 38)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75,
                                                                Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30).addComponent(jButton1).addContainerGap()));

                if (MemberList.memberList.size() == 0) {

                        System.out.println(MemberList.memberList.size());
                        getContentPane().removeAll();
                        repaint();
                        storeKeeperWindow();
                }

                pack();
                setVisible(true);
        }

        // Return the issued item
        public void returnItemWindow() {

                javax.swing.JButton jButton1;
                javax.swing.JButton jButton2;
                javax.swing.JComboBox jComboBox1;
                javax.swing.JLabel jLabel1;
                javax.swing.JLabel jLabel2;

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Item Return Window");
                jLabel2.setText("Customer Name");

                int cust_len = 0;

                String[] memName = new String[MemberList.memberList.size()];
                for (int i = 0; i < MemberList.memberList.size(); i++) {
                        memName[i] = MemberList.memberList.get(i).getName();
                }

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(memName));

                if (memName.length == 0) {
                        Warning warn = new Warning("No members added", true);
                        getContentPane().removeAll();
                        repaint();
                        storeKeeperWindow();
                }

                jButton1.setText("Go Back");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();
                        }
                });

                jButton2.setText("Get Details");
                jButton2.setToolTipText("");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                String tmp = (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) + "");
                                returnCustomerName = tmp;
                                System.out.println(returnCustomerName);
                                getContentPane().removeAll();
                                repaint();
                                returnItemPoint();
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(225, 225, 225)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                252,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(33, 33, 33)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                183,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jComboBox1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                383,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                layout.createSequentialGroup()
                                                                                                                                .addComponent(jButton2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                238,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(109, 109,
                                                                                                                                                109)))))
                                                                .addGap(0, 76, Short.MAX_VALUE)))
                                                .addContainerGap()));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94,
                                                                Short.MAX_VALUE)
                                                .addComponent(jButton1).addContainerGap()));

                pack();
                setVisible(true);
        }// </editor-fold>

        // Frame for returning the item
        public void returnItemPoint() {
             
                javax.swing.ButtonGroup buttonGroup1;
                javax.swing.JButton jButton1;
                javax.swing.JButton jButton2;
                javax.swing.JComboBox jComboBox1;
                javax.swing.JLabel jLabel1;
                javax.swing.JRadioButton jRadioButton1;
                javax.swing.JRadioButton jRadioButton2;

                buttonGroup1 = new javax.swing.ButtonGroup();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jComboBox1 = new javax.swing.JComboBox();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton2 = new javax.swing.JRadioButton();
                jLabel1 = new javax.swing.JLabel();

                String name = returnCustomerName;
                int itemLen = 0;

                for (int i = 0; i < Records.records.size(); i++) {
                        if (Records.records.get(i).getCustomer().toLowerCase().compareTo(name.toLowerCase()) == 0) {
                                itemLen += 1;
                        }
                }

                String[] relevantRec = new String[itemLen];
                int ind = 0;
                System.out.println(Records.records.size());

                for (int i = 0; i < Records.records.size(); i++) {
                        if (Records.records.get(i).getCustomer().toLowerCase().compareTo(name.toLowerCase()) == 0) {
                                relevantRec[ind] = Records.records.get(i).getCd_Name();
                                ind += 1;
                        }
                }
                System.out.println("hi");
                for (int i = 0; i < Records.records.size(); i++) {
                        System.out.println(Records.records.get(i).getCustomer());
                        System.out.println(Records.records.get(i).getCd_Name());
                }
                System.out.println(relevantRec.length);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jButton1.setText("Go Back");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();
                        }
                });
               try {
                rstore.update_db(con, inv);
            } catch (Exception ex) {
                Logger.getLogger(swingWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
                jButton2.setText("Mark as returned");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                String custName = returnCustomerName;
                                String itemName = (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) + "");
                                Date currentDat = new Date();
                                Date transDate;
                                try {
                                        Item it = new Item("dum", 21, 42, "CD", "music");
                                        int i = 0;
                                        for (i = 0; i < inv.itemsList.size(); i++) {
                                                if (inv.itemsList.get(i).getItemName().toLowerCase()
                                                                .compareTo(itemName.toLowerCase()) == 0) {
                                                        it = inv.itemsList.get(i);
                                                        inv.itemsList.remove(i);
                                                }
                                        }
                                        int costPrice = it.getCostPrice();
                                        int RentalPrice = it.getRentalPrice();

                                        it.dateOfLastActivity = currentDat;
                                        it.itemStatus = false;
                                        if (jRadioButton2.isSelected() != true) {
                                                inv.itemsList.add(it);
                                        }
                                        for (i = 0; i < Records.records.size(); i++) {
                                                if (Records.records.get(i).getCustomer().toLowerCase()
                                                                .compareTo(custName.toLowerCase()) == 0
                                                                && Records.records.get(i).getCd_Name().toLowerCase()
                                                                                .compareTo(itemName
                                                                                                .toLowerCase()) == 0) {
                                                        break;
                                                }
                                        }
                                        transDate = Records.records.get(i).getDate();
                                        Records.records.remove(i);

                                        Member m1 = new Member(false, "dummy", 21, "test");
                                        int amountNet = m1.calculateDuration(transDate, currentDat) * RentalPrice;
                                        if (jRadioButton2.isSelected() == true) {
                                                amountNet += costPrice;
                                        }
                                        if (it.getItemFormat().toLowerCase().compareTo("music") == 0) {
                                                for (i = 0; i < MemberList.memberList.size(); i++) {
                                                        if (MemberList.memberList.get(i).getName().toLowerCase()
                                                                        .compareTo(custName.toLowerCase()) == 0) {
                                                                m1 = MemberList.memberList.get(i);
                                                                m1.music_cds_issued -= 1;

                                                                MemberList.memberList.remove(i);
                                                                MemberList.memberList.add(m1);
                                                        }
                                                }
                                        } else {
                                                for (i = 0; i < MemberList.memberList.size(); i++) {
                                                        if (MemberList.memberList.get(i).getName().toLowerCase()
                                                                        .compareTo(custName.toLowerCase()) == 0) {
                                                                m1 = MemberList.memberList.get(i);
                                                                m1.video_cds_issued -= 1;

                                                                MemberList.memberList.remove(i);
                                                                MemberList.memberList.add(m1);
                                                        }
                                                }
                                        }
                                        PlTransaction p1 = new PlTransaction("Transaction with " + custName, amountNet);
                                        Account.plAccount.add(p1);
                                        Warning warn = new Warning(("Please collect " + amountNet), false);

                                } catch (Exception e) {

                                }
                                getContentPane().removeAll();
                                repaint();
                                storeKeeperWindow();

                        }
                });

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(relevantRec));

                jRadioButton1.setText("Return Item");

                jRadioButton2.setText("Mark Item as lost");

                jLabel1.setText("Select Item");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1))
                                                .addGroup(layout.createSequentialGroup().addGap(246, 246, 246)
                                                                .addComponent(jButton2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                235,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())
                                .addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jRadioButton1)
                                                                                .addGap(58, 58, 58)
                                                                                .addComponent(jRadioButton2))
                                                                .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                371,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(139, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup().addGap(78, 78, 78).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(56, 56, 56)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jRadioButton1)
                                                                .addComponent(jRadioButton2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56,
                                                                Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1).addContainerGap()));

                pack();
                if (relevantRec.length == 0) {
                        Warning warn = new Warning("This customer has no item registered with him", true);
                        getContentPane().removeAll();
                        repaint();
                        storeKeeperWindow();

                }
                setVisible(true);
        }

        public void checkProfitLoss() {
            

        javax.swing.JButton jButton1;
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel2;
        javax.swing.JLabel jLabel3;
        javax.swing.JLabel jLabel4;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Profit/Loss");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        int income = Account.calculateIncoming();
        jLabel2.setText("Net Incoming Sum is Rs " + income);

        jButton1.setText("Check the list of Transactions");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        int outgoing = Account.calculateOutgoing();
        jLabel3.setText("Net Outgoing Sum is Rs " + outgoing);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Net profit is Rs " + (income + outgoing));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(89, 89, 89).addComponent(jButton1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addGap(29, 29, 29).addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(73, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4)
                        .addGap(36, 36, 36).addComponent(jButton1).addContainerGap(86, Short.MAX_VALUE)));

        pack();
        remove(jButton1);
        setVisible(true);
    }// </editor-fold>
    

//        public void displaylist(){
//
//        javax.swing.JLabel jLabel2;
//        javax.swing.JScrollPane jScrollPane1;
//        javax.swing.JTable jTable1;
//
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTable1 = new javax.swing.JTable();
//        jLabel2 = new javax.swing.JLabel();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        String[][] tab=new String[Account.plAccount.size()][4];
//        for(int i=0;i<Account.plAccount.size();i++)
//        {
//            tab[i][0]=String.valueOf(Account.plAccount.get(i).id);
//            tab[i][3]=String.valueOf(Account.plAccount.get(i).amount);
//            tab[i][2]=(Account.plAccount.get(i).activity);
//
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
//            String strDate = dateFormat.format(Account.plAccount.get(i).plDate);  
//            tab[i][1]=strDate;
//        }
//        jTable1.setModel(new javax.swing.table.DefaultTableModel(
//            tab,
//            new String [] {
//                "ID", "Transaction Date", "Description", "Amount"
//            }
//        ) {
//            boolean[] canEdit = new boolean [] {
//                false, false, false, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jScrollPane1.setViewportView(jTable1);
//        if (jTable1.getColumnModel().getColumnCount() > 0) {
//            jTable1.getColumnModel().getColumn(0).setMinWidth(20);
//            jTable1.getColumnModel().getColumn(1).setMinWidth(120);
//            jTable1.getColumnModel().getColumn(2).setMinWidth(400);
//            jTable1.getColumnModel().getColumn(3).setMinWidth(40);
//        }
//
//        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
//        jLabel2.setText("Profit Loss Account Transaction Sheet");
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(51, 51, 51)
//                .addComponent(jLabel2)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
//                .addContainerGap())
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                .addGap(34, 34, 34)
//                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(18, 18, 18)
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
//        );
//
//        pack();
//        setVisible(true);
//    }
        public String returnCustomerName;
        public Password pass; // Password
        public Rentalstore rstore;
        public Connection con;
        public Inventory inv;
        public MemberList memberList;
        public Account account;
}
