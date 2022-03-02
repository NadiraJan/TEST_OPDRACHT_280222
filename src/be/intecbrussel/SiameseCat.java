package be.intecbrussel;

public class SiameseCat extends Felis {

    public SiameseCat() {

    }

    public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public SiameseCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight, name, age, shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "SiameseCat{} " + super.toString();
    }


}

