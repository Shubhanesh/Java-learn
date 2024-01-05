package src1.Basics;

public class Pro0018 {
    public static void main(String[] args) {
        // no devided by 3
        System.out.println("\ndevided by 3:");
        for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.println(i + "");
            }
        }
        System.out.println("\ndevided by 5:");
        for(int i=1;i<=100;i++){
            if(i%5==0){
                System.out.println(i + "");
            }
        }
        System.out.println("\nDevided by 3 and 5 :");
        for(int i=1;i<=100;i++){
            if(i%3==0&& i%5==0){
                System.out.println(i+ "");
            }
        }
    }
}
