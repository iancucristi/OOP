package ro.itschool.Cerc;

public class Cerc {
    private double raza;

    public void setRaza(double raza) {
        this.raza = raza;

    }

    public double getRaza() {
        return Math.pow(this.raza, 2) * 3.14;
    }
}
