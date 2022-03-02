package be.intecbrussel;

public class Acinonyx extends Animal{

    private double speed;

    public Acinonyx(double speed) {
        this.speed = speed;
    }

    public Acinonyx(char size, char coat, String color, double weight, double speed) {
        super(size, coat, color, weight);
        this.speed = speed;
    }

    public void run(double distance){

        System.out.println("I run");

    }
    public void claw(){
        System.out.println(" I have  a sharp claw");
    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}

