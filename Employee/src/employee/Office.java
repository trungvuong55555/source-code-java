/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Calendar;

/**
 *
 * @author BOSS
 */
public class Office extends Employee {
    protected int ngaynghi;
    protected int mucluong;

    @Override
    public double getLuong() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates./
        Calendar c= Calendar.getInstance();
        int namhientai = c.get(Calendar.YEAR);
        return mucluong - ngaynghi*10000+(namhientai-this.nam)*20000+100000;
    }

    @Override
    public void xuat() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("%-20s%-7d%-20f",this.hoten,this.nam,this.getLuong());
        
    }

    public Office(int ngaynghi, int mucluong, String hoten, int nam) {
        super(hoten, nam);
        this.ngaynghi = ngaynghi;
        this.mucluong = mucluong;
    }
    
    
   
}
