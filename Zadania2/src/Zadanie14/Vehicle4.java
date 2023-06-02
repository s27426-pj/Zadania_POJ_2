package Zadanie14;

public class Vehicle4 {
    int passengers;
    int fuelcap;
    double lkm;

    public int getPassengers(){
        return passengers;
    }
    void setPassengers(int p){
        this.passengers = p;
    }
    public int getFuelcap(){
        return fuelcap;
    }
    void setFuelcap(int l){
        this.fuelcap = l;
    }
    public double getlkm(){
        return lkm;
    }
    void setLkm(double a){
        this.lkm = a;
    }

    public String range(){
        return " przewozi " + this.passengers + " osób na odległość do " + this.fuelcap/this.lkm + " kilometrów ";
    }
    public String przej(){
        return "potrzebuje " + 444*this.lkm/this.fuelcap + " litrów paliwa";
    }
}
