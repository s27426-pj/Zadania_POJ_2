package Zadanie9;
import java.io.IOException;


public class zadanie9 { //a=97 z=122 d=100
    public static void main(String[] args) {
        int a;
        System.out.println("Pomyślałem liczbę z zakresu od A do Z");
        try {
            System.out.println("Odgadnij ją:");
            a = System.in.read();
            if (a==100){
                System.out.println("Dobrze!");
            } else {
                if (a > 96) {
                    if (a < 100) {
                        System.out.println("Źle!");
                        System.out.println("Podaj wyższą!");

                    }
                    if (a < 123) {
                        if (a > 100) {
                            System.out.println("Źle!");
                            System.out.println("Podaj niższą!");
                        } }}}}
        catch (IOException e){
            System.out.println("Błąd odczytu");
        }}}



