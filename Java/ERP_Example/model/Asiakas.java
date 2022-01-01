package ERP_Example.model;

public class Asiakas {
    private int asiakasnumero;
    private String nimi;


    public Asiakas(int asiakasnumero, String nimi) {
        this.asiakasnumero = asiakasnumero;
        this.nimi = nimi;
    }

    public int getAsiakasnumero() {
        return asiakasnumero;
    }

    public void setAsiakasnumero(int asiakasnumero) {
        this.asiakasnumero = asiakasnumero;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return "Asiakas{" +
                "asiakasnumero=" + asiakasnumero +
                ", nimi='" + nimi + '\'' +
                '}';
    }
}
