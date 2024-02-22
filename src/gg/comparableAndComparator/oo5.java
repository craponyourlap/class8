package gg.comparableAndComparator;

import java.util.ArrayList;
import java.util.List;

class Shape{
    void draw(){
        System.out.println("shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("circle");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("square");
    }
}
public class oo5 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        for (Shape shape : shapes) {
            shape.draw();/* dynamic binding (doesn't know which shape until runtime)
             in action*/
        }
    }
}
