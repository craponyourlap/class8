package gg;

class Animal{
    void sound(){
        System.out.println("animal");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("dog");
    }
}
public class main2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
