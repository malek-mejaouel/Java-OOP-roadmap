package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exceptions.InvalidAgeException;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(){}
    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Animal(String a , String b, int c, boolean d){
        this.name=b;
        this.age=age;
        this.family=a;
        this.isMammal=d;
    }
    public void setAge(int age)  throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age must be positive");
        } else {
            this.age = age;
        }
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
