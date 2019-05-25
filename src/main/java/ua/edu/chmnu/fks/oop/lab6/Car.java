package ua.edu.chmnu.fks.oop.lab6;

public class Car {
    protected String carModel;

    public double getWeight() {
        return weight;
    }

    protected double weight;
    protected int maxSpeed;
    protected String kgOrTons="kg";
    Car()
    {
        this.carModel="";
        this.maxSpeed=0;
        this.weight=0;
    }
    Car(String carModel, double weight, int maxSpeed)
    {
        this.carModel=carModel;
        this.maxSpeed=maxSpeed;
        this.weight=weight;
    }
    void convertToTons()
    {
        this.weight/=1000;
        kgOrTons="t";
    }
    @Override
    public String toString() {
        return "Car Model:"+carModel+" Weight:"+weight+kgOrTons+" MaxSpeed:"+maxSpeed+"km/h";
    }
}
