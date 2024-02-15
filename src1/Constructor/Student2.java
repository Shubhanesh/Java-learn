package src1.Constructor;
// Constructor overloading  same name with diff parameter
public class Student2 {
    int id;
    String name;
    int age;
    Student2(int i , String  n)// parameter constructor
    {
        id =i;
        name =n;
    }
    Student2(int i,String n,int a) // parameter constructor
    {
        id=2;
        name =n;
        age =a;
    }
    void display(){
        System.out.println(id+ " "+ name +" "+ age);
    }

    public static void main(String[] args) {
        Student2 s2=new Student2(1,"Shubha",12);
        Student2 s3=new Student2(12,"Ganu");
        s2.display();
        s3.display();


    }
}
