import javax.swing.*;

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
        public swingWindows(password p1, Inventory inven) {
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

                this.inv = inven;
                pass = p1; // password
                initComponents();

        }

        /**
         * Initialzes with the starting screen.
         */

        private void initComponents() {

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
                jLabel2.setText("Storekeeper");

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

        }// </editor-fold>//GEN-END:initComponents

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
        ///////// End of main starting window and functions.////////
        ////////////////////////////////////////////////////////////

        // The code for manager functions window
        public void managerWindow() {
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

        public void managerFunctionalityHandler(java.awt.event.ActionEvent evt, JRadioButton jRadioButton1,
                        JRadioButton jRadioButton2) {
                if (jRadioButton1.isSelected()) {
                        getContentPane().removeAll();
                        repaint();
                        addEntryWindow();
                } else {
                        System.out.println("Checking profit loss");
                }

        }

        // Code for the window lett
        private void addEntryWindow() {

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

                typeButtons.add(jRadioButton1);
                typeButtons.add(jRadioButton2);

                label1.setText("Item Format");

                jRadioButton3.setText("VHS");
                jRadioButton4.setText("MP4");
                jRadioButton5.setText("Music");

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
                                        inv.addItem(ItemName, Rental, Cost, ItemType, ItemFormat);
                                }

                                addEntryWindow();
                        }
                });

                jButton2.setText("Go Back");

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
                jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton1ActionPerformed(evt);
                        }
                });

                buttonGroup1.add(jRadioButton2);
                jRadioButton2.setText("Issue item");

                buttonGroup1.add(jRadioButton3);
                jRadioButton3.setText("Return item");

                buttonGroup1.add(jRadioButton4);
                jRadioButton4.setText("Cancel membership");

                buttonGroup1.add(jRadioButton5);
                jRadioButton5.setText("Item lost");

                jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
                jLabel2.setText("Select the functionality");

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel1.setText("Logged in as Storekeeper");

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
                                                                                .addComponent(jRadioButton5)
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
                                                .addComponent(jRadioButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                pack();
                setVisible(true);
        }

        // Make this separate for Manager and StoreKeeper.
        private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        // Make this separate for Manager and StoreKeeper.

        private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        public int failedLogin; // 0 for first attempt
        public password pass;
        public Inventory inv;
}
