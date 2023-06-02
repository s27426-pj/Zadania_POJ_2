package Zadanie12;

public class Vehicle2 {
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

    public double range(){
        return this.fuelcap/this.lkm;
    }
}
