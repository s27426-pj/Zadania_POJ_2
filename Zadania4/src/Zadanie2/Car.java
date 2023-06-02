package Zadanie2;

public class Car {
    public int speed;
    public double regularPrince;
    public String color;

    public double getSalePrince(){
        return regularPrince;
    }

    public Car(int speed,double regularPrince,String color){
        this.speed=speed;
        this.regularPrince=regularPrince;
        this.color=color;
    }

}
