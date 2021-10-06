package library;

import objects.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class databaseSQL {
    
    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\SBSDatabase.accdb"; //location of database in files
    private static Connection con; //creating gloabal variable that can be used repeatedly rather than having to recreate new connection every time
    
    public static Connection getConnection() { //creating a connection to the database for when sql statements are executed
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        } catch (Exception e) {
            System.out.println("Error with getting connection to database: " + e);
        }
        return null;
    }
    
   
    
    public static void addNewAccount(newAccount na) {
        try {
            //creating sql statement of adding a record into the account table
            String sql = "INSERT INTO account VALUES ('"+na.getAccountID()+"','"+na.getFirstName()+"','"+na.getLastName()+"','"+na.getEmail()+"','"+na.getPassword()+"','"+na.getPhoneNo()+"','"+na.getAddressOne()+"','"+na.getAddressTwo()+"','"+na.getCity()+"','"+na.getPostCode()+"')";
            executer.executeUpdateQuery(con, sql); //calling method from executer class to update the table using a connection and the sql statement as parameters        
            
            
            System.out.println("successfully added new account to database");
           
            con.close();
        } catch (Exception e) {
            System.out.println("Error in adding new account to databse: " + e);
        }
    }
    
    public static int getMaxAccountNumber() {
        try {
            String sql = "SELECT MAX(accountid) AS idNum FROM account"; //find highest number of accountID, save value as idNum from tbl_account
            ResultSet rs = executer.executeQuery(getConnection(), sql);
            rs.next();
            int idValue = rs.getInt("idNum")+1;
            
            System.out.println("Max account num: " + idValue); //next account value (id)
            
            return idValue;
            
        } catch (Exception e) {
            System.out.println("Error in finding maximum account number: " + e);
        }
        return 0;
    }
    
    
//    public static void userLogIn(String userEmail, String password) {
//        try {
//            String sql = "SELECT * FROM tbl_account WHERE email = '" + userEmail + "'";
//            ResultSet rs = 
//            
//            
//        } catch (Exception e) {
//        }
//        
//    }   
    
    
    public static void getAllAccounts() {
        ArrayList<newAccount> AccountList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM account";
            ResultSet rs = executer.executeQuery(getConnection(), sql);
            while (rs.next()) {
                int id = rs.getInt("accountid");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String phoneNumber = rs.getString("phonenumber");
                String addressOne = rs.getString("addresslineone");
                String addressTwo = rs.getString("addresslinetwo");
                String city = rs.getString("city");
                String postCode = rs.getString("postcode");
                
                newAccount ac = new newAccount(id, firstName, lastName, email, password, phoneNumber, addressOne, addressTwo, city, postCode); //creating new object to be added to the list
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
    
    
    
    
    
    
    
    
    //fix this for a ms access database    
    public static void test() {
    
        //database code
        try {
            //Where database is, what username is, what password is
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SBSDatabase", "Liam", "Penguin1"); //connect to database
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); //allow sql to be used on database
            
            String sql = "SELECT MAX(accountid) AS idNum FROM app.tbl_account"; //find highest number of accountID, save value as idNum from tbl_account
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            int idValue = rs.getInt("idNum")+1;
            System.out.println("idValue is: " + idValue);
            
            //Create a record
            sql = "INSERT INTO app.tbl_account VALUES ("+idValue+", 'joe', 'TheThird', 'Dave@gmail.com', 'password', '12345678901', 'corner street', 'redhill', 'London', 'GQ1 34D')";
            stmt.executeUpdate(sql); //Add new record to database
            
            //Delete a record
            sql = "DELETE FROM app.tbl_account WHERE firstname = 'Liam' ";
            stmt.executeUpdate(sql); 
            
            
            //get record
            sql = "SELECT * From app.tbl_account";
            rs = stmt.executeQuery(sql); //takes sql line and executes statement and returns the result set (records)
            
            while (rs.next()) {
                int id = rs.getInt("accountid"); //get record and store it in variable id
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                int phoneNumber = rs.getInt("phonenumber");
                String addressOne = rs.getString("addresslineone");
                String addressTwo = rs.getString("addresslinetwo");
                String city = rs.getString("city");
                String postCode = rs.getString("postcode");
                
                System.out.println(id + " " + firstName + " " + lastName + " " + email + " " + password + " " + phoneNumber + " " + addressOne + " " + addressTwo + " " + city + " " + postCode);
            }
            
            //Housekeeping - closing so that they can be used later
            rs.close();
            con.close();
            stmt.close();
            
            
            
        } catch(Exception e) {
            System.out.println(e);
        }
        
        
        
}
    
}
