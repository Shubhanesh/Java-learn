package src1.Basics;

import java.util.Scanner;

public class Pro006 {
    public static void main(String[] args) {
        // Print the multiplication table

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of input number");
        int a = sc.nextInt();
        for(int i=1; i<=10; i++){

            // System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
            System.out.println(a + "*"+ (i) + "=" + (a*(i)));
        }
    }
}
