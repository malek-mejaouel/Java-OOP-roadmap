package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal("lions","Asta",18,true);
        Zoo z = new Zoo("bouzalfa","bouzalfa");
        z.addAnimal(a);

        z.Display();
    }
}