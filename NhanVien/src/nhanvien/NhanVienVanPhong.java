/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class NhanVienVanPhong extends NhanVien {
    private double mucLuong;
    private int ngayNghi;


    public NhanVienVanPhong() {
        super();
    }

    public NhanVienVanPhong(String hoten, int nam, double mucLuong, int ngayNghi) {
        super(hoten, nam);
        this.mucLuong = mucLuong;
        this.ngayNghi = ngayNghi;
    }
    
    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getNgayNghi() {
        return ngayNghi;
    }

    public void setNgayNghi(int ngayNghi) {
        this.ngayNghi = ngayNghi;
    }

    @Override
    public String toString() {
        return super.toString() + "Muc luong: " + this.mucLuong + ", So ngay nghi: " + this.ngayNghi;
    }

    
    
    @Override
    public double tinhLuong() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Calendar c = Calendar.getInstance();
        return (this.mucLuong - this.ngayNghi * 10000) + (100000 + 20000 * (c.get(Calendar.YEAR) - super.nam));
    }
    
    public void nhapThongTinNhanVien() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap muc luong: ");
        this.mucLuong = sc.nextDouble();
        System.out.println("Nhap so ngay nghi: ");
        this.ngayNghi = sc.nextInt();
    }
    
}
