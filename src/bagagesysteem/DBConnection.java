package bagagesysteem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static Connection conn;
	public Statement statement;
	public ResultSet rs;
        
        
       
	public static Connection setDBConnection() throws SQLException {
            
//            String URL = "com.mysql.jdbc.Driver";
//            String USER = "root";
//            String PASS = "root"
//            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
//            String databaseServer   = PropertiesService.getDatabaseServer();
//            String databasePort     = PropertiesService.getDatabasePort();
//            String databaseUsername = PropertiesService.getDatabaseUsername();
//            String databasePassword = PropertiesService.getDatabasePassword();
//            String databaseDatabase = PropertiesService.getDatabaseDatabase();
              
               
            
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/KofferBack","root","root");
		}catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		return conn;
	}
	
	public ResultSet getResultSet(String sqlQuery, Connection conn)
			throws SQLException {
		
		System.out.println(sqlQuery);
		String sqlquery = sqlQuery;
		//conn = conn;
		try{
			
			statement = conn.createStatement();
			rs = statement.executeQuery(sqlquery);
                        
		}catch (SQLException se) {
			System.out.println(se);
		}finally{
			rs.close();
			conn.close();
		}
		return rs;
	
	}

}
