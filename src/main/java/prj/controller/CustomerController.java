/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj.controller;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prj.model.Customer;

/**
 *
 * @author anhha
 */
public class CustomerController {
    private ArrayList<Customer> customers = new ArrayList<>();
    private static CustomerController instance = new CustomerController();

    public CustomerController() {
    }

    public ArrayList<Customer> getList() {
        return customers;
    }

    
    public static CustomerController getInstance() {
        return instance;
    }

    public String[] getHeaders(){
        return new String[]{"Mã KH", "Họ tên","Giới tính","Năm tinh","SĐT"};
    }
    
    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i=0; i<customers.size(); i++){
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }
     public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(customers.get(index).getsMaKH());
        vt.add(customers.get(index).getsHoten());
        vt.add(customers.get(index).getsGioiTinh());
        vt.add(customers.get(index).getsNamSinh());
        vt.add(customers.get(index).getsSdtKH());   
        return vt;
     }
}
