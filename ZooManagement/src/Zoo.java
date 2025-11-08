import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbcg;
    public Zoo(String a,String b){
        this.animals = new Animal[25];
        this.city=a;
        this.name=b;
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
