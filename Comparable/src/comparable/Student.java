/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


/**
 *
 * @author BOSS
 */
public class Student implements Comparable<Student>{
    private String id;
    private String address;
    private String name;
    private int age;
    private float fee;

    public Student() {
    }

    public Student(String id, String address, String name, int age, float fee) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.age = age;
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        if (Float.floatToIntBits(this.fee) != Float.floatToIntBits(other.fee)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", address=" + address + ", name=" + name + ", age=" + age + ", fee=" + fee + '}';
    }

    @Override
    public int compareTo(Student o) {
        if (o.fee - fee > 0) {
            return 1;
        } else if (o.fee - fee == 0) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void sortList(ArrayList<Student> students) {
        Collections.sort(students);
    }
    
    public static void displayList(ArrayList<Student> students) {
        students.forEach((student) -> {
            System.out.println(student);
        });
    }
}
