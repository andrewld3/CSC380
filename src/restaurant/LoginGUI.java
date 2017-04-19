/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author RandyNguyen
 */
public class LoginGUI extends javax.swing.JFrame {

    static Employee emp;

    /**
     * Creates new form RestaurantGUI
     */
    public LoginGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPane = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        UsernameTextField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        UsernameLabel = new javax.swing.JLabel();
        PinField = new javax.swing.JPasswordField();
        PinLabel = new javax.swing.JLabel();
        EmployeeContentPane = new javax.swing.JPanel();
        EmployeePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AdminContentPane = new javax.swing.JPanel();
        AdminPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ContentPane.setBackground(new java.awt.Color(102, 102, 102));
        ContentPane.setPreferredSize(new java.awt.Dimension(1200, 750));
        ContentPane.setSize(new java.awt.Dimension(1200, 750));
        ContentPane.setLayout(new java.awt.CardLayout());

        LoginPanel.setBackground(new java.awt.Color(102, 102, 102));
        LoginPanel.setBorder(new javax.swing.border.MatteBorder(null));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1368, 744, 150, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UsernameTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        LoginButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        LoginButton.setText("Log In");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        UsernameLabel.setText("Username");

        PinField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        PinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PinLabel.setText("Pin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PinField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PinField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        LoginPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 500, 320));

        ContentPane.add(LoginPanel, "card3");

        EmployeeContentPane.setLayout(new java.awt.CardLayout());

        EmployeePanel.setPreferredSize(new java.awt.Dimension(1200, 750));
        EmployeePanel.setSize(new java.awt.Dimension(1200, 750));

        jLabel1.setText("Employee");

        javax.swing.GroupLayout EmployeePanelLayout = new javax.swing.GroupLayout(EmployeePanel);
        EmployeePanel.setLayout(EmployeePanelLayout);
        EmployeePanelLayout.setHorizontalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1526, Short.MAX_VALUE)
            .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmployeePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EmployeePanelLayout.setVerticalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmployeePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        EmployeeContentPane.add(EmployeePanel, "card2");

        ContentPane.add(EmployeeContentPane, "card3");

        AdminContentPane.setPreferredSize(new java.awt.Dimension(1200, 750));
        AdminContentPane.setSize(new java.awt.Dimension(1200, 750));
        AdminContentPane.setLayout(new java.awt.CardLayout());

        jLabel2.setText("Admin");

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1526, Short.MAX_VALUE)
            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdminPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdminPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        AdminContentPane.add(AdminPanel, "card2");

        ContentPane.add(AdminContentPane, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1526, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try {
            // TODO add your handling code here:

            //UsernameTextField.getSelectedText() +
            Login login = new Login();
            String pin = new String(PinField.getPassword());
            emp = login.signIn(UsernameTextField.getText(), pin);
            if (emp != null) {
                if (emp.admin == false) {

                    LoginPanel.setVisible(false);
                    AdminContentPane.setVisible(false);
                    EmployeeContentPane.setVisible(true);
                } else {
                    LoginPanel.setVisible(false);
                    EmployeeContentPane.setVisible(false);
                    AdminContentPane.setVisible(true);
                }
            }

        } catch (IOException ex) {
            System.out.println("IO Exception.");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });

        Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
        initialize(menu);

    }

    public static void initialize(Map<String, MenuItem> menu) throws IOException {
        File inFile = new File("menu.txt");
        Scanner inFileSC = new Scanner(inFile);

        while (inFileSC.hasNext()) {
            String name = inFileSC.nextLine();
            double price = Double.parseDouble(inFileSC.nextLine());
            int inventory = Integer.parseInt(inFileSC.nextLine());
            loadMenu(name, price, inventory, menu);
        }
    }

    public static void loadMenu(String name, double price, int inventory, Map<String, MenuItem> menu) {

        MenuItem item = new MenuItem(name, price, inventory);
        menu.put(item.getName(), item);
    }

    static public Employee getEmployee() {
        return emp;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminContentPane;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel ContentPane;
    private javax.swing.JPanel EmployeeContentPane;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PinField;
    private javax.swing.JLabel PinLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}