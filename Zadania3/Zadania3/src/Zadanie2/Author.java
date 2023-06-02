package Zadanie2;

public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(){
        name = "Adam";
        surname = "Mickiewicz";
        age = 36;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return "Imię: " + this.name + " Nazwisko: " + this.surname + " Wiek: " + this.age;
    }
}
