package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
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
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
