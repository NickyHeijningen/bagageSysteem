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
public class Bagage {

    /**
     * @return the vluchtKlantId
     */
    public int getVluchtKlantId() {
        return vluchtKlantId;
    }

    /**
     * @param vluchtKlantId the vluchtKlantId to set
     */
    public void setVluchtKlantId(int vluchtKlantId) {
        this.vluchtKlantId = vluchtKlantId;
    }

    
    
    
    private int bagageId;
    private int klantId;
    private int vluchtId;
    private int vluchtKlantId;
    private String labelnummer;
    private String merk;
    private String type;
    private String kleur;
    private String kenmerken;
    
    
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
    public int getVluchtId() {
        return vluchtId;
    }

    /**
     * @param vluchtId the vluchtId to set
     */
    public void setVluchtId(int vluchtId) {
        this.vluchtId = vluchtId;
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
     * @return the labelnummer
     */
    public String getLabelnummer() {
        return labelnummer;
    }

    /**
     * @param labelnummer the labelnummer to set
     */
    public void setLabelnummer(String labelnummer) {
        this.labelnummer = labelnummer;
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



}
