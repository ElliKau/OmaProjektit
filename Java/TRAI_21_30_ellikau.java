import javax.swing.text.Element;
import java.util.NoSuchElementException;

public class TRAI_21_30_ellikau<E> implements TRAI_21_X7<E> {

    /**
     * //TODO ongelmia linkitetyn rakenteen tallentamisessa, ei käy läpi niin kuin pitäisi
     *
     */

    /**
     * LisÃ¤Ã¤ jonoon yhden alkion.
     *
     * @param x lisÃ¤ttÃ¤vÃ¤ alkio.
     */
    private E ele;
    private TRAI_21_30_ellikau<E> seur;
    private TRAI_21_30_ellikau<E> eka = null;

    public void setSolmu(E x){
        ele = x;
        seur = null;
    }

    public E getEle() {
        return ele;
    }

    public TRAI_21_30_ellikau<E> getSeur() {
        return seur;
    }

    public void setEle(E ele) {
        this.ele = ele;
    }

    public void setSeur(TRAI_21_30_ellikau<E> seur) {
        this.seur = seur;
    }

    @Override
    public void lisaa(E x) {
        TRAI_21_30_ellikau uusi = new TRAI_21_30_ellikau<E>();
        uusi.setSolmu(x);
        uusi.seur = this.seur;
        this.seur = uusi;
        //jos ekaa solmua ei ole, nykyinen solmu on eka solmu
        if(eka == null){
            eka = new TRAI_21_30_ellikau<>();
            eka.setSolmu(x);
            eka.seur = uusi;
        }

    }

    /**
     * Poistaa ja palauttaa jonosta siellÃ¤ pisimpÃ¤Ã¤n olleen alkion.
     *
     * @return poistettu jonossa pisimpÃ¤Ã¤n ollut alkio.
     * @throws NoSuchElementException jollei jonossa ole yhtÃ¤Ã¤n alkiota.
     */
    @Override
    public E poista() {
        TRAI_21_30_ellikau<E> poistettava = eka;
        // ekan solmun seuraaja on myös 0 solmu, se pitää ottaa käsittelyyn eka
        // käydään läpi kunnes ei ole jäljellä solmuja

        if(this.seur == null) {
            eka = null;
            throw new NullPointerException("Vika solmu, null virhe");   //TODO läpikäyntivirhe
        }
        this.seur = this.seur.seur;
        return poistettava.ele;
    }

    /**
     * Onko jono tyhjÃ¤ vai ei?
     *
     * @return true jos jonossa ei ole yhtÃ¤Ã¤n alkiota, muuten false
     */
    @Override
    public boolean onkoTyhja() {
        if (eka == null)   //1
            return true;
        else                    //1
            return false;
    }

    public String Tulosta(){
        StringBuilder strTaulukko = new StringBuilder();
        strTaulukko.append("..::[ ");

        seur = eka.seur;

        //ei lähde etsimään seuraavaa solmua
        while (seur != null) {
            strTaulukko.append(seur.getEle());
            strTaulukko.append(" ");
            setSeur(getSeur());
            if(strTaulukko.length() >= 10)
                break;
        }
        strTaulukko.append("]::..");
        return strTaulukko.toString();
    }
}