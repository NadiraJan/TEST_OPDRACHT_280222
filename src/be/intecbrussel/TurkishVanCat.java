package be.intecbrussel;

public class TurkishVanCat extends Felis {

    private String nickname;

    public TurkishVanCat(String nickname) {
        this.nickname = nickname;
    }

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo, String nickname) {
        super(name, age, shelterNo, badgeNo);
        this.nickname = nickname;
    }

    public TurkishVanCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo, String nickname) {
        super(size, coat, color, weight, name, age, shelterNo, badgeNo);
        this.nickname = nickname;
    }

    public TurkishVanCat() {

    }

    @Override
    public String toString() {
        return "TurkishVanCat{" +
                "nickname='" + nickname + '\'' +
                "} " + super.toString();
    }
}
