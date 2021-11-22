import java.util.LinkedList;
import java.util.ListIterator;

public class TRAI_21_X3_ellikau implements TRAI_21_X3 {
    //  ^^^^^ oma tunnus tÃ¤hÃ¤n

    /**
     * Aikavaativuus olisi suurinpiirtein 2 * n + 2= eli O(n).
     *
     */

    /**
     * Poistaa listasta A saman alkion perÃ¤kkÃ¤isistÃ¤ esiintymistÃ¤ muut paitsi ensimmÃ¤isen.
     * Listasta (4 3 3 2 2 2 2 1 2 2 3 3) tulee lista (4 3 2 1 2 3).
     * Lista voi sisÃ¤ltÃ¤Ã¤ myÃ¶s null:eja jotka kÃ¤sitellÃ¤Ã¤n samoin kuin muut alkiot.
     *
     * --------------
     * Kirjoita tehokas algoritmi joka poistaa järjestämättömästä listasta (LinkedList) peräkkäin
     * esiintyvistä samoista alkioista jälkimmäiset. Jos sama alkio (.equals() antaa toden) esiintyy
     * useammin kuin kerran listassa peräkkäin, niin niistä poistetaan muut paitsi ensimmäinen. Jos
     * alkio esiintyy uudestaan siten, että välissä on muita alkioita, sellainen esiintymä ei aiheuta
     * poistoa. Toki taas uudessa esiintymässä duplikaatit poistetaan. Jäljelle jäävät alkiot säilyttävät
     * järjestyksensä. Algoritmi palauttaa poistettujen alkioiden määrän. Listasta (e, a, a, i, i,
     * c, c, c, a, a, c) tulee siis lista (e, a, i, c, a, c). Täysiin pisteisiin algoritmisi pitää pystyä
     * käsittelemään myös null alkiot kuten muutkin alkiot. Siis useammasta peräkkäisestä null alkiosta
     * vain ensimmäinen jää, muut poistetaan. Koska nyt harjoitellaan ListIterator:in käyttöä, et
     * saa käyttää apuna joukkoa/kuvausta, alkiovirtoja (Stream) etkä tekniikkaa jossa säilytettävät
     * alkiot kopioidaan toiseen listaan tai muuhun kokoelmaan, tyhjennetään alkuperäinen lista ja
     * lisätään säilytettävät takaisin alkuperäiseen listaan. Huomaa, että LinkedList:n iteraattorin
     * remove() -operaatio on vakioaikainen, joten sitä käyttäen voit tehdä aikavaativuudeltaan lineaarisen
     * ratkaisun. Mikä on algoritmisi aikavaativuus? Aikavaativuus vaikuttaa arvosteluun
     *
     * @param A syÃ¶telista
     * @return poistettujen mÃ¤Ã¤rÃ¤
     */
    @Override
    public <E> int poistaPerakkaisetDuplikaatit(LinkedList<E> A) {
        ListIterator<E> la = A.listIterator();

        int poistettuja = 0;
        //TODO oikea kätsympi vastaus tässä
        //jos vain yksi tai 0 alkiota, ei mitään verrattavaa
        if(A.size() < 2){
            return poistettuja;
        }

        E prev = la.next();
        while(la.hasNext()){
            E nykyinen = la.next();
            //poistetaan jos molemmat null, tai molemmat samoja
            if((prev == null && nykyinen == null) || prev != null && prev.equals(nykyinen)){
                poistettuja++;
                la.remove();
            }
            //kierroksen jälkeen pitää siirtää molempia, prev siirtyy vain näin.
            prev = nykyinen;
        }

        /*
        while (la.hasNext()){               //O(n)
            Object oa = la.next();          //(1)

            //jos tulokset ovat oikeita lukuja ja tallennettu iteraattorin next arvo on seuraavan next arvon kanssa
            //samankaltainen. Jos seuraava on null arvo, käsitellään se omassa kohdassaan
            if (oa != null && la.hasNext() && oa.equals(la.next())) {  // O(1)
                la.remove();                                           // (1)
                poistettuja++;
                la.previous();                                         // (1)
            } else if (la.hasNext() && la.next() == null) {            //O(1)
                try {
                    la.remove();                                        // (1)
                    poistettuja++;
                    la.previous();                                      // (1)

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

         */
        return poistettuja;
    }
}