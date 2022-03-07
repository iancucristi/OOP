package ro.itschool.compozitie.bloc;

public class Etaj {
    private Apartament[] apartamente = new Apartament[3];
    private int numarEtaj;

    public Etaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
    }

    public void addApartament(int nr, Apartament ap) {
        apartamente[nr] = ap;
    }

    public Apartament[] getApartamente() {
        return apartamente;
    }
}
