public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String a ,String b,int c, boolean d){
        this.name=b;
        this.age=c;
        this.family=a;
        this.isMammal=d;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
