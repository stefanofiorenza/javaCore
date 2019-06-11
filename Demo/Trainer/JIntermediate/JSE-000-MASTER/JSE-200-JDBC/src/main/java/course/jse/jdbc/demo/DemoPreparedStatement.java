package course.jse.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import course.jse.jdbc.utils.DbUtils;

import java.sql.PreparedStatement;



public class DemoPreparedStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;

        try
        {
           
            conn = DbUtils.createConnection();            
            System.out.println ("Connected to Database...");
            
            PreparedStatement pstQueryArtistAndQuantity = conn.prepareStatement("SELECT * FROM CD WHERE ARTIST=? AND QUANTITY=?");
            pstQueryArtistAndQuantity.setString(1, "Radiohead");
            pstQueryArtistAndQuantity.setInt(2, 12);
            
	        ResultSet res = pstQueryArtistAndQuantity.executeQuery();
	 	
	 		while (res.next()) {
	        	
	        	// per posizione
		        //System.out.print("\t"+res.getString(3));
		        //System.out.print("\t"+res.getString(4));
	        	
	        	//per nome colonna
	        	System.out.print("\t"+res.getString("Artist"));
	        	System.out.print("\t"+res.getString("Title"));
		        System.out.println();
	      	}
            
            
        }
        catch (Exception e){
        	e.printStackTrace();            
        }
        finally {
        	DbUtils.closeConnection(conn);       
        }

	}

}
