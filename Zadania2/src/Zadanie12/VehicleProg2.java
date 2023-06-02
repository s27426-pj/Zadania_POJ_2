package Zadanie12;
public class VehicleProg2 {
    public static void main(String[] args) {
        Vehicle2 miniVan = new Vehicle2();
        miniVan.setPassengers(7);
        miniVan.setFuelcap(60);
        miniVan.setLkm(6.5);
        Vehicle2 sportsCar = new Vehicle2();
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(40);
        sportsCar.setLkm(8);
        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób.");
        System.out.println("Zasięg (km): " + miniVan.range());
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób.");
        System.out.println("Zasięg (km): " + sportsCar.range());
    }
}
