package fr.digi.petStore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PetStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String managerName;

    @ManyToMany
    @JoinTable(name="Product_PetStore",joinColumns = @JoinColumn(name = "ID_PETSTORE",referencedColumnName = "ID"),
    inverseJoinColumns = @JoinColumn(name = "ID_PRODUCT",referencedColumnName = "ID")
    )
    private Set<Product> products;
    {
        products= new HashSet<>();
    }

    @OneToMany(mappedBy = "petStore")
    private Set<Animal> animals;

    @OneToOne
    private Adresse adresse;

    public PetStore() {
        this.id = id;
        this.name = name;
        this.managerName = managerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void addProducts(Product product){
        products.add(product);
    }
}
