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
public class NhanVienSanXuat extends NhanVien{
    private int sanPham;

    
    public NhanVienSanXuat() {
        super();
    }

    public NhanVienSanXuat(int sanPham, String hoten, int nam) {
        super(hoten, nam);
        this.sanPham = sanPham;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", San pham: " + this.sanPham;
    }
    
    @Override
    public double tinhLuong() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Calendar c = Calendar.getInstance();
        return (this.sanPham * 10000) + (100000 + 20000 * (c.get(Calendar.YEAR) - super.nam));
    }
    
    public void nhapThongTinNhanVien() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so luong san pham: ");
        this.sanPham = sc.nextInt();
    }
    
    public void xuat() {
//        super.xuat();
//        System.out.printf("%5d", this.sanPham);
        System.out.printf("%-15s%6d%7d", this.hoten, this.nam, this.sanPham);
    }
}
