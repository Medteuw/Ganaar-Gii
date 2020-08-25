package teuw.med.Ganaar.Gi.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Ganaars")
public class Ganaar  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String description;
    private double prix;
    private String photo;

    public Ganaar() {
    }

    public Ganaar(String nom, String description, double prix, String photo) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
