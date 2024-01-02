package src1;

public class Lab002 {
    public static void main(String[] args) {

        int itemcode= 002;

        switch (itemcode){
            case 001,002,003:
                System.out.println("This is electronics gadget");
                break;
            case 004,005,006:
                System.out.println("This is mechanical gadget");
                break;
            default:
                System.out.println("it is software product");
        }
    }
}
