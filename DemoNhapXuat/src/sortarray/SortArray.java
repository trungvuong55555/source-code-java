/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class SortArray {
    static void nhap(int[] arr) {
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
        }
    }
    
    static void hienThi(int[] arr) {
        System.out.println("Mảng vừa nhập là: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    static void sapXep(int[] arr) {
        Arrays.sort(arr);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử trong mảng: ");
        n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        nhap(arr);
        hienThi(arr);
        sapXep(arr);
    }
}
