package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal("lions","Asta",18,true);
        Zoo z = new Zoo("bouzalfa","bouzalfa");
        z.addAnimal(a);
        z.Display();
        Aquatic b=new Aquatic("h","Aquatic","Louka",13,true);
        Terrestrial c=new Terrestrial(6,"Terrestrial","kk",22,true);
        Dolphin d=new Dolphin(12,"qq","aa","Dolphin",11,false);
        Penguin e=new Penguin(12,"aa","bb","Penguin",145,false);

    }
}