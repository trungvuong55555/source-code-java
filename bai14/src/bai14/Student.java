/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class Student {
    private String id;
    private String studentName;
    private Class _class;
    private ArrayList<Subject> subjects;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Class get_Class() {
        return _class;
    }

    public void setClass(Class _class) {
        this._class = _class;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    
    public float avgPoint() {
        int soLuongMonHoc = 0;
        float tongDiem = 0;
        for(Subject subject : subjects) {
            soLuongMonHoc+= subject.getAmountOfCredits();
            tongDiem += subject.getPoint();
        }
        return tongDiem / soLuongMonHoc;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        this.studentName = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        this._class = new Class();
        this._class.setClassName(sc.nextLine());
        System.out.print("Nhap khoa: ");
        this._class.setTerm(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap so luong mon hoc: ");
        int soLuongMonHoc = Integer.parseInt(sc.nextLine());
        this.subjects = new ArrayList<>();
        for (int i = 0; i < soLuongMonHoc; i++) {
            Subject subject = new Subject();
            System.out.print("Nhap ten mon hoc: ");
            subject.setSubjectName(sc.nextLine());
            System.out.print("Nhap so trinh: ");
            subject.setAmountOfCredits(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhap diem: ");
            subject.setPoint(Integer.parseInt(sc.nextLine()));
            this.subjects.add(subject);
        }
    }
    
    public void xuatPhieuBaoDiem() {
        System.out.println("==========PHIEU BAO DIEM==========");
        System.out.printf("%-10s%-10s%-10S%-20s%n", "Ma sinh vien: ", this.id, "Ten sinh vien: ", this.studentName);
        System.out.printf("%-10s%-10s%-5s%-5d%-10s%-10f%n", "Lop: ", this._class.getClassName(), "Khoa: ", this._class.getTerm(), "Diem TB: ", this.avgPoint());
        System.out.println("Bang diem: ");
        System.out.printf("%-15s%-15s%-10s%n", "Ten mon hoc", "So trinh", "Diem");
        for(Subject subject : this.subjects) {
            subject.xuat();
        }
    }
}
