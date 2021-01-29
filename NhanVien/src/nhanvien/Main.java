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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NhanVien[] list = new NhanVien[n];
        System.out.print("Nhap ho ten: ");
        String ignore = sc.nextLine();
        String hoten = sc.nextLine();
        System.out.print("Nhap nam bat dau lam viec: ");
        int nam = sc.nextInt();
        System.out.print("Nhap so luong san pham: ");
        int sanPham = sc.nextInt();
        list[0] = new NhanVienSanXuat(sanPham, hoten, nam);
        list[0].xuat();
    }
}
