/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.ArrayList;

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
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("C2018", "NamDinh", "Bui Duc Long", 20, 3.2f));
        students.add(new Student("F2018", "HaNoi", "Vuong Ta Cuong", 20, 4.2f));
        students.add(new Student("A2018", "HungYen", "Bui Quoc Anh", 20, 4.2f));
        students.add(new Student("C2017", "HaNoi", "Le Hai Long", 20, 3.5f));
        
        Student.sortList(students);
        Student.displayList(students);
        
        System.out.println(students.get(0).equals(students.get(1)));
    }
    
}
