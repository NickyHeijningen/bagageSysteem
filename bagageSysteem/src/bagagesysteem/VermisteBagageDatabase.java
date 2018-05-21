package bagagesysteem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
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
public class VermisteBagageDatabase {
    
    private Connection conn = null;
    private Statement statement = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
    
    
    public void InsertVermist(int klantId, int vluchtKlantId, int bagageId, String datumVermist, String locatieVermist, String kleur, String kenmerken, String type, String merk) throws SQLException{
        //test
        try {
                    conn = DBConnection.setDBConnection();

                    String query = "insert into vermistebagage(klantId, vluchtKlantId, bagageId, datumVermist, locatieVermist, kleur, merk, type, kenmerken) values('"+klantId+"','"+vluchtKlantId+"','"+bagageId+"','"+datumVermist+"','"+locatieVermist+"','"+merk+"','"+kleur+"','"+type+"','"+kenmerken+"')";
                    
                    pst = conn.prepareStatement(query);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "Het is gelukt om de bagage als vermist op te geven!");
                }catch (SQLException ex) { 
                    throw new RuntimeException(ex);

                }finally{
                        
                        conn.close();
                }
    }
    
    
        
        
        
    }
    

