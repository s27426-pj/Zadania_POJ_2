package Zadanie11;
public class VehicleProg {
    public static void main(String[] args) {
        Double wynik1,wynik2;

        Vehicle miniVan = new Vehicle();
        miniVan.passengers=7;
        miniVan.fuelcap=60;
        miniVan.lkm=6.5;
        Vehicle sportsCar = new Vehicle();
        sportsCar.passengers=2;
        sportsCar.fuelcap=40;
        sportsCar.lkm=8;

        wynik1 = miniVan.fuelcap/miniVan.lkm;
        wynik2 = sportsCar.fuelcap/sportsCar.lkm;
        System.out.println("miniVan przewozi " + miniVan.passengers);
        System.out.println("Zasięg (km): " + wynik1);
        System.out.println("Auto sportowe przewozi " + sportsCar.passengers);
        System.out.println("Zasięg (km): " + wynik2);
    }}
