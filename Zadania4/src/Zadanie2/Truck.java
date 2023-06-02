package Zadanie2;

public class Truck extends Car implements Purchase{
    public int weight;
    public double getSalePrice(){
        if (weight>2000){
            return regularPrince*0.90;
        }
        else {
            return regularPrince;
        }
    }
    public String getPucharseInfo(){
        return "TRUCK: ";
    }
    public Truck(int speed,double regularPrince,String color){
        super(speed,regularPrince,color);
        weight = 4000;
    }
}
