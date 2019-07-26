import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {

    public List<Item> loadItems(String aFileName) {

        List<Item> list = new ArrayList<Item>();

        File file = new File(aFileName);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            return list;
        }

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();

            String[] ss = s.split("=");
            int w = Integer.parseInt(ss[1]);
            Item item = new Item(ss[0], w);
            list.add(item);
        }
        return list;
    }

    // aList = loadItems("c:\\tmp\\phase-1.txt");
    public List<Rocket> loadU1(List<Item> aList) {
        List<Rocket> list = new ArrayList<Rocket>();
        U1 rocket = new U1();
        list.add(rocket);

        for (int i=0; i < aList.size() ; i++){
            if (rocket.canCarry(aList.get(i)))
                rocket.carry(aList.get(i));
            else {
                rocket = new U1();
                list.add(rocket);
                if (rocket.canCarry(aList.get(i)))
                    rocket.carry(aList.get(i));
            }
        }
        return list;
    }

    public List<Rocket> loadU2(List<Item> aList) {
        List<Rocket> list = new ArrayList<Rocket>();
        U2 rocket = new U2();
        list.add(rocket);

        for (int i=0; i < aList.size() ; i++){
            if (rocket.canCarry(aList.get(i)))
                rocket.carry(aList.get(i));
            else {
                rocket = new U2();
                list.add(rocket);
                if (rocket.canCarry(aList.get(i)))
                    rocket.carry(aList.get(i));
            }
        }
        return list;
    }

    public int runSimulation(List<Rocket> aList) {
        //boolean crash = false;
        int totalCost = 0;

        for (Rocket r: aList) {
            totalCost += r.getCost();
            if (!r.launch() || !r.land()) {
                //crash = true;
                continue;
            }
        }
        return totalCost;
    }

}
