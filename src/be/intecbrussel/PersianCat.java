package be.intecbrussel;

public class PersianCat extends Felis {

    public PersianCat(String mila, int i) {
    }

    public PersianCat() {

    }

    public PersianCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public PersianCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight, name, age, shelterNo, badgeNo);
    }

    @Override
    public void noise(String noise) {
        super.noise(noise);
    }


    @Override
    public String toString() {
        return "PersianCat{} " + super.toString();

    }


    public boolean equals() {
        return false;
    }


}




