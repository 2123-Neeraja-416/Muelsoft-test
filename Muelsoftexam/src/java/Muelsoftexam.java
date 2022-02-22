package java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Muelsoftexam {

	public static void main(String[] args ) {
		String jdbcUrl = "jdbc:splite:/D:\\SqlLite\\sqlite-tools-win32-x86-3370200\\moviesdb.db";
		
		try {
		    Connection connection = DriverManager.getConnection(jdbcUrl);
		    String sql = "SELECT * FROM movies";
		    
		    Statement statement = connection.createStatement();
		    
		    ResultSet result = statement.executeQuery(sql);
		     
		    while(result.next()) {
		    	String Moviename =result.getString("Moviename");
		    	String Actor =result.getString("Actor");
		    	String Actress =result.getString("Actress");
		    	String Director =result.getString("Director");
		    	Integer YOR = result.getInt("YOR");
		    	
		    	
		    	System.out.println(Moviename + "|"+ Actor + "|" + Actress + "|" + Director + "|"+ YOR);
		    }
		    
		    
		} catch (SQLException e) {
			System.out.println("Error connecting to sqlite");
			e.printStackTrace();
		}
		

	}

}
