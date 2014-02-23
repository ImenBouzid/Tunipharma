/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author Azza
 */
public class Pharmacien {
    private int id_pharmacien;
    private int id_pharmacie;
    private String nom;
    private String prenom;
    private int statut;
    private int tel;
    private String email;
    private String login;
    private String pwd;
    private String photo;
     
    

   
   public Pharmacien(){}
    public Pharmacien(int id_pharmacien, String nom, String prenom, int tel, String email, String login, String pwd, String photo, int statut, int id_pharmacie) {
        this.id_pharmacien = id_pharmacien;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.login = login;
        this.pwd = pwd;
        this.photo = photo;
        this.statut = statut;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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
    
    
    
    
    public static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
