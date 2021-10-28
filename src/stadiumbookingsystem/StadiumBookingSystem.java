package stadiumbookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import library.databaseSQL;


public class StadiumBookingSystem {


    
    public static void main(String[] args) {
        
       //NOTES
       //Change limits on all fields in database to be a reasonable size for the input and add validation in code to represent that
       //Complete stucture chart
       //Complete database tables and entity flow diagram
       //Complete data dictionary for new tables
       //Complete file organising and processing: file sizing, data volumes and total size
       //Ask julie about libraires and api, data capture and entry designs, as well as structure charts and what integer should be in data dictionary
       //Ask julie where i need to close statements and connections
       
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
        
//        Connection con = databaseSQL.getConnection();        
//        if (con==null){
//            System.out.println("cheese");
//        } else {
//            System.out.println("tomato");
//        }
        
        //databaseSQL.getMaxAccountNumber();
        
        
        
        
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
