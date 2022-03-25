package ro.itschool.Colet;

public class Colet {

    private String adresa;
    private String awb;
    private String expeditor;
    private int greutate;

    public Colet(String adresa, String awb, String expeditor, int greutate) {
        this.adresa = adresa;
        this.awb = awb;
        this.expeditor = expeditor;
        this.greutate = greutate;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getExpeditor() {
        return expeditor;
    }

    public void setExpeditor(String expeditor) {
        this.expeditor = expeditor;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
}
