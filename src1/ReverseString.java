package src1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Shubhangi";
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
            System.out.println("Reverse string:" + rev);
            System.out.println("Original string:" + str);
        }
    }
