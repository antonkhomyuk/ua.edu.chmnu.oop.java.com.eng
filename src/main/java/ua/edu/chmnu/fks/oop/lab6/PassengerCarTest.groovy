package ua.edu.chmnu.fks.oop.lab6

import org.junit.Test

class PassengerCarTest extends GroovyTestCase {
    PassengerCar car=new PassengerCar("Lanos",1500,220,6)
    @Test
    void testConvertToTons() {
        car.convertToTons()
        assertEquals(1.5,car.getWeight());
    }
    @Test
    void testToString() {
        assertEquals("Car Model:Lanos Weight:1500.0kg MaxSpeed:220km/h PassengerCount:6",car.toString())
    }
}
