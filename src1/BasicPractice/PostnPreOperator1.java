package src1.BasicPractice;

public class PostnPreOperator1 {
    public static void main(String[] args) {
        int a=12;
        int a1=10;
        System.out.println(a++ + ++a);// a->12 actual -> 12 + 14= 27
        System.out.println(a1++ + a1++);  //10+11
    }
}
