package src1.Basics;

import java.util.Scanner;

public class Pro0025 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first user input");
        int a= sc.nextInt();

        System.out.println("Enter the 2nd user input");
        int b=sc.nextInt();
        System.out.println("Enter the value of 3rd user input");
        int c=sc.nextInt();

        System.out.println("Enter the value of 4th user input");
        int d=sc.nextInt();

        if (a==b&& b==c&&c==d){
            System.out.println("The numbers are equal");
        }
        else {
            System.out.println("The numbers are not equal");
        }
    }
}
