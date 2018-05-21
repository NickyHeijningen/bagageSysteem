/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagagesysteem;




public class VermisteBagage {

   
    
        
//                1 = vermisteBagageId; int
//                2 = klantId;  int
//                3 = vluchtId; int
//                4 = bagageId; int
//                5 = datumVermist; String
//                6 = locatieVermist; String
//                7 = gevonden; String
    
    
    private int vermisteBagageId;
    private int klantId;
    private int vluchtKlantId;
    private int bagageId;
    private String datumVermist;
    private String locatieVermist;
    private String type;
    private String kleur;
    private String kenmerken;
    private String merk;
    

    /**
     * @return the vermisteBagageId
     */
    public int getVermisteBagageId() {
        return vermisteBagageId;
    }

    /**
     * @param vermisteBagageId the vermisteBagageId to set
     */
    public void setVermisteBagageId(int vermisteBagageId) {
        this.vermisteBagageId = vermisteBagageId;
    }

    /**
     * @return the klantId
     */
    public int getKlantId() {
        return klantId;
    }

    /**
     * @param klantId the klantId to set
     */
    public void setKlantId(int klantId) {
        this.klantId = klantId;
    }

    /**
     * @return the vluchtId
     */
    public int getVluchtKlantId() {
        return vluchtKlantId;
    }

    /**
     * @param vluchtId the vluchtId to set
     */
    public void setVluchtKlantId(int vluchtId) {
        this.vluchtKlantId = vluchtId;
    }

    /**
     * @return the bagageId
     */
    public int getBagageId() {
        return bagageId;
    }

    /**
     * @param bagageId the bagageId to set
     */
    public void setBagageId(int bagageId) {
        this.bagageId = bagageId;
    }

    /**
     * @return the datumVermist
     */
    public String getDatumVermist() {
        return datumVermist;
    }

    /**
     * @param datumVermist the datumVermist to set
     */
    public void setDatumVermist(String datumVermist) {
        this.datumVermist = datumVermist;
    }

    /**
     * @return the locatieVermist
     */
    public String getLocatieVermist() {
        return locatieVermist;
    }

    /**
     * @param locatieVermist the locatieVermist to set
     */
    public void setLocatieVermist(String locatieVermist) {
        this.locatieVermist = locatieVermist;
    }
    
     /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the kleur
     */
    public String getKleur() {
        return kleur;
    }

    /**
     * @param kleur the kleur to set
     */
    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    /**
     * @return the kenmerken
     */
    public String getKenmerken() {
        return kenmerken;
    }

    /**
     * @param kenmerken the kenmerken to set
     */
    public void setKenmerken(String kenmerken) {
        this.kenmerken = kenmerken;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    




    
}
