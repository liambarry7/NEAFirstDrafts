package stadiumbookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import library.databaseSQL;


public class StadiumBookingSystem {


    
    public static void main(String[] args) {
        
       //NOTES
       //SET EVERYTHING TO NULL LAYOUT ON GUI
       //MUST HAVE SET SIZE TO AVOID SMALL WINDOWS
       
       //CHANGE DFD TO INCLUDE PAYMENT TABLE
       
       //Create regEx for password and phone number
       
       //Work out season ticket stuff
       
       
       //Ask julie what happens if you change your code and the design does not match it after its been submitted.
     
       //Make Events set to size (for display) as you can only see so many events before their available
       
       //400 seats in total split between four stands
       //485 for music events including standing
       //use arraylists for booked tickets
       //search through booked tickets per event to make array list of purchased tickets
       
       //DISPLAY PAYMENTS IN A TABLE - use this to figure out how to display events and tickets
       //payment - partially annomynise anything on screen
       
       
       
        createLoginScreen();
        
        databaseSQL.getAllAccounts();
        
        databaseSQL.getAllPayments();
        
//        databaseSQL.removeAccount(7);
        

        
        
        
        
        
          
          
//        //Making the window fit the screen
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xSize = (int)tk.getScreenSize().getWidth();
//        int ySize = (int)tk.getScreenSize().getHeight();
//        System.out.println(xSize + " " + ySize);



    }
    

    
    
    
    
    public static void createLoginScreen(){
        Login l = new Login();
        //width, height
        l.setSize(687,500);
        l.setVisible(true); 
    }
        
    
}
