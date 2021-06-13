/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Customer;

/**
 *
 * @author anhha
 */
public class CustomerController {
    private ArrayList<Customer> customer = new ArrayList<>();
    private static CustomerController instance = new CustomerController();

    public CustomerController() {
    }

    public ArrayList<Customer> getList() {
        return customer;
    }

    
    public static CustomerController getInstance() {
        return instance;
    }

    public String[] getHeaders(){
        return new String[]{"Mã KH", "Họ tên","Giới Tính","Năm Sinh","SĐT"};
    }
    
    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i=0; i<customer.size(); i++){
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }
     public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(customer.get(index).getsMaKH());
        vt.add(customer.get(index).getsHoten());
        vt.add(customer.get(index).getsGioiTinh());
        vt.add(customer.get(index).getsGioiTinh());
        vt.add(customer.get(index).getsSdtKH());
        
        return vt;
     }
}
