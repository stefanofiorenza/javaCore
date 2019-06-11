package course.jse.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

	
	public static Connection createConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		 String userName = "root";
         String password = "stefan0";
         String url = "jdbc:mysql://localhost:3306/EShopMusic";
         Class.forName ("com.mysql.jdbc.Driver").newInstance ();
         return  DriverManager.getConnection (url, userName, password);
	}
	
	
	public static void closeConnection(Connection connection){
		
		 if (connection != null){
             try   {
            	 connection.close ();
                 System.out.println ("connection closed");
             }
             catch (Exception e) { 
            	e.printStackTrace();
            }
         }
	}
}
