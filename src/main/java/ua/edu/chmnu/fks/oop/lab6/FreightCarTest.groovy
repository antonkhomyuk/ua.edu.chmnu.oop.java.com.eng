package ua.edu.chmnu.fks.oop.lab6

class FreightCarTest extends GroovyTestCase {
    FreightCar freightCar=new FreightCar("Man",5000,120,10000)
    void testConvertToTons() {
        freightCar.convertToTons();
        assertEquals(10.0,freightCar.getMaxWeight());
        assertEquals(5.0,freightCar.getWeight());
    }

    void testToString() {
        assertEquals("Car Model:Man Weight:5000.0kg MaxSpeed:120km/h MaxWeight:10000.0kg",freightCar.toString())
    }
}
