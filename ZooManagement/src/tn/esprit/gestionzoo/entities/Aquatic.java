package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.enums.food;
import tn.esprit.gestionzoo.interfaces.Carnivore;
public sealed abstract class Aquatic extends Animal implements Carnivore<food> permits Dolphin,Penguin  {
    public String habitat;

    @Override
    public String toString() {
        return  super.toString()+"Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public Aquatic(String a, String family, String name, int age, boolean i){
        super(family,name,age,i);
        this.habitat=a;
    }
    abstract public void swim();
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if (obj instanceof Aquatic a){
            return a.getName().equalsIgnoreCase(getName()) && a.getAge()==getAge()&& a.habitat.equalsIgnoreCase(habitat);
        }
        return false;
    }
    @Override
    public void eatMeat(food meat){
        if ( meat == food.Meat || meat == food.BOTH) {
            System.out.println(getName() + " (Aquatic) eats meat.");
        } else {
            System.out.println(getName() + " (Aquatic) does not eat plants.");
        }
    }
}
