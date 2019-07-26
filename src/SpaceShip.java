public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item aItem);
    void carry(Item aItem);
}
