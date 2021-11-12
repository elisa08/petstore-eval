package fr.digi.petStore;

public enum ProdType {

    FOOD("nourriture"),
    ACCESSORY("accessoire"),
    CLEANING("netoyage");

    private final String label;

    ProdType(String label) {
        this.label= label;
    }

    public String getLabel() {
        return label;
    }
}
