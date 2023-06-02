package Zadanie2;

public class Sedan extends Car implements Purchase {
    int length;
    public double getSalePrice(){
        if (length>20){
            return regularPrince*0.95;
        }
        else {
            return regularPrince*0.90;
        }
    }
    public String getPucharseInfo(){
        return "SEDAN: ";
    }
    public Sedan(int speed,double regularPrince,String color){
        super(speed,regularPrince,color);
        length = 7;
    }
}
