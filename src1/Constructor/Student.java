package src1.Constructor;
// default constructor provide default value
public class Student {
    int id;
    String name;
    void display(){
        System.out.println(id + " "+ name);
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}
