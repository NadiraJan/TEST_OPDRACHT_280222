package be.intecbrussel;

public class AndeanMountainCat extends Felis{

    public AndeanMountainCat() {
    }

    public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public AndeanMountainCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight, name, age, shelterNo, badgeNo);
    }





    @Override
    public void noise(String noise) {
        super.noise(noise);
    }



    @Override
    public String toString() {
        return "AndeanMountainCat{} " + super.toString();
    }

    public void isAlive(boolean b) {
    }
}

