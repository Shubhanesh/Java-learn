package src1.Basics;

public class Pro0022 {
    public static void main(String[]args){
        String name = "Shubha";
        System.out.println(name.concat(" Aher"));
        System.out.println(name + " Aher");
        System.out.println(name.contains("a"));
        System.out.println(name);

        String name2 = new String("Ganesh");
        String expected_result = "password@123";
        String actual_result  = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result)) {
            System.out.println("Yes");
        }


    }
}
