package ro.itschool.Rectangle;

public class Main {
    public static void main(String[] args) {
        Dreptunghi dreptunghi = new Dreptunghi();
        double aria = dreptunghi.getAria();
        double perimetru = dreptunghi.getPerimetru();
        System.out.println("aria este " + aria + " si perimetrul este " + perimetru);
        Dreptunghi rectangle = new Dreptunghi(2,4);
        aria = rectangle.getAria();
        perimetru = rectangle.getPerimetru();
        System.out.println("aria este " + aria + " si perimetrul este " + perimetru);
    }
}
