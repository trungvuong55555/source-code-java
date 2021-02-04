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
public abstract class Animal {
    String name;
    double weight;
    
    abstract void grow ();
    public void show () {
        System.out.println("Name: " + this.name + ", weight: " + this.weight);
    }

    public Animal() {
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) throws Exception{
        if (name.trim().length() == 0) {
            throw new Exception("Tên không được để trống");
        } else {
            this.name = name;
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
