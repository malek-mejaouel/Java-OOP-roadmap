package tn.esprit.gestionzoo.entities;

public non-sealed class Penguin extends Aquatic{
    public float swimmingDepth;
    public Penguin(float s,String habitat,String name,String family,int age,boolean i){
        super(habitat,name,family,age,i);
        this.swimmingDepth=s;

    }
    @Override
    public String toString() {
        return super.toString()+"Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

}
