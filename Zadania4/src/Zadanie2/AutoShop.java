package Zadanie2;

public class AutoShop {
    public static void main(String[] args) {
        Sedan Se = new Sedan(200,40000,"blue");
        Ford Fo = new Ford(230,50000,"red");
        Ford Fo2 = new Ford(220,39000,"yellow",2002);
        Truck Tr = new Truck(160,60000,"pink");
        System.out.println(Se.getPucharseInfo()+Se.getSalePrice());
        System.out.println(Fo.getPucharseInfo()+Fo.getSalePrince());
        System.out.println(Fo2.getPucharseInfo()+Fo2.getSalePrince());
        System.out.println(Tr.getPucharseInfo()+Tr.getSalePrice());

    }
}
