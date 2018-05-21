/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagagesysteem;

/**
 *
 * @author lucas
 */
public class Vluchten {

   
    
    private int vluchtId;
    private String vluchtNummer;
    private String vertrekTijd;
    private String aankomstTijd;
    private String vluchtHavenHerkomst;
    private String vluchtHavenAankomst;

    public int getVluchtId() {
        return vluchtId;
    }

    public void setVluchtId(int vluchtId) {
        this.vluchtId = vluchtId;
    }

    public String getVertrekTijd() {
        return vertrekTijd;
    }

    public void setVertrekTijd(String vertrekTijd) {
        this.vertrekTijd = vertrekTijd;
    }

    public String getAankomstTijd() {
        return aankomstTijd;
    }

    public void setAankomstTijd(String aankomstTijd) {
        this.aankomstTijd = aankomstTijd;
    }

    public String getVluchtHavenHerkomst() {
        return vluchtHavenHerkomst;
    }

    public void setVluchtHavenHerkomst(String vluchtHavenHerkokmst) {
        this.vluchtHavenHerkomst = vluchtHavenHerkokmst;
    }

    public String getVluchtHavenAankomst() {
        return vluchtHavenAankomst;
    }

    public void setVluchtHavenAankomst(String vluchtHavenAankomst) {
        this.vluchtHavenAankomst = vluchtHavenAankomst;
    }
    
    public String getVluchtNummer() {
        return vluchtNummer;
    }

    public void setVluchtNummer(String vluchtNummer) {
        this.vluchtNummer = vluchtNummer;
    }
    
    
}
