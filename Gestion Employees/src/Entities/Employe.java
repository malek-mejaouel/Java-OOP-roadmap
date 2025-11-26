package Entities;

import java.util.Objects;

public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String depname;
    private int grade;
    public Employe () {}
    public Employe (int id,String nom,String prenom,String depname,int grade){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.depname=depname;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employe employe)) return false;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, depname, grade);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", depname='" + depname + '\'' +
                ", grade=" + grade +
                '}';
    }

}
