package fr.digi.petStore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date birth;
    private String color;

    @ManyToOne
    @JoinColumn(name = "ID_PETSTORE")
    private PetStore petStore;

    public Animal() {
        this.birth = birth;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    public String toString(){
        return "Animal id : " + this.id+ " , de couleur : " + this.color;
    }
}
