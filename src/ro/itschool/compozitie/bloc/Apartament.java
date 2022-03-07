package ro.itschool.compozitie.bloc;

public class Apartament {
    private int numarApartament;
    private String numeFamilie;

    public Apartament(int numarApartament, String numeFamilie) {
        this.numarApartament = numarApartament;
        this.numeFamilie = numeFamilie;
    }

    public int getNumarApartament() {
        return numarApartament;
    }

    public void setNumarApartament(int numarApartament) {
        this.numarApartament = numarApartament;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public void setNumeFamilie(String numeFamilie) {
        this.numeFamilie = numeFamilie;
    }
}
