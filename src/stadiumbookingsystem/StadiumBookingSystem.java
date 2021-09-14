package stadiumbookingsystem;

import java.awt.Toolkit;


public class StadiumBookingSystem {

    public static Login l = new Login(); //ctreates login window object
    public static SignUp su = new SignUp(); //creates create account window object
    
    
    
    //decide on how to open/close windows - through functions or through old original method
    
    public static void main(String[] args) {
        
        createLoginScreen();
        
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
        //width, height
        l.setSize(687,500);
        l.setVisible(true); 
    }
    
    public static void closeLoginScreen(){
        l.dispose();
    }
    
}
