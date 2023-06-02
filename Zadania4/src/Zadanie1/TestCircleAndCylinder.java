package Zadanie1;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle A = new Circle();
        Circle B = new Circle(4);
        Cylinder C = new Cylinder();
        Cylinder D = new Cylinder(44);
        Cylinder E = new Cylinder(12,123);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println("Test getRadius: " + A.getRadius());
        System.out.println("Test getArea: " + B.getArea());
        System.out.println("Test get Height: " + C.getHeight());
        System.out.println("Test get volume i konstruktorów: ");
        System.out.println(C.getVolume());
        System.out.println(D.getVolume());
        System.out.println(E.getVolume());
    }
}
