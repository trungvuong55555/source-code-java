/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendardemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author BOSS
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar ct = Calendar.getInstance();
        int day = ct.get(Calendar.DATE);
        int month = ct.get(Calendar.MONTH) + 1;
        int year = ct.get(Calendar.YEAR);
        int hour = ct.get(Calendar.HOUR);
        int minute = ct.get(Calendar.MINUTE);
        int seccond = ct.get(Calendar.SECOND);
        
        System.out.println("Thời gian hiện tại: " + hour + ":" + minute + ":" + seccond + " " + day + "/" + month + "/" + year);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date cd = ct.getTime();
        System.out.println("Thời gian hiện tại là: " + sdf.format(cd));
        
        Calendar ct1 = Calendar.getInstance();
        ct1.add(Calendar.DATE, 31);
        Date cd1 = ct1.getTime();
        System.out.println("Thời gian sau 31 ngày là: " + sdf.format(cd1));
        
        if (ct.before(ct1)) {
            System.out.println(sdf.format(cd) + " trước " + sdf.format(cd1));
        } else {
            System.out.println(sdf.format(cd) + " sau " + sdf.format(cd1));
        }
        
        Calendar ct3 = Calendar.getInstance();
        ct3.set(Calendar.DATE, 10);
        Date cd3 = ct3.getTime();
        System.out.println(sdf.format(cd3));
        
    }
}
