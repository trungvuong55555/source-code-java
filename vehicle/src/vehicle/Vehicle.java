/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class Vehicle {

    private double giaxe;
    private int dungtich;
    private String tenchuxe;
    private String loaixe;
    
    public Vehicle()
    {
        
    }

    public Vehicle(double giaxe, int dungtich, String tenchuxe, String loaixe) {
        this.giaxe = giaxe;
        this.dungtich = dungtich;
        this.tenchuxe = tenchuxe;
        this.loaixe = loaixe;
    }

    public double getGiaxe() {
        return giaxe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public String getTenchuxe() {
        return tenchuxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setGiaxe(double giaxe) {
        this.giaxe = giaxe;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }
    
    public double getthue()
    {
        if(dungtich<=100)
        {
            return 0.01*giaxe;
        }
        else if(dungtich >100 && dungtich<=200)
        {
            return 0.03*giaxe;
        }
        else
            return 0.05*giaxe;
    }
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten chu xe: ");
        this.tenchuxe = sc.nextLine();
        System.out.println("nhap gia xe: ");
        this.giaxe= sc.nextDouble();
        System.out.println("nhap loai xe: ");
        this.loaixe=sc.next();
        System.out.println("nhap dung tich xe: ");
        this.dungtich=sc.nextInt();
        
    }
    /*
    public void tieude()
    {
        System.out.printf("%-15s %-15s %15s %15s %15s %n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop"); 
    }
    */
    public void xuat()
    {
        System.out.printf("%-15s %-15s %15s %15s %15s %n",tenchuxe,giaxe,loaixe,dungtich,getthue());
    }
    
    public static void main(String[] args) {
        Vehicle[] a= new Vehicle[3];
        
        for(int i=0;i<3;i++)
        {
            a[i]=new Vehicle();
        }
        
        for(int i=0;i<3;i++)
        {
            System.out.println("nhap xe thu: "+(i+1));
            a[i].nhap();
            
        }
        
        System.out.printf("%-15s %-15s %15s %15s %15s %n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        for(int i=0;i<3;i++)
        {
            a[i].xuat();
        }
        
    }
    
}
