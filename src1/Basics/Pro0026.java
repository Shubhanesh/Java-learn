package src1.Basics;
//Write a Java program to print the contents of a two-dimensional Boolean array
// where t represents true and f represents false.
public class Pro0026 {
    public static void main(String[] args) {
      boolean  arr[][] = {{true,false,true},{false,true,false}};
      int rows_length= arr.length;

      int column_length= arr[0].length;

      for (int i=0; i<rows_length;i++){
          for(int j=0;j<column_length;j++) {
              if (arr[i][j]) {
                  System.out.println("t");
              } else {
                  System.out.println("f");
              }
          }
              System.out.println();

          }
      }
    }

