import java.util.NoSuchElementException;

public class TRAI_21_X7_ellikau<E> implements TRAI_21_X7<E> {

    /**
     * 
     * Lisäysoperaation aikavaativuusluokka on vakio O(1), ellei tarvitse tuplata taulukon kokoa. Taulukon
     * tuplaamiselle tein erillisen metodin, joka on lineaarista kertaluokkaa O(n) suorittaa, koska joudumme tallen-
     * tamaan listan alkiot uuteen listaan järjestyksessä, joka vie lineaarisen ajan. Tätä voisi varmaan
     * jotenkin tehostaa mutta itse en keksinyt parempaa tapaa.
     * Poisto-operaation aikavaativuusluokka on lineaarinen O(n), koska joka kerta poistettaessa pitää siirtää
     * seuraava alkio ensimmäisen paikalle, ja tehdä siirto jokaiselle alkiolle jotta jono pysyy järjestyksessä
     * tiiviisti. Joka kierroksella käymme vähemmän alkioita läpi, joten jokainen kutsu on periaatteessa n-1.
     * onkoTyhjän tarkistaminen on vakio O(1), koska tarkistamme vain ensimmäisen solun tyhjyyden. Jos ensimmäinen
     * on tyhjä on muukin taulukko tyhjä koska jono toimii niin.
     *
     *
     *---
     * X7. Toteuta abstrakti tietotyyppi jono. Toteuta jonon konstruktori (ilman parametreja)
     * sekä operaatiot lisaa(E x), poista() ja onkoTyhja(). Voit käyttää talletusrakenteena joko taulukkoa
     * (E[]) tai dynaamista linkitettyä rakennetta. Et saa käyttää Javan tai tietorakennekirjaston
     * valmiita kokoelmatyyppejä (ArrayList, LinkedList, ArrayDeque, tms). Myöskään netistä
     * kopioitu jonototeutus ei kelpaa. Täysiin pisteisiin jonon on pystyttävä tarvittaessa
     * kasvattamaan tilaa jos käytät taulukkototeutusta. Moodlessa on rajapinta joka toteutetaan, pohja
     * renkaan toteutukseen, sekä renkaan testaukseen tarkoitettu ohjelma. Rajapintatiedostossa
     * on kuvattu kunkin operaation vaatimukset.
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
        StringBuilder strTaulukko = new StringBuilder();
        strTaulukko.append("..::[ ");
        if(tauludata.length < 1)
            strTaulukko.append(" tyhjää täynnä");

        for (int i = 0; i < tauludata.length; i++) {
            if(tauludata[i] == null)
                break;
            strTaulukko.append(tauludata[i].toString());
            strTaulukko.append(" ");
        }
        strTaulukko.append("]::..");
        return strTaulukko.toString();
    }
}