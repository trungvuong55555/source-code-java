/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Calendar;
import java.util.Scanner;

public abstract class  Employee {

    protected String hoten;
    protected int nam;
    
    public abstract double getLuong();
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ho ten cua nhan vien: ");
        hoten= sc.nextLine();
        System.out.print("nhap nam bat dau lam viec cua nhan vien: ");
        nam=sc.nextInt();
    }
    
    public abstract void xuat();

    public Employee(String hoten, int nam) {
        this.hoten = hoten;
        this.nam = nam;
    }
    
    
}
