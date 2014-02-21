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

       String requete = "select nom from pharamacie ";
        try {
           Statement statement;
            statement = ConnectionBD.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Pharmacien pharmacien =new Pharmacien();
                
                
                pharmacien.setNom(resultat.getString(1));
               // pharmacie.setAdresse(resultat.getString(2));

                listepharmacien.add(pharmacien);
            }
            return listepharmacien;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Pharmacie "+ex.getMessage());
            return null;
        }
    
}
