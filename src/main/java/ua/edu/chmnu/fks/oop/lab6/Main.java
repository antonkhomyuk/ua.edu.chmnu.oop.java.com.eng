package ua.edu.chmnu.fks.oop.lab6;

public class Main {
    public static void main(String[] args) {
        Car def = new Car("Car",1,100);
        System.out.println(def);
        PassengerCar passengerCar=new PassengerCar("Lanos",1500,220,5);
        System.out.println(passengerCar);
        FreightCar freightCar=new FreightCar("Man",5000,120,10000);
        freightCar.convertToTons();
        System.out.println(freightCar);
        System.out.println(freightCar.getWeight());
    }
}
