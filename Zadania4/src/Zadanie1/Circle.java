package Zadanie1;

public class Circle {
    public double radius;
    private String color;

    public Circle(){
        radius = 1;
        color = "blue";
    }
    public Circle(double a){
        radius = a;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public String toString(){
        return "Kolor : " + this.color + " promień: " + this.radius;
    }
}

