package course.jse.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import course.jse.jdbc.utils.DbUtils;

public class DemoTransactionJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Connection conn = null;

        try
        {
        	 
        	conn = DbUtils.createConnection();            
            System.out.println ("Connected to Database...");
            
            conn.setAutoCommit(false);
            
            PreparedStatement insertCD = conn.prepareStatement("INSERT INTO CD (Artist,Title,Company,Year,Price,Quantity,Country,Version) " +
            																	"VALUES (?,?,?,?,?,?,?,?)");            
            
            
            insertCD.setString(1, "Radiohead2");
            insertCD.setString(2, "The Bends");
            insertCD.setString(3, "RCA");
            insertCD.setInt(4,1998 );
            insertCD.setDouble(5, 21.2);
            insertCD.setInt(6, 12);
            insertCD.setString(7, "UK");
            insertCD.setInt(8, 0);
            
	        insertCD.executeUpdate();
	 	    
	        insertCD.setString(1, "Ludovico Einaudi");
            insertCD.setString(2, "Una Mattina");
            insertCD.setString(3, "RCA");
            insertCD.setInt(4,2008 );
            insertCD.setDouble(5, 19.9);
            insertCD.setInt(6, 6);
            insertCD.setString(7, "UK");
            insertCD.setInt(8, 0);
            
	        insertCD.executeUpdate();
            
	        conn.rollback();
	        
	        //conn.commit();
        }
        catch (Exception e) {
        	 e.printStackTrace();            
        }
        finally {
        	DbUtils.closeConnection(conn);       
        }

		
	}
	
	

}
