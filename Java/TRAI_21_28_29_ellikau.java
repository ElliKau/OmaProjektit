import java.util.Iterator;
import java.util.NoSuchElementException;

public class TRAI_21_28_29_ellikau<E> implements TRAI_21_X7<E> {

    /**
     *
     * 28. Lisää tehtävän X7 jonon toteutukseen operaatio toString() joka palauttaa jonon
     * senhetkisen sisällön merkkijonoesityksen (esim. ” < a b c < ”). Rakenna merkkijono käyttäen
     * StringBuilder-luokkaa. Esimerkki sen käytöstä löytyy Moodlesta luokasta ArrayList2.java.
     * Pohjissa ja testiohjelmissa on tätä tehtävää varten omat kohtansa (osin kommentoituna).
     *
     * //TODO
     * 29. Jatka tehtävän X7 jonon toteutusta lisäämällä siihen iteraattorin toteutus (implements
     * Iterable<E>). Iteraattori ei ole jonon tyypillinen operaatio, mutta harjoitellaan nyt sen
     * toteuttamista. Iteraattori ei siis poista alkioita jonosta vaan käy läpi jonossa olevat alkiot
     * (mikä ei siis ole tyypillistä jonotoimintaa). Iteroinnin aikana jonoon ei saa lisätä alkioita eikä
     * jonosta saa poistaa alkioita. Iterattorin remove() -operaatioita ei tarvitse toteuttaa. Pohjissa
     * ja testiohjelmissa on iterointia varten omat kohtansa (osin kommentoituna).

     */


    /**
     * LisÃ¤Ã¤ jonoon yhden alkion.
     *
     * @param x lisÃ¤ttÃ¤vÃ¤ alkio.
     */
    private Integer maara = 0;
    private E[] tauludata = (E[]) new Object[10];

    @Override
    public void lisaa(E x) {
        //maara pitää muistissa indeksikohtaa. Kutsutaan jonon koon tuplausta jos indeksi menee yli
        //tauludatan pituuden.

        if(maara > tauludata.length || maara < 0){          //1
            throw new NoSuchElementException();
        }
        if(maara >= tauludata.length){          //1
            tauludata = tuplaaKoko(tauludata);      //kutsu O(1), (toteutus O(n))
        }
        tauludata[maara] = x;       //1
        maara++;            //1


    }

    public E[] tuplaaKoko(E[] taulukko){
        E[] tauludata2 = (E[]) new Object[(taulukko.length * 2)];
        for (int i = 0; i < taulukko.length; i++) {         //n
            tauludata2[i] = taulukko[i];        //1
        }
        taulukko = tauludata2;      //1
        return taulukko;            //1
    }

    /**
     * Poistaa ja palauttaa jonosta siellÃ¤ pisimpÃ¤Ã¤n olleen alkion.
     *
     * @return poistettu jonossa pisimpÃ¤Ã¤n ollut alkio.
     * @throws NoSuchElementException jollei jonossa ole yhtÃ¤Ã¤n alkiota.
     */
    @Override
    public E poista() {
        // Otetaan ensimmäinen alkio talteen. Siirretään jonoa, jotta indeksi 0:ssa on aina
        //ensimmäinen alkio olemassa, eli 1=0, 2=1, 3=2 jne
        E x = tauludata[0];         //1
        if (x == null)          //1
            throw new NoSuchElementException("Sisältö on null");

        for (int i = 0; i < maara ; i++) {          //n eli jäljelle jäävät alkiot kun n-1
            tauludata[i] = tauludata[(i+1)];    //1
        }
        maara--;            //1
        return x;       //1

    }

    /**
     * Onko jono tyhjÃ¤ vai ei?
     *
     * @return true jos jonossa ei ole yhtÃ¤Ã¤n alkiota, muuten false
     */
    @Override
    public boolean onkoTyhja() {
        // Koska pidämme aina vähintään ensimmäisessä solussa dataa, jos se on tyhjä on muukin taulukko tyhjä
        if (tauludata[0] == null)   //1
            return true;
        else                    //1
            return false;
    }

    @Override
    public String Tulosta(){
        //Testin puolelle lisää jono1.Tulosta() ja jono2.Tulosta(), rajapintaan kans metodi
        // Aikavaativuus lineaarinen O(n), koska käydään koko taulukko läpi
        StringBuilder strTaulukko = new StringBuilder();
        strTaulukko.append("..::[ ");


        if(tauludata.length < 1)                //1
            strTaulukko.append(" tyhjää täynnä");

        for (int i = 0; i < tauludata.length; i++) {        //n
            if(tauludata[i] == null)                        //1 jos nulleja, ovat aina lopussa, voi breakata
                break;
            strTaulukko.append(tauludata[i].toString());    //1
            strTaulukko.append(" ");            //1
        }
        strTaulukko.append("]::..");    //1
        return strTaulukko.toString();      //1
    }

    //TODO iterointi
/*
private class tauluIterator() implements Iterable<E> {
    private int initialModCount;
    private int solu;

    public Iterator<E> iterator() {

        return new tauluIterator();
    }
}

 */

}




