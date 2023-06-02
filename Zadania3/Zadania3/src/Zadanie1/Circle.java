package Zadanie1;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 4;
        this.color = "niebieski";
    }
    public Circle(double a){
        this.radius = a;
        this.color = "zielony";
    }
    public Circle(double a,String b){
        this.radius = a;
        this.color = b;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public void setRadius(int a){
        this.radius = a;
    }
    public void setColor(String c){
        this.color = c;
    }

    public String toString() {
        return "Okrąg o promieniu " + this.radius + " i kolorze " +  this.color;
    }
}
