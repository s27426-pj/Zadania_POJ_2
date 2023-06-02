package Zadanie1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
            height = 4;
        }
    public Cylinder(double a){
        this.radius = a;
        height = 7;
    }
    public Cylinder(double a,double b){
        this.radius = a;
        height = b;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
