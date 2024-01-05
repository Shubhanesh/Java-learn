package src1.Basics;
import java.util.Scanner;
public class Pro0014 {
    public static void main(String[] args) {
        // Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
        // count letters, spaces, numbers and other characters

        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);
    }
        public static void count(String x){
        char[] ch = x.toCharArray();
        int letter=0;
        int spaces=0;
        int number=0;
        int other=0;
     for(int i=0;i<x.length();i++) {
         if (Character.isLetter(ch[i])) {
             letter++;

         }

     else if(Character.isDigit(ch[i])){
         number++;

         }
     else if(Character.isSpaceChar(ch[i])){
         spaces++;
         }
     else {
         other++;
         }

        }
            System.out.println("The String is: Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 ");

            System.out.println("The letter:" +letter);
            System.out.println("The number:" +number);
            System.out.println("The spaces:" +spaces);
            System.out.println("other :"+other);

    }
}
