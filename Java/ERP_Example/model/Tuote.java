package ERP_Example.model;

public class Tuote {
    private int tuotenro;
    private String nimi;


    public Tuote(int tuotenro, String nimi) {
        this.tuotenro = tuotenro;
        this.nimi = nimi;
    }

    public int getTuotenro() {
        return tuotenro;
    }

    public void setTuotenro(int tuotenro) {
        this.tuotenro = tuotenro;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }


    @Override
    public String toString() {
        return "Tuote{" +
                "tuotenro=" + tuotenro +
                ", nimi='" + nimi + '\'' +
                '}';
    }
}
