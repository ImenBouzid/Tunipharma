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
   
   
    private String nom;
    private float tel;
    private float fax;
    private String type;
     private int id_service;
    private String note;
    private String photo;
    private String horaire_ouverture;
    private String horaire_fermeture;
    private String date_ajout;
    private int id_adresse;
    private int statut;
    private int id_visite;

    public Pharmacie(){}

    public Pharmacie(int id_pharmacie, String nom, float tel, float fax, String type, int id_service, String note, String photo, String horaire_ouverture, String horaire_fermeture, String date_ajout, int id_adresse, int statut, int id_visite) {
        this.id_pharmacie = id_pharmacie;
        this.nom = nom;
        this.tel = tel;
        this.fax = fax;
        this.type = type;
        this.id_service = id_service;
        this.note = note;
        this.photo = photo;
        this.horaire_ouverture = horaire_ouverture;
        this.horaire_fermeture = horaire_fermeture;
        this.date_ajout = date_ajout;
        this.id_adresse = id_adresse;
        this.statut = statut;
        this.id_visite = id_visite;
    }
    

    
    
    
    
    
    public String getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(String date_ajout) {
        this.date_ajout = date_ajout;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    

    public int getId_pharmacie() {
        return id_pharmacie;
    }

    public void setId_pharmacie(int id_pharmacie) {
        this.id_pharmacie = id_pharmacie;
    }

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public int getId_visite() {
        return id_visite;
    }

    public void setId_visite(int id_visite) {
        this.id_visite = id_visite;
    }
    
    
    
    
    
    public static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
