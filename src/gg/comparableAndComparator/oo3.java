package gg.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop>{
    String name;
    int ram;
    int price;

    public Laptop(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName()+"  "+getPrice()+"  "+getRam();
    }


    @Override
    public int compareTo(Laptop o) {
        if(this.ram == o.getRam())return 0;
        if(this.ram < o.getRam())return -1;
        return 1;
    }
}
public class oo3 {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("samsung",7,200));
        laptops.add(new Laptop("asus",6,300));
        laptops.add(new Laptop("macbook",10,600));
        laptops.add(new Laptop("dell",20,400));
        laptops.add(new Laptop("msi",12,450));
        Collections.sort(laptops);
        for (Laptop laptop : laptops){
            System.out.println(laptop.getName());
        }
    }
}
