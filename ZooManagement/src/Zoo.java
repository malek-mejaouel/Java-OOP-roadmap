import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int nbmax=25;
    int nbcg=0;
    public Zoo(String a,String b){
        this.animals = new Animal[nbmax];
        this.city=a;
        this.name=b;
    }
    public boolean isFull(){
        return nbcg >= nbmax;
    }
    public boolean addAnimal(Animal a){
        if((nbcg>=25) || searchAnimal(a)!=-1){
            System.out.println("Zoo is full,no cages!!!");
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
            if(animals[i].name.equals(animal.name)){
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
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbcg=" + nbcg +
                '}';
    }
}
