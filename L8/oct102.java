package L8;
class Animal{
    void eat(){
        System.out.println("Eating....Animals class..... eat method");

    }
}
class Lion extends Animal{
        void roar(){
            System.out.println("Roar... Lion class....  roar method");
        }
}
class Babylion extends Lion{
    void weep(){
        System.out.println("weeping..... Bbabylion Class..... weeping method");
    }
}
public class oct102 {
    public static void main(String[] args){
        Babylion obj= new Babylion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
