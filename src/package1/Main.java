package package1;

import java.util.*;

public class Main  {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Acer", 2011, 2, 200,
                new Hdd("hdd1", Type.HDD, 128, Country.USA),
                new Processor("intel pentium", 1, 1.3, Country.USA));

        Computer computer2 = new Computer("Acer", 2017, 8, 900,
                new Hdd("hdd5", Type.SDD, 512, Country.USA),
                new Processor("i5", 4, 1.2, Country.USA));

        Computer computer3 = new Computer("Acer", 2017, 4, 700,
                new Hdd("hdd3", Type.HDD, 256, Country.USA),
                new Processor("i3", 2, 1.2, Country.USA));
        Computer computer4 = new Computer("Acer", 2020, 32, 1500,
                new Hdd("hdd7", Type.HDD, 1024, Country.USA),
                new Processor("i7", 8, 2.4, Country.USA));

        Computer computer5 = new Computer("lenovo", 2011, 4, 250,
                new Hdd("hdd1", Type.HDD, 128, Country.CHINE),
                new Processor("i3", 1, 1.3, Country.JAPON));

        Computer computer6 = new Computer("lenovo", 2015, 4, 400,
                new Hdd("hdd3", Type.SDD, 256, Country.CHINE),
                new Processor("intel pentium", 2, 1.8, Country.USA));

        Computer computer7 = new Computer("lenovo", 2019, 8, 600,
                new Hdd("hdd5", Type.HDD, 512, Country.CHINE),
                new Processor("i5", 8, 1.2, Country.JAPON));

        Computer computer8 = new Computer("lenovo", 2020, 16, 800,
                new Hdd("hdd5", Type.HDD, 1024, Country.USA),
                new Processor("intel pentium", 1, 2.4, Country.INDIA));

        Computer computer9 = new Computer("indus", 2020, 25, 100,
                new Hdd("hdd9", Type.SDD, 666, Country.INDIA),
                new Processor("india pentium", 150, 0.3, Country.INDIA));

        Computer computer10 = new Computer("indus", 2010, 64, 2000,
                new Hdd("hdd7", Type.HDD, 2048, Country.INDIA),
                new Processor("india pentium", 150, 4.3, Country.INDIA));

        Computer computer11 = new Computer("japonamat", 2021, 24, 100,
                new Hdd("hdd9", Type.HDD, 60000, Country.JAPON),
                new Processor("i7", 25, 8.3, Country.JAPON));

        Computer computer12 = new Computer("japonomat", 2020, 23, 100,
                new Hdd("hdd1", Type.HDD, 60000, Country.JAPON),
                new Processor("intel pentium", 1, 1.3, Country.JAPON));

        Computer computer13 = new Computer("Acer", 2011, 2, 500,
                new Hdd("hdd1", Type.HDD, 128, Country.USA),
                new Processor("intel pentium", 4, 1.3, Country.USA));
        Computer computer14 = new Computer("Acer", 2011, 2, 800,
                new Hdd("hdd2", Type.HDD, 512, Country.COREA),
                new Processor("intel pentium", 1, 1.3, Country.COREA));
        Computer computer15 = new Computer("Acer", 2011, 2, 600,
                new Hdd("hdd3", Type.HDD, 512, Country.USA),
                new Processor("intel pentium", 2, 1.3, Country.CHINE));
        Computer computer16 = new Computer("Acer", 2011, 2, 600,
                new Hdd("hdd5", Type.HDD, 1024, Country.INDIA),
                new Processor("intel pentium", 8, 1.3, Country.USA));
        Computer computer17 = new Computer("Acer", 2011, 2, 400,
                new Hdd("hdd7", Type.HDD, 512, Country.COREA),
                new Processor("intel pentium", 4, 1.3, Country.USA));
        Computer computer18 = new Computer("Acer", 2011, 2, 200,
                new Hdd("hdd7", Type.HDD, 128, Country.USA),
                new Processor("intel pentium", 1, 1.8, Country.USA));
        Computer computer19 = new Computer("Acer", 2011, 2, 200,
                new Hdd("hdd5", Type.HDD, 128, Country.USA),
                new Processor("intel pentium", 1, 2.4, Country.USA));
        Computer computer20 = new Computer("Acer", 2011, 2, 200,
                new Hdd("hdd3", Type.HDD, 128, Country.CHINE),
                new Processor("intel pentium", 1, 1.3, Country.USA));
        ArrayList<Computer> computers = new ArrayList<>();


        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);
        computers.add(computer8);
        computers.add(computer9);
        computers.add(computer10);
        computers.add(computer11);
        computers.add(computer12);
        computers.add(computer13);
        computers.add(computer14);
        computers.add(computer15);
        computers.add(computer16);
        computers.add(computer17);
        computers.add(computer18);
        computers.add(computer19);
        computers.add(computer20);


        List<Computer> computerList = new LinkedList<>();
        Set<Computer> computerSet = new TreeSet<>();
        Set<Computer> computerSet1 = new HashSet<>();
        System.out.println(computers);
        System.out.println("-----------------------------");
        computerList.addAll(computers);
        System.out.println(computerList);
        for (Computer computer : computerList) {
            if (computer.getManufacturedYear() > 2010) {
                System.out.println(computer);
            }
        }
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        for (Computer computer : computerList) {
            if (computer.getManufacturedYear() > 2010 && computer.getHdd().country.equals(Country.CHINE)) {
                System.out.println(computer);
            }
        }
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (Computer computer : computerList) {
            if (computer.getManufacturedYear() > 2010 && computer.getHdd().country.equals(Country.CHINE) &&
                    computer.getProcessor().country.equals(Country.USA)) {
                System.out.println(computer);
            }
        }
        System.out.println("========================================================================================");
        for (Computer computer : computerList) {
            if (computer.getManufacturedYear() > 2010 && !computer.getHdd().country.equals(Country.CHINE)) {
                System.out.println(computer);
            }
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
        for (Computer computer : computerList) {
            if (computer.getHdd().getCapacity() > 500) {
                System.out.println(computer);
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
        for (Computer computer : computerList) {
            if (computer.getHdd().getCapacity() > 500 && computer.processor.getType().equals("i7") && computer.hdd.getType().equals(Type.HDD)) {
                System.out.println(computer);
            }
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
        for (Computer computer : computerList) {
            if (computer.getHdd().getCapacity() > 500 && computer.hdd.getType().equals(Type.SDD)) {
                System.out.println(computer);
            }
        }

        System.out.println("********************************************************************************************************************");

computerList.sort(( Computer a, Computer b)->a.getPrice()-b.getPrice());
        System.out.println(computerList);

    }


}

