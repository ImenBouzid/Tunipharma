/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.gui;

import java.util.ArrayList;
import java.util.List;
import tunipharma.DAO.PharmacieDAO;
import tunipharma.DAO.PharmacienDAO;
import tunipharma.entities.Pharmacie;
import tunipharma.entities.Pharmacien;

/**
 *
 * @author Azza
 */
public class ListPharmacieModel {
    String[] headers = {"Nom de la Pharmacie"}; //adresse 
    List<Pharmacie> listpp = new ArrayList<>();

    public ListPharmacieModel() {
        PharmacieDAO phdao = new PharmacieDAO();
        listpp = phdao.DisplayPartiePharmacie();
    }

    public int getRowCount() {
            return listpp.size();
    }

    public int getColumnCount() {
        return headers.length;
    }

        
    
    
    public Object getValueAt(int rowIndex, int ColumnIndex) {
        switch (ColumnIndex) {
            case 0:
                return listpp.get(rowIndex).getNom();
           // case 1:
              //  return listSt.get(rowIndex).getAdresse();
            
            default:
                return null;
        }
    }

        public String getColumnName(int i) {
        return headers[i];
    }
}
