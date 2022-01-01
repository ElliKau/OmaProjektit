import java.util.*;

public class TRAI_21_X6_ellikau implements TRAI_21_X6 {

    /**
     * @param SS syĆ¶tejoukkojen joukko
     * @param <E> alkioiden tyyppi
     * @return kuvaus alkioilta syĆ¶tejoukoille
     * Kirjoita algoritmi joka muodostaa joukkojen joukosta hakemiston. Syötteenä on joukkojen joukko
     * (Set<Set<E>>) ja tuloksena on kuvaus (Map<E, Set<Set<E>>) jossa on
     * avaimena kukin erilainen syötejoukoissa esiintyvä alkio ja avaimen kuvana on joukko niistä
     * syötejoukoista joissa ko. alkio esiintyy.
     */
    @Override
    public <E> Map<E, Set<Set<E>>> hakemisto(Set<Set<E>> SS) {
        Map<E, Set<Set<E>>> tulosHakemisto = new HashMap<>();
        HashSet<E> apuset = new HashSet<>();
        HashSet<Set<E>> pikkusetti = new HashSet<>();

        for (Set s1:
                SS) {
            apuset.addAll(s1);  
        }
        
        Iterator<E> ite = apuset.iterator();
        while(ite.hasNext()){       
            E ele = ite.next();     
            for (Set s :
                    SS) {
                if (s.contains(ele))       
                    pikkusetti.add(s);      
            }
            tulosHakemisto.put(ele, new HashSet<>(pikkusetti));    
            pikkusetti.clear();     
        }

        return tulosHakemisto;   
    }
}