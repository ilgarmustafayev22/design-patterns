package creational.prototype;

public class Main {

    public static void main(String[] args) {
//        Soldier availableSoldier = new Soldier(100, 45, 20, 50, 60, 5, "Sword", true);
//
//        Soldier notAvailableSoldier = availableSoldier.clone();
//        notAvailableSoldier.setAvailableForWar(false);
//
//        availableSoldier.showSoldierInfo();
//        System.out.println("--");
//        notAvailableSoldier.showSoldierInfo();

        SoldierFactory soldierFactory = new SoldierFactory();

        //Battle-ready normal soldier object;
        Soldier availableSoldier = soldierFactory.createAvailableSoldier();

        //Soldier's object unfit for war;
        Soldier notAvailableSoldier = soldierFactory.createNotAvailableSoldier();

        //Soldier object with increased power;
        Soldier morePowerfulSoldier = soldierFactory.createMorePowerfulSoldier(90);

        //Soldier item with increased health;
        Soldier moreHealthySoldier = soldierFactory.createMoreHealthySoldier(150);

        //Information about soldiers;
        availableSoldier.showSoldierInfo();
        System.out.println("--");
        notAvailableSoldier.showSoldierInfo();
        System.out.println("--");
        morePowerfulSoldier.showSoldierInfo();
        System.out.println("--");
        moreHealthySoldier.showSoldierInfo();

    }

}
