package src1.Constructor;

public class Student1 {
    int id;
    String name;

    Student1(int i ,String n) {
        id = i;
        name = n;
        System.out.println("This is parameter constructor");
    }
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student1 s1=new Student1(123,"Shubhangi");
        Student1 s2=new Student1(12,"Ganesh");
        s1.display();
        s2.display();

    }
}
