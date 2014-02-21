/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tunipharma.DAO;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tunipharma.entities.Admin;
import tunipharma.util.ConnectionBD;
/**
 *
 * @author sicateur
 */
public class AdminDAO {
    private Component Admin_Connexion;
   
    
    public void Admin_Authentification (Admin admin){
      //  String requete = "select * from admin where login=? and pwd=?";
        String requete = "select * from admin where login='"+admin.getLogin()+"' and pwd='"+admin.getPwd()+"'";
             try {
               PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
               //ps.setString(1, admin.getLogin());
              // ps.setString(2, admin.getPwd());
               ResultSet res = ps.executeQuery(requete);
                 
                     if (res.next()){ JOptionPane.showMessageDialog(Admin_Connexion, "Authentification effectuée avec succès");
                          System.out.println("Authentification effectuée avec succès. "+admin.getPwd());
                          }
                    else{ 
                         JOptionPane.showMessageDialog(Admin_Connexion, "Erreur lors de Authentification. Vérifier vos identifiants!");
                          System.out.println("Erreur lors de l'authentification. "+admin.getPwd());
                      }
                     ps.close();
             }catch (SQLException ex) {
           JOptionPane.showMessageDialog(Admin_Connexion, "Erreur lors de Connexion");
            System.out.println("Erreur lors de Connexion "+ex.getMessage());
        }
       
    }
    public void Admin_Mail (Admin admin){
        String requete = "select * from admin where login='"+admin.getLogin()+"' and pwd='"+admin.getPwd()+"'";
        try {
               PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
              
               ResultSet res = ps.executeQuery(requete);
                 
                     while(res.next()){ 
                         admin.setEmail(res.getString(3));
                         JOptionPane.showMessageDialog(Admin_Connexion, "Vérifier votre courrier afin de récupérer votre mot de passe. ");
                          System.out.println("Mail recovery sent to : "+res.getString(4));
                          
                          }
                     ps.close();
             }catch (SQLException ex) {
           JOptionPane.showMessageDialog(Admin_Connexion, "Erreur lors de Connexion");
            System.out.println("Erreur lors de Connexion "+ex.getMessage());
    }
    }
}

