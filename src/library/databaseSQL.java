package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class databaseSQL {
    
    
    
    
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
