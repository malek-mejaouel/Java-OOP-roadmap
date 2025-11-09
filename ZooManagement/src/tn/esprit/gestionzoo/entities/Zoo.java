package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int nbmax=25;
    private int nbcg=0;
    public Zoo(String a,String b){
        this.animals = new Animal[nbmax];
        this.city=a;
        this.name=b;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : le nom vide !");
            this.name = "tn.esprit.gestionzoo.entities.Zoo Inconnu";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbcg() {
        return nbcg;
    }

    public void setNbcg(int nbcg) {
        this.nbcg = nbcg;
    }

    public boolean isFull(){
        return nbcg >= nbmax;
    }
    public boolean addAnimal(Animal a){
        if((isFull()) || searchAnimal(a)!=-1){
            System.out.println("tn.esprit.gestionzoo.entities.Zoo is full,no cages!!!");
        }
        else{
            animals[nbcg]=a;
            nbcg++;
            return true;
        }
        return false;
    }
    public void Display(){
        for(int i=0;i<nbcg;i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
        for(int i=0;i<nbcg;i++){
            if(animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal a){
        int pos=searchAnimal(a);
        if(searchAnimal(a)!=-1){
            for (int i = pos; i < nbcg - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[--nbcg] = null;
            return true;
        }
        return false;
    }
    public Zoo comparerZoo(Zoo z1,Zoo z2){
        return (z1.nbcg > z2.nbcg) ? z1 : z2;
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbcg=" + nbcg +
                '}';
    }
}
