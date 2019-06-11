package course.jse.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoConnectionMySql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;

        try
        {
            String userName = "root";
            String password = "stefan0";
            String url = "jdbc:mysql://localhost:3306/EShopMusic";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
            
            
            System.out.println ("Connected to Database...");
            
            Statement cmd = conn.createStatement ();
		 	
	 		
	        String query = "SELECT * FROM CD";
	        
	        ResultSet res = cmd.executeQuery(query);
	 	
	 		
	        while (res.next()) {
	        	
	        	// from position
		        //System.out.print("\t"+res.getString(3));
		        //System.out.print("\t"+res.getString(4));
	        	
	        	//from column name
	        	System.out.print("\t"+res.getString("Artist"));
	        	System.out.print("\t"+res.getString("title"));
		        System.out.println();
	      	}
            
            
        }
        catch (Exception e)
        {
           
        	System.err.println ("Impossible to connect to Database");
        	 e.printStackTrace();
            
        }
        finally 
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("connection closed");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }

	}

}
