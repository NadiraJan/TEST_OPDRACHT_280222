package be.intecbrussel;

public class Panthera extends Animal {

    public Panthera() {
    }

    public Panthera(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    @Override
    public void noise(String noise) {
        super.noise(noise);
    }

    public void hunt() {
        System.out.println("I hunt very well");
    }

    @Override
    public String toString() {
        return "Panthera{} " + super.toString();
    }


}

