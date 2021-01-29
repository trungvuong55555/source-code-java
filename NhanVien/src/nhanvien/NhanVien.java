/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public abstract class NhanVien {
    protected String hoten;
    protected int nam;

    public NhanVien() {
    }

    public NhanVien(String hoten, int nam) {
        this.hoten = hoten;
        this.nam = nam;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "Ho ten: " + this.hoten + ", So nam lam viec: " + this.nam;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien: ");
        this.hoten = sc.nextLine();
        System.out.print("Nhap nam bat dau lam viec: ");
        this.nam = sc.nextInt();
    }
    
    public abstract void xuat();
}
