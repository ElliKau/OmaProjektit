// TRAI_21_t22.java SJ

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class TRAI_21_t22_ellikau {

    // kannattaa testata monipuolisesti erilaisilla syÃ¶tteillÃ¤ ja vaikka
    // tehdÃ¤ eri versioita syÃ¶tteen generoinnista

    /**
     * Kirjoita algoritmi joka saa parametrinaan kokoelman (Collection<E>) ja joka muodostaa
     * ja palauttaa kuvauksen (HashMap<E, Integer>) jossa on avaimina kaikki eri alkiot jotka
     * kokoelmasta lÃ¶ytyvÃ¤t. Kunkin avaimen kuvana on ko. esiintymien lukumÃ¤Ã¤rÃ¤. 
     *
     * @param C   syÃ¶tekokoelma
     * @param <E> alkiotyyppi
     * @return kuvaus jossa avaimina ovat C:n alkiot ja arvona ko. alkion esiintymismÃ¤Ã¤rÃ¤t
     */
    public static <E> HashMap<E, Integer> esiintymat(Collection<E> C) {

        HashMap<E, Integer> esiintymat = new HashMap<>();
        //Aikavaativuus O(n)
        // jokaiselle numerolle annetaan nimi: montako kertaa se esiintyi
        // Tutkitaan onko avain eli luku jo mapissä, jos ei, lisätään sinne

        for (E x :
                C) {
            int kerta = 1;
            if(esiintymat.containsKey(x)){ 
                kerta = esiintymat.get(x);  
                kerta++;                        
                esiintymat.put(x, kerta);       
            }
            else
                esiintymat.put(x,kerta); 
        }
        return esiintymat;      
    }


} // class
