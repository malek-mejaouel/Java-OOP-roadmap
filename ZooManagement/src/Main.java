public class Main {
    public static void main(String[] args){
        Animal a = new Animal("lions","Asta",18,true);
        Zoo z = new Zoo("bouzalfa","bouzalfa");
        z.addAnimal(a);

        z.Display();
    }
}