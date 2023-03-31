public class Zadanie10 {
    public static void
    main(String[] args) {
        int a=2;
        int d=2;
        int b;
        System.out.println("2 do potęgi 0 wynosi: 1");
        for(int i = 0;i<14;i++){
            b= i + 1;
            System.out.println("2 do potęgi "+ b + " wynosi: " + a);
            a=a*d;
        }


    }
}