class shape{
    public double getArea(){
        return 0;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        return 0.5*base*height
    }
}

class Square extends Shape{
    private doubke side;
    public Square(double side){
        return side*side;

    }
}

Class Area{
    public static voidm= main(String [] args){
        Shape[] shape-new Shape[2];

        shape[0]=new Square(5);
        shape[1]=new Triangle(2,2);

        System.out.println("Area of the squaree", +[0].getArea());
        System.out.println("Area of the triangle ", +[1].getArea());
    }
}