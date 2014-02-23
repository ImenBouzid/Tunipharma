/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.DAO;

import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Pharmacien;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Azza
 */
public class ListPharmacienModel extends AbstractTableModel{
    
     String[] headers = {"Id Pharmacien","Id Pharmacie", "Nom", "Prénom","Statut Ajout", "Telephone","E-Mail","login", "pwd","photo"}; 
    List<Pharmacien> listSt = new ArrayList<>();

    public ListPharmacienModel() {
        PharmacienDAO stdao = new PharmacienDAO();
        listSt = stdao.DisplayPartiePharmacien();
    }
 //@Override
   // public int getRowCount() {
   //         return listSt.size();
    //}
 @Override
    public int getColumnCount() {
        return headers.length;
    }
 @Override
    public Object getValueAt(int rowIndex, int ColumnIndex) {
        switch (ColumnIndex) {
            case 0:
                return listSt.get(rowIndex).getId_pharmacien();
            case 1:
                return listSt.get(rowIndex).getId_pharmacie();
            case 2:
                return listSt.get(rowIndex).getNom();
            case 3:
                return listSt.get(rowIndex).getPrenom();
            case 4:
                return listSt.get(rowIndex).getStatut();
            case 5:
                return listSt.get(rowIndex).getTel();
            case 6:
                return listSt.get(rowIndex).getEmail();
            case 7:
                return listSt.get(rowIndex).getLogin();
            case 8:
                return listSt.get(rowIndex).getPwd();
            case 9:
                return listSt.get(rowIndex).getPhoto();
           
            default:
                return null;
        }
    }
 @Override
        public String getColumnName(int i) {
        return headers[i];
    }

   // @Override
   // public int getRowCount() {
        
    //}

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
