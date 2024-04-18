package atmpackage;

import java.sql.Connection;
import java.sql.DriverManager;
public class AtmDatabase {
	 static Connection con=null;
	public static Connection connect() 
	{
		try 
		{
		String url="jdbc:mysql://localhost:3306/atm";
		String username="root";
		String password="Fuckrashmi@7223";
		con=DriverManager.getConnection(url, username, password);
	    }
        catch(Exception e)
		{
		e.printStackTrace();
		}
     return con;
   }
}
