package javase;

public class _17_Encapsulation {

    private String name;
    private String surname;

    //alt+ıns

    //getter and setter
    public String getName() {
        return name;
    }

    public _17_Encapsulation setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public _17_Encapsulation setSurname(String surname) {
        this.surname = surname;
        return this;
    }
}
