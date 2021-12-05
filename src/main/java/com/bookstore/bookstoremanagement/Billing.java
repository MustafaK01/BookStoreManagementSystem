package com.bookstore.bookstoremanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MustafaK01
 */
public class Billing extends javax.swing.JFrame {

    public Billing(String userName) {
        initComponents();
        DisplayBooks();
        lastBillNoChecker();
        bookNameTextField.setEditable(false);
        priceTextField.setEditable(false);
        billText.setEditable(false);
        sellerNameTextField.setEditable(false);
        userNameLabel.setText(userName);
        billNoTextField.setEditable(false);

    }

    private Billing() {
        JOptionPane.showMessageDialog(this,"Lütfen Giriş Yapınız !!");
        System.exit(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        addToBillButton = new javax.swing.JButton();
        clientNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        bookNameTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitBillingMenu = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        billText = new javax.swing.JTextArea();
        totalLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        billNoTextField = new javax.swing.JTextField();
        billNoLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sellerNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        printButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        printButton.setText("Print");
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });

        jLabel5.setText("Price");

        addToBillButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        addToBillButton.setText("Add To Bill");
        addToBillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToBillButtonMouseClicked(evt);
            }
        });

        jLabel6.setText("Book Name");

        jLabel7.setText("Quantity");

        jLabel4.setText("Client Name");

        jPanel1.setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Book Store Management");

        exitBillingMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        exitBillingMenu.setText("X");
        exitBillingMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBillingMenuMouseClicked(evt);
            }
        });

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
                .addGap(334, 334, 334)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBillingMenu))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(exitBillingMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Stock", "Category", "Price"
            }
        ));
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booksTable);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Books Bill");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        billText.setColumns(20);
        billText.setRows(5);
        jScrollPane2.setViewportView(billText);

        totalLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 15)); // NOI18N
        totalLabel.setText("Total Price");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setText("Books List");

        resetButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        billNoLabel.setText("Bill No : ");

        userNameLabel.setText("User");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel3.setText("Welcome : ");

        jLabel10.setText("Seller Name : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(217, 217, 217)
                                .addComponent(jLabel10)
                                .addGap(3, 3, 3)
                                .addComponent(sellerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printButton)
                            .addComponent(totalLabel))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(billNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(billNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addToBillButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(clientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(priceTextField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(userNameLabel))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(424, 424, 424))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addToBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(billNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billNoLabel)
                    .addComponent(jLabel10)
                    .addComponent(sellerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLabel)))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection connect=null;
    Statement statement=null;
    ResultSet resultSet=null;
    private void lastBillNoChecker(){
        try {
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
            statement=connect.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM Bill ORDER BY bill_number DESC LIMIT 1");
            resultSet.next();
            int id;
            id = resultSet.getInt(1)+1;
            billNoTextField.setText(id+"");
        } catch (Exception e) {
        }
        
    }
    private void DisplayBooks(){
        try {
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
            statement=connect.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM Book WHERE book_id");
            String columns[] = { "Id", "Title", "Author","Stock","Category","Price" };
            String data[][] = new String[100][6];
            int i = 0;
            while (resultSet.next()) {
            int id = resultSet.getInt("book_id");
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            int stock = resultSet.getInt("stock");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            data[i][0] = id +"";
            data[i][1] = title;
            data[i][2] = author;
            data[i][3] = stock+"";
            data[i][4] = category;
            data[i][5] = price+"";
            i++;
        }
    
        DefaultTableModel model = new DefaultTableModel(data, columns);
        booksTable.setModel(model);
    
        }catch(SQLException e) {
        e.printStackTrace();
        }
    }
    private void reset(){
        bookNameTextField.setText("");
        quantityTextField.setText("");
        priceTextField.setText("");
        clientNameTextField.setText("");
        totalLabel.setText("Total");
        labelTotal=0;
        billText.setText("");
        i=0;
        lastBillNoChecker();
    }
    int bookId;
    private void update(){
    int newSt = st-Integer.valueOf(quantityTextField.getText());
        try{
        connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
        //String sorgu = "Update Book set"+"stock=?"+" WHERE book_id="+bookId;
        String sorgu = "Update Book set stock=? WHERE book_id=?";
        PreparedStatement preparedStatement = connect.prepareStatement(sorgu);
        preparedStatement.setInt(1, newSt);
        preparedStatement.setInt(2,bookId);
        preparedStatement.executeUpdate();
       
        //Statement update= connect.createStatement();
        //update.executeUpdate(sorgu);
        JOptionPane.showMessageDialog(this,"Stok Güncellendi !!");
        DisplayBooks();
        }
       catch(Exception e){
            e.printStackTrace();
        }
    }
    private void save(){
    if(billNoTextField.getText().isEmpty()||clientNameTextField.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Lütfen Alanları Doldurun");
        }
        else{
               try{
                //Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                PreparedStatement addToTable=connect.prepareStatement("INSERT INTO Bill Values(?,?,?,?,?)");
                addToTable.setInt(1,Integer.valueOf(billNoTextField.getText()));
                addToTable.setString(2, userNameLabel.getText());
                addToTable.setString(3, clientNameTextField.getText());
                addToTable.setInt(4,labelTotal);
                addToTable.setString(5, sellerNameTextField.getText());
                addToTable.executeUpdate();
                JOptionPane.showMessageDialog(this,"Fatura Kaydedildi !!");
               }
            catch (SQLException e){
                JOptionPane.showMessageDialog(this,"Lütfen Benzersiz Bir Fatura Numarası Giriniz");
            }
        }
    }
    private void exitBillingMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBillingMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBillingMenuMouseClicked
    int st=0;
    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked

        try {
            DefaultTableModel model = (DefaultTableModel) booksTable.getModel();
            int index = booksTable.getSelectedRow();
            bookId = Integer.valueOf(model.getValueAt(index, 0).toString());
            bookNameTextField.setText(model.getValueAt(index,1).toString());
            quantityTextField.setText(model.getValueAt(index,3).toString());
            sellerNameTextField.setText(userNameLabel.getText());
            priceTextField.setText(model.getValueAt(index,5).toString());
            st=Integer.valueOf(model.getValueAt(index,3).toString());
        } 
        catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(this,"Lütfen Faturaya Eklemek İstediğiniz Kitabı Seçin !!");

        }

    }//GEN-LAST:event_booksTableMouseClicked
