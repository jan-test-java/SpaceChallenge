public class Rocket implements SpaceShip{
    protected int cargoWeigth = 0;
    protected int limitWeight = 0;
    protected int cost = 0;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item aItem) {
        return (cargoWeigth + aItem.getWeigth()) < limitWeight;
    }

    public void carry(Item aItem) {
        cargoWeigth += aItem.getWeigth();
    }

    public int getCost() {
        return cost;
    }
}
