package stadiumbookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class StadiumBookingSystem {


    
    public static void main(String[] args) {
        
        
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
            sql = "INSERT INTO app.tbl_account VALUES ("+idValue+", 'joe', 'TheThird', 'Dave@gmail.com', 'password', 0123456, 'corner street', 'London', 'GQ1 34D')";
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
                String address = rs.getString("address");
                String city = rs.getString("city");
                String postCode = rs.getString("postcode");
                
                System.out.println(id + " " + firstName + " " + lastName + " " + email + " " + password + " " + phoneNumber + " " + address + " " + city + " " + postCode);
            }
            
            //Housekeeping - closing so that they can be used later
            rs.close();
            con.close();
            stmt.close();
            
            
            
        } catch(Exception e) {
            System.out.println(e);
        }
        
        
        createLoginScreen();
        
        //JOptionPane.showMessageDialog(null, "New project added successfully");
          
          
//        //Making the window fit the screen
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xSize = (int)tk.getScreenSize().getWidth();
//        int ySize = (int)tk.getScreenSize().getHeight();
//        System.out.println(xSize + " " + ySize);
//        
//        l.setSize(xSize,ySize);
//        l.setVisible(true);


    }
    
    public static void createLoginScreen(){
        Login l = new Login();
        //width, height
        l.setSize(687,500);
        l.setVisible(true); 
    }
        
    
}
