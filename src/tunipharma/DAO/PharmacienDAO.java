/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Pharmacie;
import tunipharma.entities.Pharmacien;
import tunipharma.util.ConnectionBD;

/**
 *
 * @author Emna
 */
public class PharmacienDAO {
    
    public void InscriptionPharmacien()
            
    {
        
    }
    
    public void EnvoyerSMS(int numero,Pharmacien pharmacien, Pharmacie pharmacie)
    {
        
    }

    
    public List<Pharmacien> DisplayPartiePharmacien (){


        List<Pharmacien> listepharmacien = new ArrayList<Pharmacien>();

       String requete = "select * from pharamacien where statut=0 ";
        try {
           Statement statement;
            statement = ConnectionBD.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Pharmacien pharmacien =new Pharmacien();
                
                
                pharmacien.setId_pharmacien(resultat.getInt(1));
                pharmacien.setId_pharmacie(resultat.getInt(2));
                pharmacien.setNom(resultat.getString(3));
                pharmacien.setPrenom(resultat.getString(4));
                pharmacien.setStatut(resultat.getInt(5));
                pharmacien.setTel(resultat.getInt(6));
                pharmacien.setEmail(resultat.getString(7));
                pharmacien.setLogin(resultat.getString(8));
                pharmacien.setPwd(resultat.getString(9));
                pharmacien.setPhoto(resultat.getString(10));
                pharmacien.setNom(resultat.getString(11));
               

                listepharmacien.add(pharmacien);
            }
            return listepharmacien;
        } catch (SQLException ex) {
           
            System.out.println("erreur lors du chargement des Pharmacie "+ex.getMessage());
            return null;
        }
    
}
    
    
    public void updatePartiePharmacien(Pharmacien st){
        String requete = "update pharmacien set statut=1 where id_pharmacien=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
           
            ps.setInt(1, st.getStatut());
          
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    
     public void deletePharmacien(int num){

          String requete = "delete from pharmacien where id_pharmacien=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

}
