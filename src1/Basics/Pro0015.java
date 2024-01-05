package src1.Basics;

public class Pro0015 {
    public static void main(String[] args) {
        int amount=0;
        // display a unique three-digit number using 1, 2, 3, 4.
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
              for(int k=1;k<=4;k++){
                  if (k!=j&& k!=i&&i!=j){
                      amount++;
                      System.out.println(i+ "" +j+ ""+k);
                  }
              }
            }
        }
        System.out.println("Total number of 3 digit number is :"+ amount);
    }
}
