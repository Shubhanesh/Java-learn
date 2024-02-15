package src1.BasicPractice;

import java.sql.SQLOutput;

public class ANDOPerator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=5;
       // System.out.println(a<b&&a>b);
        //System.out.println(a<b&&b>a);
        System.out.println(a<b&&a++<c); //true&&10<5= false
        System.out.println(a);//11
        System.out.println(a<b&a++<c);// false
        System.out.println(a); //12
    }
}
