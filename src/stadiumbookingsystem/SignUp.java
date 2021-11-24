/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stadiumbookingsystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import library.databaseSQL;
import library.hashing;
import objects.account;

/**
 *
 * @author kimia
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        ErrorEmail.setVisible(false);
        ErrorFillFields.setVisible(false);
        ErrorPassword.setVisible(false);
        ErrorPhoneNo.setVisible(false);
        ErrorValidInformation.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        PhoneNumberField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        CreateAccountButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        AddressOneField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AddressTwoField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PostCodeField = new javax.swing.JTextField();
        ErrorEmail = new javax.swing.JLabel();
        ErrorPassword = new javax.swing.JLabel();
        ErrorFillFields = new javax.swing.JLabel();
        ErrorPhoneNo = new javax.swing.JLabel();
        ErrorValidInformation = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stadiumbookingsystem/BaseLogo.PNG"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(144, 11, 428, 94);
        getContentPane().add(FirstNameField);
        FirstNameField.setBounds(286, 148, 247, 31);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("First Name*:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(119, 147, 82, 31);

        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(LastNameField);
        LastNameField.setBounds(286, 190, 247, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Password*:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(119, 283, 71, 25);

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailField);
        EmailField.setBounds(286, 232, 247, 31);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Email*:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(119, 232, 57, 27);

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField);
        PasswordField.setBounds(286, 281, 247, 31);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Phone Number*:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(119, 330, 113, 33);

        PhoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNumberField);
        PhoneNumberField.setBounds(286, 330, 247, 31);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Address Line 1*:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(119, 374, 123, 31);

        BackButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(39, 597, 63, 31);

        CreateAccountButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CreateAccountButton.setText("Create Account");
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccountButton);
        CreateAccountButton.setBounds(571, 598, 115, 31);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Last Name*:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(119, 197, 71, 15);
        getContentPane().add(AddressOneField);
        AddressOneField.setBounds(286, 375, 247, 31);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Address Line 2:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(119, 424, 86, 15);
        getContentPane().add(AddressTwoField);
        AddressTwoField.setBounds(286, 417, 247, 31);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("City/Town*:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(119, 460, 70, 26);
        getContentPane().add(CityField);
        CityField.setBounds(286, 459, 247, 31);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("PostCode*:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(119, 508, 70, 15);
        getContentPane().add(PostCodeField);
        PostCodeField.setBounds(286, 501, 247, 31);

        ErrorEmail.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ErrorEmail.setForeground(new java.awt.Color(255, 0, 0));
        ErrorEmail.setText("Please enter a valid email address.");
        getContentPane().add(ErrorEmail);
        ErrorEmail.setBounds(170, 559, 341, 13);

        ErrorPassword.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ErrorPassword.setForeground(new java.awt.Color(255, 0, 0));
        ErrorPassword.setText("Password must be 8 characters or longer, include 1 number and a captial letter.");
        getContentPane().add(ErrorPassword);
        ErrorPassword.setBounds(170, 578, 385, 13);

        ErrorFillFields.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ErrorFillFields.setForeground(new java.awt.Color(255, 0, 0));
        ErrorFillFields.setText("Please enter information into all text fields.");
        getContentPane().add(ErrorFillFields);
        ErrorFillFields.setBounds(170, 616, 343, 13);

        ErrorPhoneNo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ErrorPhoneNo.setForeground(new java.awt.Color(255, 0, 0));
        ErrorPhoneNo.setText("Please enter a valid phone number.");
        getContentPane().add(ErrorPhoneNo);
        ErrorPhoneNo.setBounds(170, 597, 306, 13);

        ErrorValidInformation.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ErrorValidInformation.setForeground(new java.awt.Color(255, 0, 0));
        ErrorValidInformation.setText("Please enter valid information into the text fields.");
        getContentPane().add(ErrorValidInformation);
        ErrorValidInformation.setBounds(170, 635, 307, 13);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        StadiumBookingSystem.createLoginScreen();
        this.dispose(); //closes sign up menu
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        try {
            
            //change to have regular expressions
            
            
            //sets value of textfeild to a variable that can be called.
            String userFirstName = FirstNameField.getText();
            String userLastName = LastNameField.getText();
            String userEmail = EmailField.getText();
            String userPassword = PasswordField.getText();
            String userPhoneNo = PhoneNumberField.getText();
            String userAddressOne = AddressOneField.getText();
            String userCity = CityField.getText();
            String userPostCode = PostCodeField.getText();

            
            
            
            
            //check email is valid
            boolean validEmail = false; //sets a boolean value to false until email is valid
            //regular expression for checking email is valid by looking for characters such as '@' and checking the ending is realistic (e.g. '.com')
            Pattern rep = Pattern.compile("^[0-9a-zA-Z]+([0-9a-zA-Z]*[-._+])*[0-9a-zA-Z]+@[0-9a-zA-Z]+([-.][0-9a-zA-Z]+)*([0-9a-zA-Z]*[.])[a-zA-Z]{2,6}$");
            
            Matcher m = rep.matcher(userEmail); //checks if user input is valid by comparing to regular expression limits
            if (m.matches()) { //returns true if email is valid
                ErrorEmail.setVisible(false);
                validEmail = true;
            } else {
                ErrorEmail.setVisible(true); //displays error message to user
            }
            
            
            //Checks password is valid
            //boolean validPassword = false; //sets a boolean value to false until password is valid
            
            
            
            
            
            
            
            
            
            
            
            
            
            //Check text fields are not empty
            //address line two can be empty as not every user will use the second address line
            boolean validTextFields = false;
            if (userFirstName.equals("") || userLastName.equals("") || userAddressOne.equals("") || userCity.equals("") || userPostCode.equals("")) {
                ErrorFillFields.setVisible(true); //tells users there are empty text fields
            } else {
                ErrorFillFields.setVisible(false);
                validTextFields = true; //text fields are not empty
            }
            
            
            //check password is valid
            boolean validPassword = false; //sets a boolean value to false until password is valid
            if (userPassword.length() >= 8) { //password must be 8 or more characters long
                if (userPassword.contains("1") || userPassword.contains("2") || userPassword.contains("3") || userPassword.contains("4") || userPassword.contains("5") || userPassword.contains("6") || userPassword.contains("7") || userPassword.contains("8") || userPassword.contains("9") || userPassword.contains("0")) { //password must contain a number
                    ErrorPassword.setVisible(false);
                    validPassword = true; //password is valid
                } else {
                    ErrorPassword.setVisible(true); //Tells user password must be at least 8 characters long and include 1 number                    
                }
            } else {
                ErrorPassword.setVisible(true); //Tells user password must be at least 8 characters long and include 1 number                
            }
            
            
            
//            if(userPassword.length() >= 8 && userPassword.matches("[0-9]+")) {
//                
//            }
            

            


//            //check email is valid
//            boolean validEmail = false; //sets a boolean value to false until email is valid
//            if (userEmail.contains("@") && (userEmail.contains(".co.uk") || userEmail.contains(".com"))) { //checks email has '@' so that is is valid
//                ErrorEmail.setVisible(false);
//                validEmail = true; //email is valid
//            } else {
//                ErrorEmail.setVisible(true); //tells user to enter a valid email address                
//            }
            

            //check phone number is valid
            boolean validPhoneNo = false;
            if (userPhoneNo.matches("[0-9]+") && userPhoneNo.length() == 11) { //checks phone number input has only characters 0-9 and is 11 characters long
                ErrorPhoneNo.setVisible(false);
                validPhoneNo = true;
            } else {
                ErrorPhoneNo.setVisible(true); //tells user Phone number must be all numbers and 11 characters long
            }
            
            
            //if pasword, phone number and email are all valid, create account
            if (validPassword == true && validEmail == true && validPhoneNo == true && validTextFields == true) {
                
                int accountID = databaseSQL.getMaxAccountNumber(); //gets integer for highest accountID so that new account does not have the same ID as another account
//                String a = "AccountID";
//                String b = "account";
//                int accountID = databaseSQL.getMaxIDNumber(a,b);
//                if (accountID == -1) {
//                    System.out.println("FAIL");
//                } else {
//                    System.out.println("Success");
//                }
                
                
                
                
                
                String hashedPassword = hashing.hasher(PasswordField.getText());
                System.out.println(hashedPassword);
                
                String membership = "not a member";
                int stadiumCredit = 0;
                
                //creates new account object to be used to create a new record in the account table
                account na = new account(accountID, FirstNameField.getText(), LastNameField.getText(), EmailField.getText(), hashedPassword, PhoneNumberField.getText(), AddressOneField.getText(), AddressTwoField.getText(), CityField.getText(), PostCodeField.getText(), membership, stadiumCredit);
                
                //creates new record in database using account object
                databaseSQL.addNewAccount(na);

                //displays pop up to inform user the sign up was successful
                JOptionPane.showMessageDialog(null, "Account Made!");

                Login l = new Login(); //creates new login menu
                l.setSize(687,500);
                l.setVisible(true);
                this.dispose(); //closes signup menu
                
            } else {
                System.out.println("failed to create account");
            }
         

        } catch (Exception e) { //catches errors
            System.out.println("Error creating new account: " + e);
            
        }
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void PhoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberFieldActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressOneField;
    private javax.swing.JTextField AddressTwoField;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CityField;
    private javax.swing.JButton CreateAccountButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel ErrorEmail;
    private javax.swing.JLabel ErrorFillFields;
    private javax.swing.JLabel ErrorPassword;
    private javax.swing.JLabel ErrorPhoneNo;
    private javax.swing.JLabel ErrorValidInformation;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JTextField PostCodeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
