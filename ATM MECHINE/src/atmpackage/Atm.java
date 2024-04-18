package atmpackage;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Atm {
	 public void menu(Connection con,Scanner sc)
	 {
		   System.out.println("/*********************************************************/");
	       System.out.println("1. Deposite");
	       System.out.println("2. Withdraw");
	       System.out.println("3. Transaction history");
	       System.out.println("4. Quit");
	       System.out.println("Enter your choice");
	       System.out.println("/*********************************************************/");
           int ch=sc.nextInt();
           switch(ch)
           {
           case 1:
        	   Deposite d=new Deposite();
        	   d.deposite(con,sc);
        	   break;
           case 2:
        	   Wtthdraw w=new Wtthdraw();
        	   w.withdraw(con,sc);
        	   break;
           case 3:
        	   TransationHistory h=new TransationHistory();
        	   h.showHistory(con,sc);
        	   break;
           case 4:
        	   Quit q=new Quit();
        	   q.quit();
        	   return;
           default:
        	   System.out.println("enter the valied choice:");
        	   
           }
	       
	 }
	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException
	{	
		Connection con = AtmDatabase.connect();
	     if (con == null) {
	         System.out.println("Failed to connect to the database.");
	         return; 
	     }
       Scanner sc= new Scanner(System.in);
       System.out.println("WellCome to HDFC bank");
       System.out.println("1. SignUp");
       System.out.println("2. SignIn");
       System.out.println("3. Quit");
       System.out.println("Enter your choice");
       int choice=sc.nextInt();
       switch(choice)
       {
       case 1:
    	   SignUp sg=new SignUp();
    	   sg.signUp(con,sc);
    	   break;
       case 2:
    	   SignIn sn=new SignIn();
    	   sn.signIn(con,sc);
    	   break;
       case 3:
    	   return;
       default :
    	   System.out.println("enter the valied choice:");
       }
	}

}
