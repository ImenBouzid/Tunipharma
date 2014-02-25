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
import tunipharma.gui.Admin_Connexion;
import tunipharma.util.ConnectionBD;

/**
 *
 * @author Azza
 */
public class PharmacieDAO {
    
    
    public List<Pharmacie> DisplayPartiePharmacie (){


        List<Pharmacie> listepharmacie = new ArrayList<Pharmacie>();

       String requete = "select nom from pharamacie ";
        try {
           Statement statement;
            statement = ConnectionBD.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                
                
                pharmacie.setNom(resultat.getString(1));
               // pharmacie.setAdresse(resultat.getString(2));

                listepharmacie.add(pharmacie);
            }
            return listepharmacie;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Pharmacie "+ex.getMessage());
            return null;
        }
    }
    
    
    public void updatePartiePharmacie(Pharmacien st){
        String requete = "update pharmacie set statut=1 where id_pharmacie=(select * from pharmacien where id_pharmacie=id_pharmacien)";
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
    
    
     public void deletePharmacie(int num){

          String requete = "delete from pharmacie where id_pharmacie=?";
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
