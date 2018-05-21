/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagagesysteem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nicky
 */
public class BagageDatabase {
    
            private Connection conn = null;
            private Statement statement = null;
            private ResultSet rs = null;
            private PreparedStatement pst = null;
            
            
            
            public Users getUsers(String gebruikersnaam) throws SQLException{
       
                String query = "select * from gebruikers where gebruikersnaam = '"+ gebruikersnaam+"'";

                Users users = new Users();

                try {
                        conn = DBConnection.setDBConnection();
                        statement = conn.createStatement();
                        rs = statement.executeQuery(query); 

                        while(rs.next()){
                                users.setGebruikersid(rs.getInt(1));
                                users.setVoornaam(rs.getString(2));
                                users.setAchternaam(rs.getString(3));
                                users.setGeboordedatum(rs.getString(6));
                                users.setWerklocatie(rs.getString(8));
                                users.setGebruikersnaam(rs.getString(9)); 
                        }
                }catch(SQLException e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }
                return users;
        }
    
}
