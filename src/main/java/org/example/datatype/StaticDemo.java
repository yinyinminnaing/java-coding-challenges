package org.example.datatype;

public class StaticDemo {

    public static void main(String[] args) {
        Car c1=new Car("Yellow","BMW");
        Car c2=new Car("White", "BMW");
        Car c3=new Car("black","BMW");

        System.out.println(c1.color+" "+c1.carType+" "+c1.serialNo+" "+c1.carCount);
        System.out.println(c2.color+" "+c2.carType+" "+c2.serialNo+" "+c2.carCount);
        System.out.println(c3.color+" "+c3.carType+" "+c3.serialNo+" "+c3.carCount);

    }
}
