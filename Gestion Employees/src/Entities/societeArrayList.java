package Entities;
import Interface.IGestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class societeArrayList implements IGestion {
    public ArrayList<Employe> empAL;
    public societeArrayList(){
        empAL = new ArrayList<>();
    }
    public void ajouterEmploye(Employe e) {
        e = new Employe();
        empAL.add(e);
    }

    @Override
    public void ajouterEmploye(Object o) {

    }

    public boolean rechercherEmploye(String nom){
        for ( int i =0; i<empAL.size();i++){
            if(empAL.get(i).getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Object o) {
        return false;
    }

    @Override
    public void supprimerEmploye(Object o) {

    }

    public boolean rechercherEmploye(Employe e){
        for(int i=0;i<empAL.size();i++){
            if(empAL.get(i).equals(e)){
                return true;
            }
        }
        return false;
    }
    public void supprimerEmploye(Employe e){
        int index=0;
       for(int i=0;i<empAL.size();i++){
           if(rechercherEmploye(e)){
               index=i;
           }
       }
       empAL.remove(index);
    }
    public void displayEmploye(){
        if(empAL.isEmpty()){
            System.out.println("Vide");
        }
        else {
            for ( int i=0;i<empAL.size();i++){
                System.out.println(empAL.get(i).toString());
            }
        }
    }

    public int compareTo(Employe e){
        return Integer.compare(e.getId(),e.getId());
    }
    public void trierEmployeParId(){
        Collection.sort(empAL);
    }
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        empAL.sort(
                Comparator.comparing(Employe::getNom)
                        .thenComparing(Employe::getDepname)
                        .thenComparing(Employe::getGrade)
        );
    }

}
