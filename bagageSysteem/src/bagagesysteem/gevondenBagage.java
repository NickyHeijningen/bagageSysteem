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
public class gevondenBagage {
    private int gevondenBagageId;
    private int klantId;
    private int vluchtKlantId;
    private int bagageId;
    private String datumGevonden;
    private String locatieGevonden;

    public int getGevondenBagageId() {
        return gevondenBagageId;
    }

    public void setGevondenBagageId(int gevondenBagageId) {
        this.gevondenBagageId = gevondenBagageId;
    }

    public int getKlantId() {
        return klantId;
    }

    public void setKlantId(int klantId) {
        this.klantId = klantId;
    }

    public int getVluchtKlantId() {
        return vluchtKlantId;
    }

    public void setVluchtKlantId(int vluchtKlantId) {
        this.vluchtKlantId = vluchtKlantId;
    }

    public int getBagageId() {
        return bagageId;
    }

    public void setBagageId(int bagageId) {
        this.bagageId = bagageId;
    }

    public String getDatumGevonden() {
        return datumGevonden;
    }

    public void setDatumGevonden(String datumGevonden) {
        this.datumGevonden = datumGevonden;
    }

    public String getLocatieGevonden() {
        return locatieGevonden;
    }

    public void setLocatieGevonden(String locatieGevonden) {
        this.locatieGevonden = locatieGevonden;
    }
    
}
