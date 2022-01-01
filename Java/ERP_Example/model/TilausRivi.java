package ERP_Example.model;

public class TilausRivi {
    private int rivinro;
    private int kpl;
    private double hinta;
    private Tuote tuote;

    public TilausRivi(int rivinro, int kpl, double hinta, Tuote tuote) {
        this.rivinro = rivinro;
        this.kpl = kpl;
        this.hinta = hinta;
        this.tuote = tuote;
    }

    public int getRivinro() {
        return rivinro;
    }

    public void setRivinro(int rivinro) {
        this.rivinro = rivinro;
    }

    public int getKpl() {
        return kpl;
    }

    public void setKpl(int kpl) {
        this.kpl = kpl;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public Tuote getTuote() {
        return tuote;
    }

    public void setTuote(Tuote tuote) {
        this.tuote = tuote;
    }

    @Override
    public String toString() {
        return "TilausRivi{" +
                "rivinro=" + rivinro +
                ", kpl=" + kpl +
                ", hinta=" + hinta +
                ", tuote=" + tuote +
                '}';
    }
}
