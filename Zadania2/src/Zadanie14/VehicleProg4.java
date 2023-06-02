package Zadanie14;

import Zadanie13.Vehicle3;

public class VehicleProg4 {
    public static void main(String[] args) {
        Vehicle4 miniVan = new Vehicle4();
        miniVan.setPassengers(7);
        miniVan.setFuelcap(60);
        miniVan.setLkm(6.5);
        Vehicle4 sportsCar = new Vehicle4();
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(40);
        sportsCar.setLkm(8);
        System.out.println("Minivan" + miniVan.range());
        System.out.println("Auto sportowe" + sportsCar.range());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Minivan " + miniVan.przej());
        System.out.println("Auto sportowe " + sportsCar.przej());
    }
}
