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
    
     String[] headers = {"Id Pharmacien", "Nom du Pharamacien", "Prénom", "Telephone","E-Mail"}; 
    List<Pharmacien> listSt = new ArrayList<Pharmacien>();

    public ListPharmacienModel() {
        PharmacienDAO stdao = new PharmacienDAO();
        listSt = stdao.DisplayPartiePharmacien();
    }
 @Override
    public int getRowCount() {
            return listSt.size();
    }
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
                return listSt.get(rowIndex).getNom();
            case 2:
                return listSt.get(rowIndex).getPrenom();
            case 3:
                return listSt.get(rowIndex).getTel();
            case 4:
                return listSt.get(rowIndex).getEmail();
            
            default:
                return null;
        }
    }
 @Override
        public String getColumnName(int i) {
        return headers[i];
    }
}
