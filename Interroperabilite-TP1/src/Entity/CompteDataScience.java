package Entity;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "compte")
public class CompteDataScience implements Serializable{
    private int id;
    private String nom;
    private String prenom;

    public CompteDataScience(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public CompteDataScience() {
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
}
