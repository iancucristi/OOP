package ro.itschool.compozitie.bloc;

public class Main {
    public static void main(String[] args) {
        Bloc bloc = new Bloc("E2");

        Etaj etajul0 = new Etaj(0);

        Apartament ap1 = new Apartament(1, "familia ionescu");
        etajul0.addApartament(1, ap1);

        Apartament ap2 = new Apartament(2, "familia georgescu");
        etajul0.addApartament(2, ap2);

        bloc.addEtaj(0, etajul0);
        bloc.afiseazaBloc();
    }
}
