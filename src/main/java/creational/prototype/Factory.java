package creational.prototype;

public interface Factory {

    Soldier createAvailableSoldier();
    Soldier createNotAvailableSoldier();
    Soldier createMorePowerfulSoldier(int power);
    Soldier createMoreHealthySoldier(int health);

}
