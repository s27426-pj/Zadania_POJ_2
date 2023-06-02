package Zadanie1;

public class TestCircle {
    public static void main(String[] args) {
        Circle A = new Circle();
        Circle B = new Circle(16);
        Circle C = new Circle(44,"żółty");
        Circle D = new Circle();
        D.setRadius(23);
        D.setColor("różowy");
        System.out.println("Pole okręgu A : " + A.getArea());
        System.out.println("Promień okręgu A : " + A.getRadius());
        System.out.println(A.toString());
        System.out.println("Pole okręgu B : " + B.getArea());
        System.out.println("Promień okręgu B : " + B.getRadius());
        System.out.println(B.toString());
        System.out.println("Pole okręgu C : " + C.getArea());
        System.out.println("Promień okręgu C : " + C.getRadius());
        System.out.println(C.toString());
        System.out.println("Pole okręgu D : " + D.getArea());
        System.out.println("Promień okręgu D : " + D.getRadius());
        System.out.println(D.toString());
    }
}
