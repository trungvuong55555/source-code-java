/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author BOSS
 */
public class Subject {
    private String subjectName;
    private float amountOfCredits;
    private float point;

    public Subject() {
    }

    public Subject(String subjectName, float amountOfCredits, float point) {
        this.subjectName = subjectName;
        this.amountOfCredits = amountOfCredits;
        this.point = point;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getAmountOfCredits() {
        return amountOfCredits;
    }

    public void setAmountOfCredits(float amountOfCredits) {
        this.amountOfCredits = amountOfCredits;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
    
    public void xuat() {
        System.out.printf("%15s%15f%10f%n", this.subjectName, this.amountOfCredits, this.point);
    }
}
