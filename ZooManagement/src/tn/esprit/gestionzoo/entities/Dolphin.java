package tn.esprit.gestionzoo.entities;

public non-sealed class Dolphin extends Aquatic{
    public float swimmingSpeed;
    public Dolphin(float s,String habitat,String name,String family,int age,boolean i){
        super(habitat,name,family,age,i);
        this.swimmingSpeed=s;
    }

    @Override
    public String toString() {
        return super.toString()+ "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

}
