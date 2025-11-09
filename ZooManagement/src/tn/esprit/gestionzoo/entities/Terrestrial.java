package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    public int nbrLegs;
    public Terrestrial(int a,String name,String family,int age,boolean i){
        super(name,family,age,i);
        this.nbrLegs=a;
    }

}
