package stadiumbookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import library.databaseSQL;


public class StadiumBookingSystem {


    
    public static void main(String[] args) {
        
        
        
        createLoginScreen();
        
        databaseSQL.getAllAccounts();
        Connection con = databaseSQL.getConnection();
        
        if (con==null){
            System.out.println("cheese");
        } else {
            System.out.println("tomato");
        }
        
        databaseSQL.getMaxAccountNumber();
        
        
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
