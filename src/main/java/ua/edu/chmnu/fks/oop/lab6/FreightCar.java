package ua.edu.chmnu.fks.oop.lab6;

public class FreightCar extends Car {
    public double getMaxWeight() {
        return maxWeight;
    }

    double maxWeight;
    FreightCar()
    {
        this.maxWeight=0;
    }
    FreightCar(String carModel, double weight, int maxSpeed, double maxWeight)
    {
        super(carModel, weight, maxSpeed);
        this.maxWeight=maxWeight;
    }
    void convertToTons()
    {
        super.convertToTons();
        this.maxWeight/=1000;
    }

    @Override
    public String toString() {
        return "Car Model:"+carModel+" Weight:"+weight+kgOrTons+" MaxSpeed:"+maxSpeed+ "km/h MaxWeight:"+maxWeight+kgOrTons;
    }
}
