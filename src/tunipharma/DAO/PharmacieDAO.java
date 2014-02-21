/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Pharmacie;
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
}
