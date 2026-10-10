class Parent {
    int age , id;
    String name;

    void naming (String name){
        System.out.println("Name:" + name);
    }
}

class Child extends Parent{
        void ageN (int age){
            System.out.println("Age of the student is :" + age);

        }
}

public class OCT10{
    public static void main(String[] args){
        Child s = new Child();

        s.naming("Aadish");
        s.ageN(14);
    }
}