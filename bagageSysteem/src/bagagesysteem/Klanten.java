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
public class Klanten {

    private int klantId;
    private String voornaam;
    private String achternaam;
    private int geslacht;
    private String telefoonnummer;
    private String geboortedatum;
    private String email;
    private String adres;
    private String woonplaats;
    private String postcode;
    private String land;

    //                1 = klantId;
    public int getKlantId() {
        return klantId;
    }

    public void setklantId(int klantId) {
        this.klantId = klantId;
    }

    //                2 = voornaam;
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    //                3 = achternaam;
    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    //                4 = geslacht;
    public int getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(int geslacht) {
        this.geslacht = geslacht;
    }

    //                5 = telefoonnummer;
    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    //                6 = geboortedatum;
    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    //                7 = email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //                8 = adres;
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    //                9 = woonplaats;
    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    //                10 = postcode;
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    //                11 = land;
    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
