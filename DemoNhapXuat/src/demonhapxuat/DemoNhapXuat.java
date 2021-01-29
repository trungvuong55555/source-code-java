/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonhapxuat;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class DemoNhapXuat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Nhập số thứ nhất: ");
        num1 = sc.nextInt();
        System.out.println("Nhâp số thứ hai: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Tổng của " + num1 + " và " + num2 + " là: 1" + sum);
    }
    
}
