public class U2 extends Rocket {
    public U2() {
        limitWeight = 18_000;
        //cost = 120_000_000;
        cost = 120;
    }

    public boolean launch() {
        double d;
        d = cargoWeigth;
        d /=limitWeight;
        d = d * 4 / 100;
        double r = Math.random();
        return (d < r);
    }

    public boolean land() {
        double d;
        d = cargoWeigth;
        d /=limitWeight;
        d = d * 8 / 100;
        double r = Math.random();
        return (d < r);
    }

}
