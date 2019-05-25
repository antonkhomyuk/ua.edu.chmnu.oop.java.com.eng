package ua.edu.chmnu.fks.oop.lab6;

public class Circle implements ShapeCalculable, ShapeMoveable {
    private int x;
    private int y;
    private int r;

    @Override
    public String toString() {
        return "Circle{" +
                "x = " + x +
                ", y = " + y +
                ", r = " + r +
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

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double area() {
        return r*r*Math.PI;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void moveToOrigin(int origin) {
        this.x = this.y = origin;
    }
}
