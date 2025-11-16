package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.Exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.Exceptions.ZooFullException;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.setName("Simba");
        try{
            a.setAge(18);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        Zoo z = new Zoo("bouzalfa","bouzalfa");
        try {
            z.addAnimal(a);
        } catch(ZooFullException e){
            System.out.println(e.getMessage());
        }
        z.Display();
        Terrestrial c=new Terrestrial(6,"Terrestrial","kk",22,true);
        Dolphin d=new Dolphin(12,"qq","aa","Dolphin",11,false);
        Penguin e=new Penguin(12,"aa","bb","Penguin",145,false);

    }
}