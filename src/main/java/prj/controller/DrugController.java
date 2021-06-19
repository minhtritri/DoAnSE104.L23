/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prj.model.Drug;

/**
 *
 * @author anhha
 */
public class DrugController {

    private ArrayList<Drug> drugs = new ArrayList<>();
    private static DrugController instance = new DrugController();

    public DrugController() {
    }

    public ArrayList<Drug> getList() {
        return drugs;
    }

    public static DrugController getInstance() {
        return instance;
    }

    public String[] getHeaders() {
        return new String[]{"Mã Thuốc", "Tên thuốc", "Phân nhóm", "Phân loại",
            "Thành phần", "Hạn sử dụng", "ĐVT", "Mã NCC"};
    }

    public DefaultTableModel toTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(this.getHeaders());
        for (int i = 0; i < drugs.size(); i++) {
            tblModel.addRow(this.toVector(i));
        }
        return tblModel;
    }

    public Vector toVector(int index) {
        Vector vt = new Vector();
        vt.add(drugs.get(index).getsMathuoc());
        vt.add(drugs.get(index).getsTenthuoc());
        vt.add(drugs.get(index).getsPhannhom());
        vt.add(drugs.get(index).getsPhanloai());
        vt.add(drugs.get(index).getsThanhphan());
        LocalDate dHanSuDung = LocalDate.parse(drugs.get(index).getdHansudung().toString(),
                DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd"));
        vt.add(dHanSuDung.format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        vt.add(drugs.get(index).getsDVT());
        vt.add(drugs.get(index).getsMancc());
        return vt;
    }
}
