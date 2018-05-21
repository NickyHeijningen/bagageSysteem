/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagagesysteem;

/**
 *
 * @author Mastanick
 */
public class Gebruikers {

    private int gebruikersid;
    private String voornaam;
    private String achternaam;
    private String adres;
    private String telefoonnummer;
    private String geboordedatum;
    private String email;
    private String werklocatie;
    private String gebruikersnaam;
    private String wachtwoord;
    private int rechten;

    //            1 = gebruikersId;
    public int getGebruikersid() {
        return gebruikersid;
    }

    public void setGebruikersid(int gebruikersid) {
        this.gebruikersid = gebruikersid;
    }

    //            2 = voornaam;
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    //            3 = achternaam;
    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    //            4 = adres;
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    //            5 = telefoonnummer;
    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    //            6 = geboortedatum;
    public String getGeboordedatum() {
        return geboordedatum;
    }

    public void setGeboordedatum(String geboordedatum) {
        this.geboordedatum = geboordedatum;
    }

    //            7 = email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //            8 = werklocatie;
    public String getWerklocatie() {
        return werklocatie;
    }

    public void setWerklocatie(String werklocatie) {
        this.werklocatie = werklocatie;
    }

    //            9 = gebruikersnaam;
    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    //            10 = wachtwoord;
    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    //            11 = rechten;
    public int getRechten() {
        return rechten;
    }

    public void setRechten(int rechten) {
        this.rechten = rechten;
    }

}
