import java.util.HashSet;
import java.util.Set;

public class TRAI_21_X5_ellikau implements TRAI_21_X5 {

    /**
     * ITSEARVIOINTI TÃ„HÃ„N:
     *
     * Yllätin itseni kun sain vastauksen tehtyä alle kahteen tuntiin, mikä on tämänhetkinen ennätys.
     * Setit tuntuvat helpommilta kuin muu tähänastinen, varmaan sen takia koska saa käyttää .contains()
     * metodia mikä oikaisee aika paljon siitä ehtojen asettelusta. Antaisin itselleni arvosanan 9/10 ratkaisusta.
     *
     * Aikavaativuus on lineaarinen O(n), koska joukoilla ja etenkin hashsetillä addAll() on lineaarinen, ja
     * koko S1+S2+S3 lista käydään vain kerran läpi. Contains operaatiot ovat joukoilla nopeampia ja keskimäärin
     * lineaarisia toisin kuin esim listoilla, joten niitä käytin tässä. Lisäksi kaikki listat yhteen hashsettiin
     * laitettuna voi olla jopa vähemmän tarkasteltavaa kuin jokainen erikseen koska hashiin ei mene kuin 1 uniikki
     * alkio.
     * 3 * n + (m * 4 + 5) = 3n+4m = O(n) kertaluokka.
     */

    /**
     * Joukkojen kaksi kolmesta -leikkaus. Luo uuden joukon johon algoritmi laittaa ne syÃ¶tejoukkojen alkiot jotka
     * kuuluvat tasan kahteen kolmesta syÃ¶tejoukosta. Jos jokin alkio kuuluu vain yhteen tai kaikkiin kolmeen
     * syÃ¶tejoukkoon, alkiota ei laiteta tulosjoukkoon. Ei muuta syÃ¶tejoukkojensa sisÃ¤ltÃ¶Ã¤ (vaan luo uuden tulosjoukon)
     * Jos mikÃ¤Ã¤n alkio ei tÃ¤ytÃ¤ ehtoa, palautetaan tyhjÃ¤ joukko.
     *----
     * Kirjoita algoritmi joka hakee joukkojen ”kaksi kolmesta” leikkauksen. Algoritmi saa siis
     * parametrinaan kolme joukkoa (java.util.Set) ja muodostaa uuden joukon niistä alkioista jotka
     * kuuluvat täsmälleen kahteen syötejoukoista. Mukana ei siis ole niitä alkioita jotka kuuluvat
     * vain yhteen syötejoukoista, eikä niitä alkioita jotka kuuluvat kaikkiin syötejoukkoihin. Älä
     * muuta syötejoukkoja äläkä käytä apuna kuvausta (Map) tai tietorakennekirjastomme joukkoa
     * (TraSet). Vihjeitä: voit ottaa joukoista kopioita, käytä joukko-operaatioita, ei kannata
     * lähteä iteroimaan joukkoja alkioittain. Mikä on algoritmisi aikavaativuus jos syötejoukot
     * ovat HashSet-tyyppiä? Aikavaativuus vaikuttaa arvosteluun.
     * ---
     * @param S1 syÃ¶tejoukko
     * @param S2 syÃ¶tejoukko
     * @param S3 syÃ¶tejoukko
     * @return tulosjoukko
     */
    @Override
    public <E> Set<E> kaksiKolmesta(Set<E> S1, Set<E> S2, Set<E> S3) {
        Set<E> tulos = new HashSet<>();         //1
        Set<E> hashApu = new HashSet<>();    //1

        //hashsettiin menee vain 1 instanssi jokaista lukua/elementtiä tms
        // joten S1+S2+S3 on <= hashApu
        hashApu.addAll(S1);              //n
        hashApu.addAll(S2);              //n
        hashApu.addAll(S3);              //n

        // käydään settien yhdistelmä läpi, lisätään tulokseen jos esiintyy tasan 2 kertaa
        int kerta = 0;                  //1
        for (E x :
                hashApu) {               //n
            kerta = 0;                    //1
            if(S1.contains(x))            //1
                kerta++;                  //1
            if(S2.contains(x))            //1
                kerta++;                  //1
            if(S3.contains(x))            //1
                kerta++;                  //1

            if(kerta == 2){               //1
                tulos.add(x);             //1
            }
        }
        return tulos; //1
    }
}