/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.time.Year;
import java.util.Calendar;


public class Worker extends Employee {
    protected int sanpham;

    @Override
    public double getLuong() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Calendar c = Calendar.getInstance();
        
        return sanpham*10000 + 100000 +(c.get(Calendar.YEAR)-this.nam);
    }

    @Override
    public void xuat() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("%-20s%-7d%-20f",this.hoten,this.nam,this.getLuong());
        
    }

    public Worker(int sanpham, String hoten, int nam) {
        super(hoten, nam);
        this.sanpham = sanpham;
    }
    
    
    
}
