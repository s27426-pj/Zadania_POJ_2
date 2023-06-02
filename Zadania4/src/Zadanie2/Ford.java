package Zadanie2;

public class Ford extends Car implements Purchase{
    public int year;
    public int manufacturerDiscount;

    public double getSalePrince(){
        return regularPrince-manufacturerDiscount;
    }
    public String getPucharseInfo(){
        return "FORD: ";
    }
    public Ford(int speed,double regularPrince,String color){
        super(speed,regularPrince,color);
        year = 1999;
        manufacturerDiscount=400;
    }
    public Ford(int speed,double regularPrince,String color,int year){
        super(speed,regularPrince,color);
        this.year = year;
        manufacturerDiscount=400;
    }
}
