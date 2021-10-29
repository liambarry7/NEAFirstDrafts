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
       
       //Create regEx for password and phone number
       //use drop down menus for expiartion month and year
       //Work out season ticket stuff
       
       //Complete stucture chart
       //Complete database tables and entity flow diagram - done ish
       //Complete data dictionary for new tables - done
       //Complete file organising and processing: file sizing, data volumes and total size
      
       //Ask julie if what my structure chart is now is correct
     
    
       
       //400 seats in total split between four stands
       //485 for music events including standing
       //use arraylists for booked tickets
       //search through booked tickets per event to make array list of purchased tickets
       
       //payment - partially annomynise anything on screen
       //hash security number
       //convert account number from int to string for database for all card details 
       //(if cant be turned, use try catch to stop crash and display error message to use to enter proper details
       
        createLoginScreen();
        
        databaseSQL.getAllAccounts();
        
        
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
