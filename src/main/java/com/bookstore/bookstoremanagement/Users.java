package com.bookstore.bookstoremanagement;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author MustafaK01
 */
public class Users extends javax.swing.JFrame {

    public Users(boolean x) {
        initComponents();
        DisplayUsers();
        userIdTextField.setEditable(x);
    }
    private Users() {
        JOptionPane.showMessageDialog(this,"Lütfen Giriş Yapınız");
        System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitUsersMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        userPasswordTextField = new javax.swing.JTextField();
        userPhoneTextField = new javax.swing.JTextField();
        userIdTextField = new javax.swing.JTextField();
        userAdressTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        resetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        getBooksMenuLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.gray);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.white);

        exitUsersMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        exitUsersMenu.setText("X");
        exitUsersMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitUsersMenuMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Book Store Management");

        logoutButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226)
                .addComponent(logoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitUsersMenu))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(exitUsersMenu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel4.setText("ID");

        jLabel5.setText("Phone");

        jLabel6.setText("Name");

        jLabel7.setText("Address");

        jLabel9.setText("Password");

        editButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        editButton.setText("Edit");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        printButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        printButton.setText("Print");
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address", "Password"
            }
        ));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        resetButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        jPanel2.setBackground(java.awt.Color.gray);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Users");

        getBooksMenuLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getBooksMenuLabel.setForeground(java.awt.Color.white);
        getBooksMenuLabel.setText("Books");
        getBooksMenuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBooksMenuLabelMouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(getBooksMenuLabel)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getBooksMenuLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setForeground(java.awt.Color.black);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(userPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(userAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(userPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(65, 65, 65)
                        .addComponent(editButton)
                        .addGap(65, 65, 65)
                        .addComponent(deleteButton)
                        .addGap(65, 65, 65)
                        .addComponent(resetButton)
                        .addGap(144, 144, 144)
                        .addComponent(printButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(267, 267, 267))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editButton)
                            .addComponent(saveButton)
                            .addComponent(deleteButton)
                            .addComponent(resetButton))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection connect=null;
    Statement statement=null;
    Statement statement2=null;
    ResultSet resultSet=null;
    ResultSet resultSet2=null;
    private void lastUserIdChecker(){
        try {
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
            statement=connect.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM User ORDER BY user_id DESC LIMIT 1");
            resultSet.next();
            int id;
            id = resultSet.getInt(1)+1;
            userIdTextField.setText(id+"");
        } catch (Exception e) {
        }
        
    }
    private void DisplayUsers(){
        try {
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
            statement=connect.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM User WHERE user_id");
            String columns[] = { "Id", "Name", "Phone","Address","Password"};
            String data[][] = new String[100][5];
            int i = 0;
            while (resultSet.next()) {
            int id = resultSet.getInt("user_id");
            String name = resultSet.getString("user_name");
            String address = resultSet.getString("user_address");
            String phone = resultSet.getString("user_phone");
            String password = resultSet.getString("user_password");
            data[i][0] = id+"";
            data[i][1] = name;
            data[i][2] = phone;
            data[i][3] = address;
            data[i][4] = password;
            i++;
        }
    
        DefaultTableModel model = new DefaultTableModel(data, columns);
        usersTable.setModel(model);
    
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this,"Lütfen Benzersiz Bir Fatura Numarası Giriniz");        }
    }
    private void reset(){
        userIdTextField.setText("");
        userNameTextField.setText("");
        userAdressTextField.setText("");
        userPhoneTextField.setText("");
        userPasswordTextField.setText("");
    }
    private void exitUsersMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitUsersMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitUsersMenuMouseClicked

    private void getBooksMenuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBooksMenuLabelMouseClicked
        new Books(true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_getBooksMenuLabelMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
           try {
            usersTable.print();
        } catch (Exception e) {
        }   
    }//GEN-LAST:event_printButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
         if(userNameTextField.getText().isEmpty()||userPhoneTextField.getText().isEmpty()||userAdressTextField.getText().isEmpty()||userPasswordTextField.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Lütfen Alanları Doldurun");
        }
        else{
               lastUserIdChecker();
            try{
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                statement=connect.createStatement();
                statement2=connect.createStatement();
                resultSet=statement.executeQuery("SELECT * FROM User WHERE user_name LIKE '%"+userNameTextField.getText()+"%'");
                resultSet2=statement2.executeQuery("SELECT * FROM User WHERE user_address LIKE '%"+userAdressTextField.getText()+"%'");
                if(resultSet.next()&&resultSet2.next()){
                    JOptionPane.showMessageDialog(this,"Kullanıcı Zaten Bulunmakta");
                }
                else{
                    //Class.forName("com.mysql.cj.jdbc.Driver"); 
                    connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                    PreparedStatement addToTable=connect.prepareStatement("INSERT INTO User Values(?,?,?,?,?)");
                    addToTable.setInt(1,Integer.valueOf(userIdTextField.getText()));
                    addToTable.setString(2, userNameTextField.getText());
                    addToTable.setString(3, userPhoneTextField.getText());
                    addToTable.setString(4, userAdressTextField.getText());
                    addToTable.setString(5, userPasswordTextField.getText());
                    int row = addToTable.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Kullanıcı "+userIdTextField.getText()+" id numarasıyla Eklendi !!");
                  
                    //connect.close();
                    //statement=connect.createStatement();
                    //resultSet=statement.executeQuery(string)
                    DisplayUsers();
                    reset();
                   }
               }
            catch(Exception e){
               e.printStackTrace();
            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
       reset();
    }//GEN-LAST:event_resetButtonMouseClicked

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
        int index = usersTable.getSelectedRow();
        userIdTextField.setText(model.getValueAt(index,0).toString());
        userNameTextField.setText(model.getValueAt(index,1).toString());
        userPhoneTextField.setText(model.getValueAt(index,2).toString());
        userAdressTextField.setText(model.getValueAt(index,3).toString());
        userPasswordTextField.setText(model.getValueAt(index,4).toString());
    }//GEN-LAST:event_usersTableMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
           if(userIdTextField.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Lütfen Silmek İstediğiniz Kullanıcının ID sini Girin");
        }
        else{
               try{
                
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                String userId=userIdTextField.getText();
                String sorgu = "DELETE FROM User WHERE user_id="+userId;
                Statement statementDelete = connect.createStatement();
                statementDelete.executeUpdate(sorgu);
                JOptionPane.showMessageDialog(this,"Kullanıcı Silindi !!");
                  
                //connect.close();
                //statement=connect.createStatement();
                //resultSet=statement.executeQuery(string)
                DisplayUsers();
                reset();
               }
            catch(Exception e){
               e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
          if(userNameTextField.getText().isEmpty()||userAdressTextField.getText().isEmpty()||userPhoneTextField.getText().isEmpty()||userPasswordTextField.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Lütfen Güncellemek İstediğiniz Kullanıcıyı Seçin");
        }
        else{
               try{
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                String userId=userIdTextField.getText();
                String sorgu = "Update User set"+" user_name=?,user_phone=?,user_address=?,user_password=?"+"WHERE user_id="+userId;
                PreparedStatement preparedStatement = connect.prepareStatement(sorgu);
                preparedStatement.setString(1, userNameTextField.getText());
                preparedStatement.setString(2, userPhoneTextField.getText());
                preparedStatement.setString(3, userAdressTextField.getText());
                preparedStatement.setString(4, userPasswordTextField.getText());
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this,"Kullanıcı Güncellendi !!");
                DisplayUsers();
                reset();
               }
            catch(Exception e){
               e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel exitUsersMenu;
    private javax.swing.JLabel getBooksMenuLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField userAdressTextField;
    private javax.swing.JTextField userIdTextField;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JTextField userPasswordTextField;
    private javax.swing.JTextField userPhoneTextField;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
