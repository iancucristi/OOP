package ro.itschool.compozitie.bloc;

public class Bloc {
    private Etaj[] etaje = new Etaj[2];
    private String numeBloc;

    public Bloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public void addEtaj(int nr, Etaj etaj) {
        etaje[nr] = etaj;
    }

    public void afiseazaBloc() {
        Apartament[] apartamente = new Apartament[2];
        for (int i =1, j = apartamente.length-1 ; i <etaje.length; i--, j--) {
            Etaj etaj = etaje[i];

                System.out.println("------------------------------");
                System.out.println("------------------------------");
                System.out.println("et-" + i + ":||" + apartamente[i].getNumarApartament() + ". " + apartamente[i].getNumeFamilie());

        }
    }
}
