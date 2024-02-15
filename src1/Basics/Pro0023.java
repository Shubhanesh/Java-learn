package src1.Basics;

public class Pro0023 {
    public static void main(String[] args) {

        int a=12;
        int b=23;
        int c=25;



        int min = (a<  b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        System.out.println("The smallest no "  +min);




    }
}
