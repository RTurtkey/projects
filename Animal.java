
public class Animal {

    private String species;

    public Animal() {
        species = "";
    }

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String toString() {
        return "Animal Species: " + species;
    }
}

