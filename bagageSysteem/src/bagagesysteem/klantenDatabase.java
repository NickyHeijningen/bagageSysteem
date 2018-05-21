package bagagesysteem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import bagagesysteem.bcrypt.BCrypt;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mastanick
 */
public class klantenDatabase {
    Main main = new Main();
    private Connection conn = null;
    private Statement statement = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
    
    
    public Klanten getKlanten(int klantId) throws SQLException {
        
       String query = "SELECT * FROM klanten where klantId = '"+ klantId+"'";
        
        Klanten vb = new Klanten();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                vb.setklantId(rs.getInt(1));
                vb.setVoornaam(rs.getString(2));
                vb.setAchternaam(rs.getString(3));
                vb.setAdres(rs.getString(7));
                vb.setWoonplaats(rs.getString(8));
                vb.setPostcode(rs.getString(9));
                vb.setGeboortedatum(rs.getString(5));
                vb.setTelefoonnummer(rs.getString(4));
                vb.setEmail(rs.getString(6));
                vb.setLand(rs.getString(10));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return vb;
    }
    
    
    public void InsertKlant(String voornaam, String achternaam, String telefoonnummer, String geboorteDatum, String email, String adres, String woonplaats, String postcode, String land) throws SQLException{
        //test
        try {
                    conn = DBConnection.setDBConnection();

                    String query = "insert into klanten(voornaam, achternaam, telefoonnummer, geboortedatum, email, adres, woonplaats, postcode, land) values('"+voornaam+"','"+achternaam+"','"+telefoonnummer+"','"+geboorteDatum+"','"+email+"','"+adres+"','"+woonplaats+"','"+postcode+"','"+land+"')";
                    
                    pst = conn.prepareStatement(query);
                    pst.execute();
                }catch (SQLException ex) { 
                    throw new RuntimeException(ex);

                }finally{
                        
                        conn.close();
                }
        
        
        
        
    }
    
    public void InsertGebruiker(String voornaam, String achternaam, String telefoonnummer, String email, String werklocatie, String wachtwoord, int rechten) throws SQLException{
        wachtwoord = BCrypt.hashpw(wachtwoord, BCrypt.gensalt());
        try {
            conn = DBConnection.setDBConnection();
          
            String query = "INSERT into gebruikers(voornaam, achternaam, telefoonnummer, email, werklocatie, wachtwoord, rechten) values('"+voornaam+"', '"+achternaam+"','"+telefoonnummer+"','"+email+"','"+werklocatie+"', '"+wachtwoord+"', '"+rechten+"')";
            pst = conn.prepareStatement(query);
            pst.execute();
          
        }catch (SQLException ex) { 
                    throw new RuntimeException(ex);
            
        }
        finally{
            conn.close();
        }
    
    }
    
     public void InsertVermist(int klantId) throws SQLException{
       
        try {
            conn = DBConnection.setDBConnection();
          
            String query = "INSERT into vermistebagage(klantId) values('"+klantId+"')";
            pst = conn.prepareStatement(query);
            pst.execute();
          
        }catch (SQLException ex) { 
                    throw new RuntimeException(ex);
            
        }
        finally{
            conn.close();
        }
    
    }
    public void UpdateGebruiker(String voornaam, String achternaam, String telefoonnummer, String email, String werklocatie, String wachtwoord, int rechten, int gebruikersId, boolean hashed) throws SQLException{
        
        if(!hashed) {
           wachtwoord = BCrypt.hashpw(wachtwoord, BCrypt.gensalt()); 
        }
        
        try {
            conn = DBConnection.setDBConnection();
          
            String query = "UPDATE gebruikers SET voornaam = '"+voornaam+"',  achternaam = '"+achternaam+"', telefoonnummer = '"+telefoonnummer+"', email = '"+email+"', werklocatie = '"+werklocatie+"', wachtwoord = '"+wachtwoord+"', rechten = "+rechten+" WHERE gebruikersId = "+gebruikersId+";";
           
            pst = conn.prepareStatement(query);
            pst.execute();
          
        }catch (SQLException ex) { 
                    throw new RuntimeException(ex);
            
        }
        finally{
            conn.close();
        }
    
    }
    public void VerwijderGebruiker(int gebruikersId) throws SQLException {
        try {
            conn = DBConnection.setDBConnection();
          
            String query = "DELETE FROM gebruikers WHERE gebruikersId = "+gebruikersId+";";
           
            pst = conn.prepareStatement(query);
            pst.execute();
          
        }catch (SQLException ex) { 
                    throw new RuntimeException(ex);
            
        }
        finally{
            conn.close();
        }
    }
}
