// TRAI_21_t19_20_21.java SJ

import java.util.*;

public class TRAI_21_t19_20_21_ellikau {

    /**
     * Tulosta kokoelma riveittÃ¤in.
     *
     * @param CC  syÃ¶tekokoelma
     * @param <E> alkiotyyppi
     */
    static <E> void tulostaRiveittain(Collection<E> CC) {
        System.out.println("(");
        for (E x : CC) {
            System.out.println(x.toString());
        }
        System.out.println(")");
    }

    /**
     * Kirjoita algoritmi joka saa parametrinaan joukkojen joukon (Set<Set<E>>) ja joka palauttaa joukkona
     * (Set<E>) kaikki ne alkiot jossakin (tai joissakin) syÃ¶tejoukoissa.
     *
     * @param SS  joukkojen joukko
     * @param <E> joukkojen alkioiden tyyppi
     * @return kaikki jossain joukossa esiintyneet alkiot
     */
    public static <E> Set<E> yhdiste(Set<Set<E>> SS) {
        //Aikavaativuus lineaarinen O(n)
        HashSet<E> setYhdiste = new HashSet<>();    

        for (Set s1:                
             SS) {
            setYhdiste.addAll(s1);  
        }
        return setYhdiste; 
    }

    /**
     * Kirjoita algoritmi joka saa parametrinaan joukkojen joukon (Set<Set<E>>) ja joka palauttaa joukkona
     * (Set<E>) kaikki ne alkiot jotka ovat tasan yhdessÃ¤ syÃ¶tejoukoista. Ne alkiot jotka ovat useammassa kuin yhdessÃ¤
     * syÃ¶tejoukoista eivÃ¤t tule tulokseen. Ã„lÃ¤ muuta syÃ¶tejoukkoja.
     *
     * @param SS  joukkojen joukko
     * @param <E> joukkojen alkioiden tyyppi
     * @return kaikki ne alkiot jotka esiintyvÃ¤t vain yhdessÃ¤ joukossa
     */
    public static <E> Set<E> vainYhdessa(Set<Set<E>> SS) {
        Set<E> tulos = new HashSet<>();
        LinkedList<E> apulista = new LinkedList<>();

        //Käydään setin setit läpi. Kun lisääminen epäonnistuu eli alkio sijaitsee jo tulos-setissä,
        // lisätään se apulistaan jolloin se lopuksi poistetaan.
        for (Set s :
                SS) {
            Iterator<E> it = s.iterator();
            while (it.hasNext()) {          
                E oit = it.next();          
                if(!tulos.add(oit)){        
                    apulista.add(oit);      

                }
                else
                    tulos.add(oit);         

            }
            }
        tulos.removeAll(apulista);          

        return tulos;
    } // vainYhdessa()

} // class