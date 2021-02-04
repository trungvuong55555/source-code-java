/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author BOSS
 */
public class Main {
    public static void main(String[] args) {
        int demo = 0;
        try {
            System.out.println(12 / demo);
        } catch(ArithmeticException ex) {
            System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
