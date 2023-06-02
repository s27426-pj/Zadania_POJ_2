package Zadanie2;

public class TestAuthor {
    public static void main(String[] args) {
        Author A = new Author();

        System.out.println("test toString z domyślnymi wartościami : " + A.toString());

        System.out.println("test getName: " + A.getName());
        System.out.println("test getAge: " + A.getAge());
        A.setSurname("Testowy");
        System.out.println("test setSurname i get Surname: " + A.getSurname());
    }
}
