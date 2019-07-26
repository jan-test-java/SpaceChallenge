public class U1 extends Rocket {
    public U1() {
        limitWeight = 10_000;
        //cost = 100_000_000;
        cost = 100;
    }

    public boolean launch() {
        double d;
        d = cargoWeigth;
        d /=limitWeight;
        d = d * 5 / 100;
        double r = Math.random();
        return (d < r);
    }

    public boolean land() {
        double d;
        d = cargoWeigth;
        d /=limitWeight;
        d = d * 1 / 100;
        double r = Math.random();
        return (d < r);
    }
}
