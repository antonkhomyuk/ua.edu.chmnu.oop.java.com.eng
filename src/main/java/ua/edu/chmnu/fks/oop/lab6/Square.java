package ua.edu.chmnu.fks.oop.lab6;

public class Square implements ShapeCalculable, ShapeMoveable {
    private int x;
    private int y;
    private int a;

    public String toString() {
        return "Square{" +
                "x = " + x +
                ", y = " + y +
                ", a = " + a +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                "}";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Square(int x, int y, int a) {

        this.x = x;
        this.y = y;
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}

