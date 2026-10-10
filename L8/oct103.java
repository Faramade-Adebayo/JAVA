package L8;
class Mammals{
        void mam(){
            System.out.println("Insdie Mammals Class");

        }
}
class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion Class");
    }
}
class Human extends Mammals{
    void hum(){
        System.out.println("Inside Human");
    }

}

public class oct103 {
    public static void main(String[] args){
        Lion obj= new Lion();
        obj.roar();
        obj.mam();
    }
    
}
