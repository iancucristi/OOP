package ro.itschool.Colet;

import java.util.ArrayList;

public class Depozit {
    private String nume;
    ArrayList<Colet> colete = new ArrayList<Colet>();

    public Depozit(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<Colet> getColete() {
        return colete;
    }

    public void setColete(ArrayList<Colet> colete) {
        this.colete = colete;
    }

    public void addColet(Colet colet) {
        colete.add(colet);
    }

    public void removeColet(String awb) {
        for (Colet colet : colete) {
            if (colet.getAwb().equals(awb)) {
                colete.remove(colet);
            }
        }

    }

    public Colet findColet(String awb) {
        Colet coletGasit = null;
        for (Colet colet : colete) {
            if (colet.getAwb().equals(awb)) {
                coletGasit = colet;
            }
        }
        return coletGasit;
    }

    public void afisareColete() {
        for (Colet colet : colete) {
            System.out.println(colet.getAdresa() + " " + colet.getAwb() + " " + colet.getExpeditor() + " " + colet.getGreutate());

        }
    }
}
