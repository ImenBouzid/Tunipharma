/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.DAO;

import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Pharmacie;

/**
 *
 * @author Azza
 */
public class ListPharmacieModel {
    String[] headers = {"Nom de la Pharmacie"}; //adresse 
    List<Pharmacie> listSt = new ArrayList<>();

    public ListPharmacieModel() {
        PharmacieDAO phdao = new PharmacieDAO();
        listSt = phdao.DisplayPartiePharmacie();
    }

    public int getRowCount() {
            return listSt.size();
    }

    public int getColumnCount() {
        return headers.length;
    }

    public Object getValueAt(int rowIndex, int ColumnIndex) {
        switch (ColumnIndex) {
            case 0:
                return listSt.get(rowIndex).getNom();
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
