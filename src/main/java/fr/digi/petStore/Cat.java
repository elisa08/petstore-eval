package fr.digi.petStore;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Cat extends Animal{
    @Column
    private String chipId;

}
