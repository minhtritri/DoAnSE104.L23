/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Drug;


/**
 *
 * @author anhha
 */
public class DrugController {
     private ArrayList<Drug> drug= new ArrayList<>();
    
    private static DrugController instance = new DrugController();

    public DrugController() {
    }

    public ArrayList<Drug> getList() {
        return drug;
    }

    public static DrugController getInstance() {
        return instance;
    }
    

    public String[] getHeaders(){
        return new String[]{"Mã KH", "Tên","Phân nhóm","Phân loại","Thanh phan","Han su dung","DVT","Ma NCC"};
    }
    
    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i=0; i<drug.size(); i++){
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }
     public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(drug.get(index).getsMathuoc());
        vt.add(drug.get(index).getsTenthuoc());
        vt.add(drug.get(index).getsPhannhom());
        vt.add(drug.get(index).getsPhanloai());
        vt.add(drug.get(index).getsThanhphan());
        vt.add(drug.get(index).getsHansudung());
        vt.add(drug.get(index).getsDVT());
        vt.add(drug.get(index).getsMancc());
        return vt;
     }
}