int i=0, total=0,labelTotal=0;
    private void addToBillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToBillButtonMouseClicked
        try {
            if(quantityTextField.getText().isEmpty()||bookNameTextField.getText().isEmpty()||priceTextField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Lütfen Faturaya Eklemek İstediğiniz Kitabı Seçin");
            }        
            else if(Integer.valueOf(quantityTextField.getText())>st){
              JOptionPane.showMessageDialog(this,"Yeterli Stok Bulunmamakta");
            }
            else{
               i++;
               total=Integer.valueOf(priceTextField.getText())*Integer.valueOf(quantityTextField.getText());
               if(i==1){
                   billText.setText(billText.getText()+"---------BOOK SHOP---------\n\n");
                }
                else{
                    billText.setText(billText.getText()+"Sipariş No : "+(i-1)+"\n\tKitap İsmi : "+bookNameTextField.getText()+"\n\tKitap Tane Fiyatı : "+priceTextField.getText()+"\n\tSatın Alınan Kitap Miktarı : "+quantityTextField.getText()+"\n\tToplam Fiyat : "+total+"\n");
                    labelTotal=labelTotal+total;
                    totalLabel.setText("Toplam : "+labelTotal);
                    update();
                    }
                }            
        } catch (Exception e) {
        }

    }//GEN-LAST:event_addToBillButtonMouseClicked

    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
          try {
            billText.print();
            save();
            //reset();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printButtonMouseClicked

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        reset();
    }//GEN-LAST:event_resetButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        new Login().setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_logoutButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBillButton;
    private javax.swing.JLabel billNoLabel;
    private javax.swing.JTextField billNoTextField;
    private javax.swing.JTextArea billText;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JTable booksTable;
    private javax.swing.JTextField clientNameTextField;
    private javax.swing.JLabel exitBillingMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField sellerNameTextField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
