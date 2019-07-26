public class SpaceChallenge {
    public static void main( String [] args ) {

        Simulation s = new Simulation();

        int cost = s.runSimulation(
                        s.loadU1(
                                s.loadItems("c:\\tmp\\phase-1.txt")
                                )
                        );
        System.out.println("Koszt dla raket U1: " + cost + " milionów");

        cost = s.runSimulation(
                s.loadU2(
                        s.loadItems("c:\\tmp\\phase-2.txt")
                )
        );
        System.out.println("Koszt dla raket U2: " + cost + " milionów");
    }
}
