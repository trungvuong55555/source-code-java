/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomdemo;

import java.util.Random;

/**
 *
 * @author BOSS
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        double rd = r.nextDouble();
        float rf = r.nextFloat();
        int ri = r.nextInt();
        int ri10 = r.nextInt(10);
        System.out.println("Số ngẫu nhiên thuộc kiểu double: " + rd);
        System.out.println("Số ngẫu nhiên thuộc kiểu float: " + rf);
        System.out.println("Số ngẫu nhiên thuộc kiểu int: " + ri);
        System.out.println("Số ngẫu nhiên thuộc kiểu int trong khoảng từ 0 đến 10: " + ri10);
    }
}
