package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

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
        setAge(c);
        this.family=a;
        this.isMammal=d;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : l'âge négatif !");
            this.age = 0;
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
