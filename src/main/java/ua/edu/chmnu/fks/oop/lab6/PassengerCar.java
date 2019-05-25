package ua.edu.chmnu.fks.oop.lab6;

public class PassengerCar extends Car {
    int passengerCount;
    PassengerCar()
    {
        this.passengerCount=0;
    }
    PassengerCar(String carModel, double weight, int maxSpeed,int passengerCount)
    {
        super(carModel,weight,maxSpeed);
        this.passengerCount=passengerCount;
    }

    @Override
    public String toString() {
        return "Car Model:"+carModel+" Weight:"+weight+kgOrTons+" MaxSpeed:"+maxSpeed+ "km/h PassengerCount:"+passengerCount ;
    }
}
