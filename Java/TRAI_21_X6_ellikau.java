import java.util.*;

public class TRAI_21_X6_ellikau implements TRAI_21_X6 {

    /**
     * ITSEARVIOINTI TĆ„HĆ„N:
     *
     * Tehtävä onnistui aika kivuttomasti. Mapeissa on omaan järkeen käyviä metodeita ja iterointi on yksin-
     * kertaisempaa.
     * Aikavaativuudeksi arvioin O(n). Lisäämme apulistaan alkiot mitkä esiintyvät
     * seteissä, ottaa O(n) ajan. Iteroidaan setti läpi (n) ja etsitään foreach- loopin ja contains metodin
     * avulla sisöltääkö kukin setti SS setissä kyseistä alkiota. .contains ottaa vakioajan.
     * Tallennettiin kaikki setit jotka sisälsivät alion väliaika set<set<>>:iin, joka tallennetaan valueksi
     * kun avaimena on kyseinen alkio.
     *
     */

    /**
     * Alkioiden hakemisto.
     * Palauttaa kuvauksen jossa kutakin syĆ¶tejoukoissa olevaa alkiota kohti
     * on joukko niitĆ¤ joukkoja jossa ko. syĆ¶tealkio esiintyi.
     * @param SS syĆ¶tejoukkojen joukko
     * @param <E> alkioiden tyyppi
     * @return kuvaus alkioilta syĆ¶tejoukoille
     * ----------
     * Kirjoita algoritmi joka muodostaa joukkojen joukosta hakemiston. Syötteenä on joukkojen joukko
     * (Set<Set<E>>) ja tuloksena on kuvaus (Map<E, Set<Set<E>>) jossa on
     * avaimena kukin erilainen syötejoukoissa esiintyvä alkio ja avaimen kuvana on joukko niistä
     * syötejoukoista joissa ko. alkio esiintyy. Joukkoja ja alkioita käsitellään viittauksina. Kuvauksen
     * arvoiksi luodaan uusi joukkojen joukko kutakin erilaista alkiota kohti ja siihen
     * lisätään ne syötejoukot joissa ko. alkio esiintyi. Älä muuta syötejoukkoja. Mikä on algoritmisi
     * aikavaativuus jos syötejoukot ovat HashSet-tyyppiä ja tuloskuvaus HashMap-tyyppiä?
     * Aikavaativuus vaikuttaa arvosteluun.
     */
    @Override
    public <E> Map<E, Set<Set<E>>> hakemisto(Set<Set<E>> SS) {
        Map<E, Set<Set<E>>> tulosHakemisto = new HashMap<>();
        HashSet<E> apuset = new HashSet<>();
        HashSet<Set<E>> pikkusetti = new HashSet<>();


        //tehdään lista jokaisesta alkiosta mitä seteistä löytyy
        for (Set s1:
                SS) {
            apuset.addAll(s1);  //n
        }
        //käydään apusetin alkiot läpi, etsien jokaisesta SS:n sisältämästä setistä alkiota
        //tallennetaan kyseinen setti väliaikaiseen Hashsetin settiin, joka voidaan tallentaa
        // valueksi kun alkion sisältämät setit ovat löytyneet.
        Iterator<E> ite = apuset.iterator();
        while(ite.hasNext()){       //n
            E ele = ite.next();     //1
            for (Set s :
                    SS) {
                if (s.contains(ele))        //1
                    pikkusetti.add(s);      //1
            }
            tulosHakemisto.put(ele, new HashSet<>(pikkusetti));     //1
            pikkusetti.clear();         //1
        }

        return tulosHakemisto;      //1
    }
}