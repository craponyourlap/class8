package gg;

class Shape{
    void draw(){
        System.out.println("shape");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("square");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("circle");
    }
}
public class main3 {
    public static void main(String[] args){
        //static binding
        Shape staticShape = new Circle();//upcasting
        staticShape.draw();
        //dynamic binding
        Shape dynamicShape = getRandomShape();//dynamic binding
        dynamicShape.draw();/*dynamic binding, calls draw() method based
        on the actual object type*/
    }
    static Shape getRandomShape(){
        if (Math.random()<0.5)return new Circle();
        else return new Square();
    }
}
