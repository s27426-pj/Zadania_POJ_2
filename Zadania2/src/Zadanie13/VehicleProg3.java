package Zadanie13;

public class VehicleProg3 {
    public static void main(String[] args) {
        Vehicle3 miniVan = new Vehicle3();
        miniVan.setPassengers(7);
        miniVan.setFuelcap(60);
        miniVan.setLkm(6.5);
        Vehicle3 sportsCar = new Vehicle3();
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(40);
        sportsCar.setLkm(8);
        System.out.println("Minivan" + miniVan.range());
        System.out.println("Auto sportowe" + sportsCar.range());
    }
}
