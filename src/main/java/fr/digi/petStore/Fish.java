package fr.digi.petStore;

import javax.persistence.*;

@Entity
public class Fish extends Animal{
    @Enumerated(EnumType.STRING)
    FishEnv livingPlace;

    public FishEnv getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(FishEnv livingPlace) {
        this.livingPlace = livingPlace;
    }
}
