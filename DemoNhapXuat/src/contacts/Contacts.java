/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author BOSS
 */
public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts() {
    }

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" + "name=" + name + ", phoneNumber=" + phoneNumber + '}';
    }
    
    public static void main(String[] args) {
        Contacts ct = new Contacts("Long", "12345");
        System.out.println(ct.toString());
    }
}
