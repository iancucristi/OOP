package ro.itschool.Rectangle;

public class Dreptunghi {
    private double lungime = 1;
    private double latime = 1;

    public Dreptunghi() {

    }

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double getAria() {
        return this.lungime * this.latime;
    }

    public double getPerimetru() {
        return this.lungime + this.latime;
    }
}
