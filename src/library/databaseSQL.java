package library;

import objects.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class databaseSQL {
    
    //private static final String DatabaseLocation = System.getProperty("user.dir") + "\\Db.accdb";
    
    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\SBSDatabase.accdb"; //location of database in files
    private static Connection con; //creating gloabal variable that can be used repeatedly rather than having to recreate new connection every time
    private static account currentUser; //global variable that stores the users details after they have logged in
    
    public static Connection getConnection() { //creating a connection to the database for when sql statements are executed
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", ""); //sets variable con to the file location of the database file
            return con; 
        } catch (Exception e) {
            System.out.println("Error with getting connection to database: " + e);
        }
        return null; //return null value if no connection was made
    }
    
   // <editor-fold defaultstate="collapsed" desc="Account">
    
    public static void addNewAccount(account na) {
        try {
            //creating sql statement of adding a record into the account table
            String sql = "INSERT INTO account VALUES ('"+na.getAccountID()+"','"+na.getFirstName()+"','"+na.getLastName()+"'"
                    + ",'"+na.getEmail()+"','"+na.getPassword()+"','"+na.getPhoneNo()+"','"+na.getAddressOne()+"','"+na.getAddressTwo()+"'"
                    + ",'"+na.getCity()+"','"+na.getPostCode()+"','"+na.getMembership()+"','"+na.getStadiumCredit()+"')";
            //Give statement the values from the account object that need to be put into the record
            executer.executeUpdateQuery(con, sql); //calling method from executer class to update the table using a connection and the sql statement as parameters        
            
            
            System.out.println("successfully added new account to database");
           
            con.close();
        } catch (Exception e) {
            System.out.println("Error in adding new account to databse: " + e);
        }
    }
    
    public static int getMaxAccountNumber() { //used for adding new accounts
        try {
            String sql = "SELECT MAX(accountid) AS idNum FROM account"; //find highest number of accountID, save value as idNum from account table
            ResultSet rs = executer.executeQuery(getConnection(), sql); //uses connection to database and statement to fire query at the database
            rs.next();
            int idValue = rs.getInt("idNum")+1; //adds one to highest ID value so that new account
            
            System.out.println("Max account num: " + idValue); //next account value (id)
            
            return idValue; //returns new ID number
            
        } catch (Exception e) {
            System.out.println("Error in finding maximum account number: " + e);
        }
        return -1;
    }
    
    public static int getMaxPaymentNumber() {
        try {
            String sql = "SELECT MAX(paymentid) AS idNum FROM payment"; //find highest number of accountID, save value as idNum from account table
            ResultSet rs = executer.executeQuery(getConnection(), sql); //uses connection to database and statement to fire query at the database
            rs.next();
            int idValue = rs.getInt("idNum")+1; //adds one to highest ID value so that new account
            
            System.out.println("Max payment num: " + idValue); //next account value (id)
            
            return idValue; //returns new ID number
            
        } catch (Exception e) {
            System.out.println("Error in finding maximum payment number: " + e);
        }
        return -1;
    }
    
    
    //try to fix this so i dont have to have the same code for finding max values of IDs
    //using parameters to create sql statements
    
