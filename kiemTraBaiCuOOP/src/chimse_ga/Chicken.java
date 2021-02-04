/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chimse_ga;

/**
 *
 * @author BOSS
 */
public class Chicken extends Animal implements Flyable{

    @Override
    void grow() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.weight += 3;
    }

    public Chicken() {
        super();
    }

    public Chicken(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void fly() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("I can't fly");
    }
}
