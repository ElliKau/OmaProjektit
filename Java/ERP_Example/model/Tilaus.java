package ERP_Example.model;

import java.util.ArrayList;

public class Tilaus {

    private int tilausnumero;
    private ArrayList<TilausRivi> tilausrivit = new ArrayList<>();
    private Asiakas asiakas = null;

    public Tilaus() {
    }

    public Tilaus(int tilausnumero, Asiakas asiakas) {

        this.tilausnumero = tilausnumero;
        this.asiakas = asiakas;
    }
    public int getTilausnumero() {
        return tilausnumero;
    }

    public void setTilausnumero(int tilausnumero) {
        this.tilausnumero = tilausnumero;
    }

    public Asiakas getAsiakas() {
        return asiakas;
    }

    public void setAsiakas(Asiakas asiakas) {
        this.asiakas = asiakas;
    }

    public void addTilausRivi(TilausRivi tr){
        tilausrivit.add(tr);
    }

    @Override
    public String toString() {
        return "Tilaus{" +
                "tilausnumero=" + tilausnumero +
                ", tilausrivit=" + tilausrivit +
                ", asiakas=" + asiakas +
                '}';
    }
}
