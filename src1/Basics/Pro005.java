package src1.Basics;

import java.util.Scanner;

public class Pro005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a= sc.nextInt();

        System.out.println("Enter the value of b");
        int b= sc.nextInt();

        System.out.println("Addtion od 2 number:" + (a+b));
        System.out.println("Subtract of 2 number:" + (a-b));
        System.out.println("Multiplication of 2 number:" + a*b);
        System.out.println("Division of 2 number :" + a/b);

    }
}
