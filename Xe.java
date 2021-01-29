package DangKyXe;

import java.util.Scanner;

public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    
    public int getDungTich(){
        return this.dungTich;
    }
    public void setDungTich(int dungTich){
        this.dungTich = dungTich;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tNhap ten chu xe: ");
        this.tenChuXe = sc.nextLine();
        System.out.print("\t\tNhap loai xe: ");
        this.loaiXe = sc.nextLine();
        System.out.print("\t\tNhap dung tich: ");
        this.dungTich = sc.nextInt();
        System.out.print("\t\tNhap gia: ");
        this.triGia = sc.nextDouble();
        System.out.print("\n");
    }
    public double tinhThue(){
        double thue = 0;
        if(dungTich<100){
            thue = triGia/100;
        }
        else{
            if(thue<200){
                thue = triGia*3/100;
            }
            else{
                thue = triGia*5/100;
            }
        }
        return thue;
    }
    public static void xuatTieuDe(){
        System.out.printf("%-15s %-15s %15s %15s %15s %n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");       
        System.out.printf("*******************************************************************************%n");
    }
    public void xuatDL(){
        System.out.printf("%-15s %-15s %15d %15.1f %15.1f %n ", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
        System.out.print("\n");
    }
    public static void menu(){
        System.out.print("\t\t\t ============MENU=============\n");
        System.out.print("\t\t\t |\t1. Nhap               |\n");
        System.out.print("\t\t\t |\t2. Xuat               |\n");
        System.out.print("\t\t\t |\t3. Thoat              |\n");
        System.out.print("\t\t\t =============================\n");
    }
    public static void main(String[] args){
        int chon, n; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so xe: ");
        n = sc.nextInt();
        Xe[] a = new Xe[n];
        for(int i=0; i<n; i++){
            a[i] = new Xe();
        } 
        do{
            Xe.menu();
            System.out.print("Ban chon: ");
            chon = sc.nextInt();      
            switch(chon){
                case 1:
                    for(int i=0; i<n; i++){
                        System.out.println("\tNhap thong tin xe thu " + i);
                        a[i].nhap();
                    }                   
                    break;
                case 2:
                    Xe.xuatTieuDe();
                    for(int i=0; i<n; i++){
                        a[i].xuatDL();
                    }
                    break;
                case 3:
                    System.out.print("Ban da thoat chuong trinh\n");
                    break;
                default:
                    System.out.print("Ban chon sai. Moi ban chon lai\n");
                    break;
            }
        }while(chon!=3);
    }
}