package L7;
class Counter{
    static int number= 10;
    void increment(){
        number=number +1 ;

    }
    public static void main(String[] args){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.increment();
        obj2.increment();
        obj3.increment();

        System.out.println("Value in obj1: " + obj1.number);
        System.out.println("Value in obj2: " + obj2.number);
        System.out.println("Value in obj3: " + obj3.number);
    }
}

