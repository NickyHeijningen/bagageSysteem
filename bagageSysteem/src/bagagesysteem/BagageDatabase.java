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
    
    
    
    public VermisteBagage getVermisteBagage(int bagageId) throws SQLException {
        
       String query = "SELECT * FROM vermistebagage WHERE bagageId = " + bagageId;
        
        VermisteBagage vb = new VermisteBagage();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                vb.setBagageId(rs.getInt("bagageId"));
                vb.setVluchtKlantId(rs.getInt("vermisteBagageId"));
                vb.setKlantId(rs.getInt("klantId"));
                vb.setVluchtKlantId(rs.getInt("vluchtKlantId"));
                vb.setDatumVermist(rs.getString("datumVermist"));
                vb.setLocatieVermist(rs.getString("locatieVermist"));
                vb.setMerk(rs.getString("merk"));
                vb.setKleur(rs.getString("kleur"));
                vb.setType(rs.getString("type"));
                vb.setKenmerken(rs.getString("kenmerken"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return vb;
    }
    
    public gevondenBagage getGevondenBagage(int bagageId) throws SQLException {
        
       String query = "SELECT * FROM gevondenbagage WHERE bagageId = " + bagageId;
        
        gevondenBagage gb = new gevondenBagage();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                gb.setBagageId(rs.getInt("bagageId"));
                gb.setVluchtKlantId(rs.getInt("vermisteBagageId"));
                gb.setKlantId(rs.getInt("klantId"));
                gb.setVluchtKlantId(rs.getInt("vluchtKlantId"));
                gb.setDatumGevonden(rs.getString("datumVermist"));
                gb.setLocatieGevonden(rs.getString("locatieVermist"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return gb;
    }
    
    
    public Bagage getBagage(int bagageId, int klantId) throws SQLException {

//            1 = bagageId;
//            2 = klantId;
//            3 = vluchtId;
//            2 = labelnummer;

        

               

                

        String query = "SELECT * FROM bagage WHERE bagageId = " + bagageId;
        
        Bagage bagage = new Bagage();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                bagage.setBagageId(rs.getInt("bagageId"));
                bagage.setKlantId(rs.getInt("klantId"));
                bagage.setVluchtId(rs.getInt("vluchtId"));
                bagage.setLabelnummer(rs.getString("labelnummer"));
            }
            
            String query2 = "select vluchtklantId from vluchtklant where klantId = '"+klantId+"'";

                    rs = statement.executeQuery(query2);

                    while(rs.next()){
                       bagage.setVluchtKlantId(rs.getInt(1));
                    }
            
            
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return bagage;
    }
    
    public Klanten getKlanten(int klantId) throws SQLException {

//                1 = klantId;
//                2 = voornaam;
//                3 = achternaam;
//                4 = geslacht;
//                5 = telefoonnummer;
//                6 = geboortedatum;
//                7 = email;
//                8 = adres;
//                9 = woonplaats;
//                10 = postcode;
//                11 = land;

        String query = "SELECT * FROM klanten WHERE klantId = " + klantId;
        
        Klanten klanten = new Klanten();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                klanten.setklantId(rs.getInt("klantId"));
                klanten.setVoornaam(rs.getString("voornaam"));
                klanten.setAchternaam(rs.getString("achternaam"));
              //klanten.setGeslacht(rs.getInt(4)); <-- Er is geen geslacht kollom
                klanten.setTelefoonnummer(rs.getString("telefoonnummer"));
                klanten.setGeboortedatum(rs.getString("geboortedatum"));
                klanten.setEmail(rs.getString("email"));
                klanten.setAdres(rs.getString("adres"));
                klanten.setWoonplaats(rs.getString("woonplaats"));
                klanten.setPostcode(rs.getString("postcode"));
                klanten.setLand(rs.getString("land"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return klanten;
    }
    
    public Gebruikers getUsers(String gebruikersnaam) throws SQLException {

//            1 = gebruikersId;
//            2 = voornaam;
//            3 = achternaam;
//            4 = adres;
//            5 = telefoonnummer;
//            6 = email;
//            7 = werklocatie;
//            8 = gebruikersnaam;
//            9 = wachtwoord;
//            10 = rechten;

        String query = "SELECT * FROM gebruikers WHERE email = '" + gebruikersnaam + "'";
        
        Gebruikers users = new Gebruikers();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                users.setGebruikersid(rs.getInt("gebruikersId"));
                users.setVoornaam(rs.getString("voornaam"));
                users.setAchternaam(rs.getString("achternaam"));
                //users.setAdres(rs.getString("adres"));
                users.setTelefoonnummer(rs.getString("telefoonnummer"));
                users.setEmail(rs.getString("email"));
                users.setWerklocatie(rs.getString("werklocatie"));
                //users.setGebruikersnaam(rs.getString("gebruikersnaam"));
                users.setWachtwoord(rs.getString("wachtwoord"));
                users.setRechten(rs.getInt("rechten"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return users;
    }

     public Bagage getLabelnummer(String labelnummer) throws SQLException {

//            1 = bagageId;
//            2 = klantId;
//            3 = vluchtId;
//            2 = labelnummer;

        String query = "SELECT * FROM bagage WHERE labelnummer = " + labelnummer;
        
        Bagage bagage = new Bagage();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                bagage.setBagageId(rs.getInt("bagageId"));
                bagage.setKlantId(rs.getInt("klantId"));
                bagage.setVluchtId(rs.getInt("vluchtId"));
                bagage.setLabelnummer(rs.getString("labelnummer"));
            }

        }catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return bagage;
    }
     
     public Bagage getvluchtKlantId(int klantId) throws SQLException {
         
          Bagage bagage = new Bagage();

    try{
       
        
         String query2 = "select vluchtklantId from vluchtklant where klantId = '"+klantId+"'";
                    conn = DBConnection.setDBConnection();
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query2);

                    while(rs.next()){
                       bagage.setVluchtKlantId(rs.getInt(1));
                    }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return bagage;
    }

     //--------
     public Vluchten getVlucht(int vluchtId) throws SQLException {

//            1 = bagageId;
//            2 = klantId;
//            3 = vluchtId;
//            2 = labelnummer;
//            3 = merk;
//            4 = type;
//            5 = kleur;
//            6 = kenmerken;

        String query = "SELECT * FROM vluchten WHERE vluchtId = " + vluchtId;
        
        Vluchten vluchten = new Vluchten();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
               vluchten.setVluchtId(vluchtId);
               vluchten.setAankomstTijd(rs.getString("aankomstTijd"));
               vluchten.setVluchtNummer(rs.getString("vluchtNummer"));
               vluchten.setVertrekTijd(rs.getString("vertrekTijd"));
               vluchten.setVluchtHavenAankomst(rs.getString("vluchtHavenAankomst"));
               vluchten.setVluchtHavenHerkomst(rs.getString("vluchtHavenHerkomst"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return vluchten;
    }
     
     
     public Gebruikers getUserId(int gebruikersId) throws SQLException {

//            1 = gebruikersId;
//            2 = voornaam;
//            3 = achternaam;
//            4 = adres;
//            5 = telefoonnummer;
//            6 = email;
//            7 = werklocatie;
//            8 = gebruikersnaam;
//            9 = wachtwoord;
//            10 = rechten;

        String query = "SELECT * FROM gebruikers WHERE gebruikersId = " + gebruikersId;
        
        Gebruikers users = new Gebruikers();
        
        try {
            conn = DBConnection.setDBConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(query);            
            
            while (rs.next()) {
                users.setGebruikersid(rs.getInt("gebruikersId"));
                users.setVoornaam(rs.getString("voornaam"));
                users.setAchternaam(rs.getString("achternaam"));
                //users.setAdres(rs.getString("adres"));
                users.setTelefoonnummer(rs.getString("telefoonnummer"));
                users.setEmail(rs.getString("email"));
                users.setWerklocatie(rs.getString("werklocatie"));
                //users.setGebruikersnaam(rs.getString("gebruikersnaam"));
                users.setWachtwoord(rs.getString("wachtwoord"));
                users.setRechten(rs.getInt("rechten"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            rs.close();
            conn.close();
        }
        return users;
    }

    
}
