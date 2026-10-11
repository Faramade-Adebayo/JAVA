package L9;
class Parent {
    public void sayHello()
    {
        System.out.println("Hello from Parent");

    }

}
class Child extends Parent {
    @Override
    public void sayHello(){
        System.out.println("Hello form cHild");
    }
}
public class oct112 {
    public static void main(String[]args){
        Parent p= new Child();
        p.sayHello();
    }
}
