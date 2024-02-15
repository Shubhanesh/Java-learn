package src1.BasicPractice;

public class LOgicalOR {
    public static void main(String[] args) {
       int a= 10;
       int b=20;
       int c=5;
        System.out.println(a>b||a<c);// false||false= f
        System.out.println(a>b||a++<c);//false || false=f
        System.out.println(a);//11
        System.out.println();
    }
}
