package ua.edu.chmnu.fks.oop.lab6;

public class ShapeDemo01 {
    public static void main(String[] args) {
        ShapeCalculable sh1 = new Square(100, 200, 350);
        ShapeCalculable sh2 = new Circle(100, 200, 5);

        ShapeMoveable sm1 = (ShapeMoveable) sh1;
        sm1.move(20,-10);
        System.out.println(sh1);
        System.out.println(sh2);

        System.out.println("Moving");
        ShapeMoveable arr1[] = {(ShapeMoveable) sh1, (ShapeMoveable) sh2};
        ShapeMoveable.moveAll(arr1, 10, 50);
        System.out.printf("%s\n%s", sh1, sh2);
    }
}