
package com.bookstore.bookstoremanagement;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author MustafaK01
 */
public class Books extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    private Books() {
        JOptionPane.showMessageDialog(this,"Lütfen Giriş Yapınız");
        System.exit(0);
    } 
    public Books(boolean x) {
       initComponents();
       DisplayBooks();
       bookIdTextField.setEditable(x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        bookNameTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        bookDeleteButton = new javax.swing.JButton();
        bookAuthorTextField = new javax.swing.JTextField();
        bookIdTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        getUsersMenuLabel = new javax.swing.JLabel();
        getBooksMenuLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        stockTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        bookEditButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bookSaveButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bookResetButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitBooksMenu = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bookCategoryComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel9.setText("Price");

        bookDeleteButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        bookDeleteButton.setText("Delete");
        bookDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookDeleteButtonMouseClicked(evt);
            }
        });

        jPanel2.setBackground(java.awt.Color.gray);

        getUsersMenuLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getUsersMenuLabel.setForeground(java.awt.Color.white);
        getUsersMenuLabel.setText("Users");
        getUsersMenuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getUsersMenuLabelMouseClicked(evt);
            }
        });

        getBooksMenuLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getBooksMenuLabel.setForeground(java.awt.Color.white);
        getBooksMenuLabel.setText("Books");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(getUsersMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(getBooksMenuLabel)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(getBooksMenuLabel))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getUsersMenuLabel)
                .addContainerGap(15, Short.MAX_VALUE))
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

        bookEditButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        bookEditButton.setText("Edit");
        bookEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookEditButtonMouseClicked(evt);
            }
        });

        jLabel5.setText("Author");

        bookSaveButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        bookSaveButton.setText("Save");
        bookSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSaveButtonMouseClicked(evt);
            }
        });

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

        jLabel6.setText("Name");

        jLabel7.setText("Stock");

        bookResetButton.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        bookResetButton.setText("Reset");
        bookResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookResetButtonMouseClicked(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Book Store Management");

        exitBooksMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        exitBooksMenu.setText("X");
        exitBooksMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBooksMenuMouseClicked(evt);
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
                .addComponent(exitBooksMenu))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(exitBooksMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("ID");

        bookCategoryComboBox.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bookCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programming", "Physics", "Chemistry", "Biologiy", "Sci-fi", "Detective", "Psychology", "Novels" }));

        jLabel10.setText("Category");

        printButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        printButton.setText("Print");
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bookAuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(stockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(bookCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(165, 165, 165))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel7)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel10)
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(bookSaveButton)
                        .addGap(65, 65, 65)
                        .addComponent(bookEditButton)
                        .addGap(65, 65, 65)
                        .addComponent(bookDeleteButton)
                        .addGap(65, 65, 65)
                        .addComponent(bookResetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(printButton))
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookAuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookEditButton)
                            .addComponent(bookSaveButton)
                            .addComponent(bookDeleteButton)
                            .addComponent(bookResetButton))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void lastBookIdChecker(){
        try {
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
            statement=connect.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM Book ORDER BY book_id DESC LIMIT 1");
            resultSet.next();
            int id;
            id = resultSet.getInt(1)+1;
            bookIdTextField.setText(id+"");
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
        bookIdTextField.setText("");
        bookNameTextField.setText("");
        bookAuthorTextField.setText("");
        stockTextField.setText("");
        bookCategoryComboBox.setSelectedIndex(0);
        priceTextField.setText("");
    }
                    
    private void exitBooksMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBooksMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBooksMenuMouseClicked

    private void bookResetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookResetButtonMouseClicked
        reset();
    }//GEN-LAST:event_bookResetButtonMouseClicked

    private void bookDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookDeleteButtonMouseClicked
        if(bookIdTextField.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Lütfen Silmek İstediğiniz Kitabın ID sini Girin");
        }
        else{
               try{
                
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                String bookId=bookIdTextField.getText();
                String sorgu = "DELETE FROM Book WHERE book_id="+bookId;
                Statement statementDelete = connect.createStatement();
                statementDelete.executeUpdate(sorgu);
                JOptionPane.showMessageDialog(this,"Kitap Silindi !!");
                  
                //connect.close();
                //statement=connect.createStatement();
                //resultSet=statement.executeQuery(string)
                DisplayBooks();
                reset();
               }
            catch(Exception e){
               e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bookDeleteButtonMouseClicked

    private void bookSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookSaveButtonMouseClicked
        if(bookNameTextField.getText().isEmpty()||bookAuthorTextField.getText().isEmpty()||bookCategoryComboBox.getSelectedIndex()==-1||stockTextField.getText().isEmpty()||priceTextField.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Lütfen Alanları Doldurun");
        }
        else{
            lastBookIdChecker();
               try{
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                statement=connect.createStatement();
                statement2=connect.createStatement();
                resultSet=statement.executeQuery("SELECT * FROM Book WHERE title LIKE '%"+bookNameTextField.getText()+"%'");
                resultSet2=statement2.executeQuery("SELECT * FROM Book WHERE author LIKE '%"+bookAuthorTextField.getText()+"%'");
                if(resultSet.next()&&resultSet2.next()){
                    JOptionPane.showMessageDialog(this,"Kitap Zaten Bulunmakta");
                }
                else{
                    PreparedStatement addToTable=connect.prepareStatement("INSERT INTO Book Values(?,?,?,?,?,?)");
                    addToTable.setInt(1,Integer.valueOf(bookIdTextField.getText()));
                    addToTable.setString(2, bookNameTextField.getText());
                    addToTable.setString(3, bookAuthorTextField.getText());
                    addToTable.setString(4, bookCategoryComboBox.getSelectedItem().toString());
                    addToTable.setInt(5, Integer.valueOf(stockTextField.getText()));
                    addToTable.setInt(6, Integer.valueOf(priceTextField.getText()));
                    int row = addToTable.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Kitap "+bookIdTextField.getText()+" id numarasıyla Eklendi !!");
                  
                    //connect.close();
                    //statement=connect.createStatement();
                    //resultSet=statement.executeQuery(string)
                    DisplayBooks();
                    reset();
                   }

               }
            catch(java.lang.NumberFormatException | SQLException e){
               JOptionPane.showMessageDialog(this,"Lütfen Price Ve Stock Alanlarına Karakter Girmeyiniz");
               //e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bookSaveButtonMouseClicked

    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) booksTable.getModel();
            int index = booksTable.getSelectedRow();
            bookIdTextField.setText(model.getValueAt(index,0).toString());
            bookNameTextField.setText(model.getValueAt(index,1).toString());
            bookAuthorTextField.setText(model.getValueAt(index,2).toString());
            stockTextField.setText(model.getValueAt(index,3).toString());
            bookCategoryComboBox.setSelectedItem(model.getValueAt(index,4).toString());
            priceTextField.setText(model.getValueAt(index,5).toString());
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(this,"Lütfen Silmek Ya Da Düzenlemek İstediğiniz Kitabı Seçin !!");

        }
            
    }//GEN-LAST:event_booksTableMouseClicked

    private void bookEditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookEditButtonMouseClicked
       if(bookIdTextField.getText().isEmpty()||bookNameTextField.getText().isEmpty()||bookAuthorTextField.getText().isEmpty()||bookCategoryComboBox.getSelectedIndex()==-1||stockTextField.getText().isEmpty()||priceTextField.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Lütfen Güncellemek İstediğiniz Kitabı Seçin");
        }
        else{
               try{
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShopDB","root","");
                String bookId=bookIdTextField.getText();
                //String sorgu = "'Update Book set'"+"'title='"+bookNameTextField.getText()+"',author='"+bookAuthorTextField.getText()+"',category='"+bookCategoryComboBox.getSelectedItem()+"',quantity='"+QuantityTextField.getText()+"',price='"+PriceTextField.getText()+" WHERE book_id="+bookId;
                String sorgu = "Update Book set"+" title=?,author=?,category=?,stock=?,price=?"+"WHERE book_id="+bookId;
                PreparedStatement preparedStatement = connect.prepareStatement(sorgu);
                preparedStatement.setString(1, bookNameTextField.getText());
                preparedStatement.setString(2, bookAuthorTextField.getText());
                preparedStatement.setString(3, bookCategoryComboBox.getSelectedItem().toString());
                preparedStatement.setString(4, stockTextField.getText());
                preparedStatement.setString(5, priceTextField.getText());
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this,"Kitap Güncellendi !!");
                DisplayBooks();
                reset();
               }
            catch(Exception e){
               e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bookEditButtonMouseClicked

    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
           try {
            booksTable.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void getUsersMenuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getUsersMenuLabelMouseClicked
        new Users(false).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_getUsersMenuLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookAuthorTextField;
    private javax.swing.JComboBox<String> bookCategoryComboBox;
    private javax.swing.JButton bookDeleteButton;
    private javax.swing.JButton bookEditButton;
    private javax.swing.JTextField bookIdTextField;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JButton bookResetButton;
    private javax.swing.JButton bookSaveButton;
    private javax.swing.JTable booksTable;
    private javax.swing.JLabel exitBooksMenu;
    private javax.swing.JLabel getBooksMenuLabel;
    private javax.swing.JLabel getUsersMenuLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField stockTextField;
    // End of variables declaration//GEN-END:variables
}
