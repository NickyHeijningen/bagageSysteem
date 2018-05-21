package bagagesysteem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mastanick
 */
public class GevondenDatabase {
    
    
        private Connection conn = null;
    private Statement statement = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
    public void InsertGevonden(int klantId, int vluchtKlantId, int bagageId, String datumGevonden, String locatieGevonden) throws SQLException{
        //test
        try {
                    conn = DBConnection.setDBConnection();

                    String query = "insert into gevondenBagage(klantId, vluchtKlantId, bagageId, datumGevonden, locatieGevonden) values('"+klantId+"','"+vluchtKlantId+"','"+bagageId+"','"+datumGevonden+"','"+locatieGevonden+"')";
                    
                    pst = conn.prepareStatement(query);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "Het is gelukt om de bagage als gevonden op te geven!");
                }catch (SQLException ex) { 
                    throw new RuntimeException(ex);

                }finally{
                        
                        conn.close();
                }
    }
    
}
