package be.intecbrussel;


public class Animal {

    private char size;
    private char coat;
    private String color;
    private double weight;


    protected static int animalCount;

    {
        animalCount++;
    }

    public int animalCount() {

        return animalCount;
    }

    public Animal() {
        super();

    }

    public Animal(char size, char coat, String color, double weight) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void noise(String noise) {
        System.out.println("miaow");
    }

    public void eat() {
        System.out.println("I eat");
    }

    public void sleep() {
        System.out.println("I like to sleep");
    }

    public boolean isAlive(boolean isAlive, boolean isNotAlive) {

        if (isAlive) {
            return true;
        } else {
            return false;

        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }


}
