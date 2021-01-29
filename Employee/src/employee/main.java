/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int m= sc.nextInt();
        int m,n;
        do
        {
            System.out.println("nhap so luong nhan vien van phong: ");
            n= sc.nextInt();
            System.out.println("nhap so luong nhan vien cong nhan: ");
            m= sc.nextInt();
        }while(n<0 || m<0);
        
        Office []a = new Office[n];
        Worker []b = new Worker[m];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap nhan vien van phong thu: "+(i+1));
            System.out.println("nhap ho ten: ");
            String ignore = sc.nextLine();
            String hoten= sc.nextLine();
            System.out.println("nhap nam bat dau lam viec: ");
            int nam= sc.nextInt();
            System.out.println("nhap ngay nghi: ");
            int ngaynghi= sc.nextInt();
            System.out.println("nhap muc luong: ");
            int mucluong= sc.nextInt();
            a[i]= new Office(ngaynghi,mucluong,hoten,nam);
        }
        
        for(int i=0;i<m;i++)
        {
            System.out.println("nhap nhan vien san xuat thu: "+(i+1));
            System.out.println("nhap ho ten: ");
            String ignore = sc.nextLine();
            String hoten= sc.nextLine();
            System.out.println("nhap nam bat dau lam viec: ");
            int nam= sc.nextInt();
            
            System.out.println("nhap so san san pham lam ra: ");
            int sanpham= sc.nextInt();
            
            b[i]= new Worker(sanpham,hoten, nam);
        }
        
        System.out.println("xuat thong tin vua nhap: ");
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
        
        for(int i=0;i<m;i++)
        {
            b[i].xuat();
        }
        
        
    }
}
