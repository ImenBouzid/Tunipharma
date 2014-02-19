/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author Azza
 */
public class Pharmacie {
    
    private int id_pharmacie;
    private int id_pharmacien;
   
    private String nom;
    private String adresse;
    private float tel;
    private float fax;
    private String type;
     private int id_service;
    private String note;
    private String photo;
    private String horaire_ouverture;
    private String horaire_fermeture;

    public Pharmacie(int id_pharmacie, int id_pharmacien, String nom, String adresse, float tel, float fax, String type, int id_service, String note, String photo, String horaire_ouverture, String horaire_fermeture) {
        this.id_pharmacie = id_pharmacie;
        this.id_pharmacien = id_pharmacien;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
        this.fax = fax;
        this.type = type;
        this.id_service = id_service;
        this.note = note;
        this.photo = photo;
        this.horaire_ouverture = horaire_ouverture;
        this.horaire_fermeture = horaire_fermeture;
    }

    public int getId_pharmacie() {
        return id_pharmacie;
    }

    public void setId_pharmacie(int id_pharmacie) {
        this.id_pharmacie = id_pharmacie;
    }

    public int getId_pharmacien() {
        return id_pharmacien;
    }

    public void setId_pharmacien(int id_pharmacien) {
        this.id_pharmacien = id_pharmacien;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getTel() {
        return tel;
    }

    public void setTel(float tel) {
        this.tel = tel;
    }

    public float getFax() {
        return fax;
    }

    public void setFax(float fax) {
        this.fax = fax;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHoraire_ouverture() {
        return horaire_ouverture;
    }

    public void setHoraire_ouverture(String horaire_ouverture) {
        this.horaire_ouverture = horaire_ouverture;
    }

    public String getHoraire_fermeture() {
        return horaire_fermeture;
    }

    public void setHoraire_fermeture(String horaire_fermeture) {
        this.horaire_fermeture = horaire_fermeture;
    }
    
    
    
    
    
    public static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
