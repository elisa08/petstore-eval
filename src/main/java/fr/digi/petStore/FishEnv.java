package fr.digi.petStore;

public enum FishEnv {


    FRESH_WATER("poisson d'eau douce"),
    SEA_WATER("poisson de mer");

    private final String label;

    FishEnv(String label) {
        this.label= label;
    }

    public String getLabel() {
        return label;
    }
}
