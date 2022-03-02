package be.intecbrussel;

public class NorwegianForestCat extends Felis {

    public NorwegianForestCat() {
    }

    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public NorwegianForestCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight, name, age, shelterNo, badgeNo);
    }

    @Override
    public void noise(String noise) {
        super.noise(noise);
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{} " + super.toString();

    }
}