//    public static int getMaxIDNumber(String column, String grid) {//field, table
//        try {
//            System.out.println(column + " + " + grid);
//            String sql = "SELECT MAX('"+column+"') AS idNum FROM '"+grid+"'";
//            ResultSet rs = executer.executeQuery(getConnection(), sql);
//            rs.next();
//            int idValue = rs.getInt("idNum")+1;
//            
//            System.out.println("Max account num: " + idValue);
//            
//            return idValue;
//            
//        } catch (Exception e) {
//            System.out.println("Error in finding maximum " + column + " number in table " + grid + ": " + e);
//        }
//        
//        return -1;
//    }
    
    
    
    public static void removeAccount(int accountID) { //used for when a user decides to terminate their account
        try {            
            String sql = "DELETE FROM account WHERE accountid = '"+accountID+"' "; //statement used to find record with parametered account ID
            executer.executeUpdateQuery(getConnection(), sql); //uses connection to database and statement to fire update query at the database
            
            
            System.out.println("successfully removed record from account table in database");
            
            con.close();
        } catch (Exception e) {
            System.out.println("Error in deleting record in account table: " + e);
        }
    }    
    
    
    public static Boolean userLogIn(String loginEmail, String loginPassword) { //parameters taken from the text fields on login GUI
        try {
            String sql = "SELECT * FROM account WHERE email = '"+loginEmail+"'"; //selecting record where the email from the text fields match the database
            ResultSet rs = executer.executeQuery(getConnection(), sql); //uses connection to database and statement to fire query at the database
            
            //sets String to be empty so they can be rewrittern with the data from the result set
            String userEmail = ""; 
            String userPassword = "";
            
            while(rs.next()) { //result set returns results where the email details match and retrieves the password for that account
                userEmail = rs.getString("email");
                userPassword = rs.getString("password");                
            }
            
            //hash loginPassword to be used to compare against the hashed database password
            String hashLoginPassword = hashing.hashPassword(loginPassword);
            
            if (loginEmail.equals(userEmail) && hashLoginPassword.equals(userPassword)) { //if the login details and the record match, return true (meaning user can log in)
                rs.close();
                con.close();
                return true;
            } else {
                rs.close();
                con.close();
                return false;
            }
   
            
        } catch (Exception e) {
            System.out.println("Error getting login details from database: " + e);
        }
        return false;
    }   
    
    
    public static void setCurrentUser(String loginEmail, String loginPassword) {
        try {
            String sql = "SELECT * FROM account WHERE email = '" +loginEmail+ "'"; //selecting record where email matches database
            ResultSet rs = executer.executeQuery(getConnection(), sql); //uses connection to database and statement to fire query at the database
            
            //gets result set from sql statement
            while (rs.next()) {
                int id = rs.getInt("accountid"); //get record and store it in variable id
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String phoneNumber = rs.getString("phonenumber");
                String addressOne = rs.getString("addresslineone");
                String addressTwo = rs.getString("addresslinetwo");
                String city = rs.getString("city");
                String postCode = rs.getString("postcode");
                String membership = rs.getString("membership");
                int stadiumCredit = rs.getInt("stadiumCredit");
                
                //creates account object that is stored in a global variable for the logged in user so all their details can be accessed when logged in
                currentUser = new account (id, firstName, lastName, email, password, phoneNumber, addressOne, addressTwo, city, postCode, membership, stadiumCredit); 

                
            }
            
        } catch (Exception e) {
            System.out.println("Error in setting current user: " + e);
        }       
        
    }
    
    public static account getCurrentUser() { //returns account object of logged in user so that object can be used in other classes
        return currentUser;
    }
    
    
    public static void getAllAccounts() {
        ArrayList<account> AccountList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM account";
            ResultSet rs = executer.executeQuery(getConnection(), sql);
            while (rs.next()) {
                int id = rs.getInt("accountid"); //get record and store it in variable id
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String phoneNumber = rs.getString("phonenumber");
                String addressOne = rs.getString("addresslineone");
                String addressTwo = rs.getString("addresslinetwo");
                String city = rs.getString("city");
                String postCode = rs.getString("postcode");
                String membership = rs.getString("membership");
                int stadiumCredit = rs.getInt("stadiumCredit");
                
                
                account ac = new account(id, firstName, lastName, email, password, phoneNumber, addressOne, addressTwo, city, postCode, membership, stadiumCredit); //creating new object to be added to the list
                AccountList.add(ac); //adding new object to array list
                
                
                //System.out.println(id + " " + firstName + " " + lastName + " " + email + " " + password + " " + phoneNumber + " " + addressOne + " " + addressTwo + " " + city + " " + postCode);
            }
            
            //printing all accounts from account table in database
            for (int i = 0; i < AccountList.size(); i++) {
                    System.out.println(AccountList.get(i));                    
                }
            
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    // </editor-fold>
    
    
    
    

    
        

    
}
