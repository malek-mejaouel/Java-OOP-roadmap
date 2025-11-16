package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.enums.food;
import tn.esprit.gestionzoo.interfaces.Herbivore;
public class Terrestrial extends Animal implements Herbivore<food>{
    public int nbrLegs;
    public Terrestrial(int a,String name,String family,int age,boolean i){
        super(name,family,age,i);
        this.nbrLegs=a;
    }
    @Override
    public void eatPlant(food plant){
        if (plant == food.Plant || plant == food.BOTH) {
            System.out.println(getName() + " (Aquatic) eats meat.");
        } else {
            System.out.println(getName() + " (Aquatic) does not eat plants.");
        }
    }
}
