/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chimse_ga;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chicken ck = new Chicken();
        Sparrow sp = new Sparrow();
        
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap ten: ");
                String name = sc.nextLine();
                ck.setName(name);
                System.out.print("Nhap can nang: ");
                double weight = Double.parseDouble(sc.nextLine());
                ck.setWeight(weight);


                System.out.print("Nhap ten: ");
                name = sc.nextLine();
                sp.setName(name);
                System.out.print("Nhap can nang: ");
                weight = Double.parseDouble(sc.nextLine());
                sp.setWeight(weight);
                ck.grow();
                sp.grow();

                ck.show();
                ck.fly();

                sp.show();
                sp.fly();
                break;
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        } while(true);
    }
    
}
