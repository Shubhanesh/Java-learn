package src1.Basics;

public class Pro0017 {
    public static void main(String[] args) {
        // write the program no dividable by 3,5 and both
        // user input 1 to 100
        int n= 0;
        for(int i=1;i<=100;i++){
            if(i%3==0&& i%5==0){
                System.out.println("The number is devided by both :" + i);

            }
         else if(i%3==0){
                System.out.println("The number is devided by 3 :" +i) ;
            }
         else if(i%5==0) {
                System.out.println("The number is devided by :5" +i);
            }
         else {
                System.out.println("Other number" +i);
            }
        }

       // System.out.println("\nDivided by 3: ");
       // for (int i = 1; i < 100; i++) {
         //   if (i % 3 == 0)
           //     System.out.print(i + ", ");
    }
}
