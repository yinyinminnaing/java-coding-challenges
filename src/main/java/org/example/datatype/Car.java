package org.example.datatype;

public class Car {
    public static int carCount;
    public String color;
    public String carType;

    public int serialNo;

    static {
        carCount=3;
    }
    {
        color="red";
        carType="mercedes";
    }

    public Car(){
        carCount++;
        serialNo=carCount;
    }
    Car(String c,String t){
        this.color=c;
        this.carType=t;
        carCount++;
        this.serialNo=carCount;
    }
    String getDescription(){
        String desc="This is a "+color+" and "+carType;
        return desc;
    }
    public void customizeCar(String color,String carType){
        this.color=color;
        this.carType=carType+ " " + carType;
        System.out.println(getDescription());
    }
}
