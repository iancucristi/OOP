package ro.itschool.Colet;

import java.util.Scanner;

public class GestiuneColete {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        int optiune;

        do {
            System.out.println("0.exit");
            System.out.println("1.add colete");
            System.out.println("2.sterge colet");
            System.out.println("3.find colet dupa awb");
            System.out.println("4.afisare colete");
            optiune = scanner.nextInt();
            scanner.nextLine();
            Depozit depozit = new Depozit("depozit");
            if (optiune == 1) {
                System.out.println("dati adresa");
                String adresa = scanner.nextLine();
                System.out.println("dati awb");
                String awb = scanner.nextLine();
                System.out.println("dati expeditor");
                String expeditor = scanner.nextLine();
                System.out.println("dati greutate");
                int greutate = scanner.nextInt();
                scanner.nextLine();
                Colet colet = new Colet(adresa, awb, expeditor, greutate);
                depozit.addColet(colet);

            }
            if (optiune == 2) {
                System.out.println("dati awb dupa care se sterge");
                String awb = scanner.nextLine();
                depozit.removeColet(awb);

            }
            if (optiune == 3) {
                System.out.println("dati awb dupa care se cauta");
                String awb = scanner.nextLine();
                depozit.findColet(awb);

            }
            if (optiune == 4) {
                depozit.afisareColete();
            }
        } while (optiune != 0);
    }
}
