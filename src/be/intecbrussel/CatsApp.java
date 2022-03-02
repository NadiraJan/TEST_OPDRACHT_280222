package be.intecbrussel;


import static be.intecbrussel.Animal.animalCount;
import static be.intecbrussel.Felis.*;

public class CatsApp {
    public static void main(String[] args) {

        Animal animal = new Animal();

        NorwegianForestCat nfc = new NorwegianForestCat();
        nfc.setName("Andy");
        nfc.setAge(5);
        nfc.setShelterNo(523);
        nfc.setBadgeNo(444);
        nfc.setSize('s');
        nfc.setCoat('l');
        nfc.setColor("black");
        nfc.setWeight(3.3);

        SiameseCat sc = new SiameseCat();
        sc.setName("Maya");
        sc.setAge(4);
        sc.setShelterNo(333);
        sc.setBadgeNo(543);
        sc.setSize('m');
        sc.setCoat('s');
        sc.setColor("grey");
        sc.setWeight(2.5);

        PersianCat pc = new PersianCat();
        pc.setName("Mila");
        pc.setAge(8);
        pc.setShelterNo(333);
        pc.setBadgeNo(543);
        pc.setSize('l');
        pc.setCoat('m');
        pc.setColor("white");
        pc.setWeight(3.0);

        TurkishVanCat tvc = new TurkishVanCat();
        tvc.setName("Zet");
        tvc.setAge(6);
        tvc.setShelterNo(562);
        tvc.setBadgeNo(225);
        tvc.setSize('l');
        tvc.setCoat('m');
        tvc.setColor("blue");
        tvc.setWeight(2.0);

        AndeanMountainCat amc = new AndeanMountainCat();
        amc.setName("Feline");
        amc.setAge(7);
        amc.setShelterNo(143);
        amc.setBadgeNo(324);
        amc.setSize('l');
        amc.setCoat('s');
        amc.setColor("brown");
        amc.setWeight(4.0);

        SiameseCat copy = new SiameseCat();
        copy.setName("Maya");
        copy.setAge(4);
        copy.setShelterNo(333);
        copy.setBadgeNo(543);
        copy.setSize('m');
        copy.setCoat('s');
        copy.setColor("grey");
        copy.setWeight(2.5);

        PersianCat copy2 = new PersianCat();
        copy2.setName("Mila");
        copy2.setAge(8);
        copy2.setShelterNo(333);
        copy2.setBadgeNo(543);
        copy2.setSize('l');
        copy2.setColor("white");
        copy2.setWeight(3.0);

        Felis[] felis = new Felis[7];

        felis[0] = pc;
        felis[1] = sc;
        felis[2] = nfc;
        felis[3] = tvc;
        felis[4] = amc;
        felis[5] = copy;
        felis[6] = copy2;

        System.out.println(pc.toString());
        System.out.println();
        System.out.println(sc.toString());
        System.out.println();
        System.out.println(nfc.toString());
        System.out.println();
        System.out.println(tvc.toString());
        System.out.println();
        System.out.println(amc.toString());
        System.out.println();
        System.out.println(copy.toString());
        System.out.println();
        System.out.println(copy2.toString());
        System.out.println();
        System.out.println();

        System.out.println("hashcode of Persian Cat is:  " + pc.hashCode());
        System.out.println("hashcode of Siamese Cat is " + sc.hashCode());
        System.out.println("siamese cat en copy2 of persian cat have the same value: " + sc.equals(copy2));
        System.out.println();


        if (pc instanceof Felis) {
            PersianCat persianCat = pc;
            pc.miaow(5);
        }

        System.out.println();

        if (tvc instanceof Felis) {
            TurkishVanCat turkishVanCat = tvc;
            tvc.eat();
        }
        System.out.println();


        setNoOfVaccinatedCats(vaccinationCount - 1);

        amc.isAlive(false);
        if (false) {
            System.out.println("a cat is died and a number of vaccinatedCats: " + getNoOfVaccinatedCats());
        }

        System.out.println("a number of vaccinated cats: " + getNoOfVaccinatedCats());

        System.out.println("a number of animals: " + animal.animalCount());
        System.out.println();

    }
}









