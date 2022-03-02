package be.intecbrussel;

import java.util.Objects;

public class Felis extends Animal {

    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;


    public static int vaccinationCount;

    {
        vaccinationCount++;
    }

    public static int vaccinationCount() {
        return vaccinationCount;
    }

    public static int NoOfVaccinatedCats;

    public static int getNoOfVaccinatedCats() {
        return NoOfVaccinatedCats;
    }

    public static void setNoOfVaccinatedCats(int noOfVaccinatedCats) {
        NoOfVaccinatedCats = noOfVaccinatedCats;
    }

    public Felis() {

    }

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public Felis(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight);
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        this.shelterNo = shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;
    }

    @Override
    public boolean isAlive(boolean isAlive, boolean isNotAlive) {
        return super.isAlive(isAlive, isNotAlive);
    }

    @Override
    public void noise(String noise) {
        super.noise(noise);
    }


    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }


    public void miaow(int times) {

        for (int i = 0; i < times; i++) {

            System.out.print(" miaow ");
        }

    }
}