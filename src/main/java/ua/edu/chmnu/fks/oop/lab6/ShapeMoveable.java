package ua.edu.chmnu.fks.oop.lab6;

@FunctionalInterface
public interface ShapeMoveable {
    void move(int x, int y);
    static void moveAll(ShapeMoveable[] shapes, int x, int y)
    {
        for (ShapeMoveable sm : shapes)
        {
            sm.move(x, y);
        }
    }
    default void moveToOrigin(int origin)
    {
        System.out.println("Move to " + origin);
    }
}