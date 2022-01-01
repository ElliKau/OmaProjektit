import java.util.LinkedList;
import java.util.ListIterator;

public class TRAI_21_X3_ellikau {
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
     * poistoa. Toki taas uudessa esiintymässä duplikaatit poistetaan. 
     *
     * @param A syÃ¶telista
     * @return poistettujen mÃ¤Ã¤rÃ¤
     */
    public <E> int poistaPerakkaisetDuplikaatit(LinkedList<E> A) {
        ListIterator<E> la = A.listIterator();

        int poistettuja = 0;
        if(A.size() < 2){
            return poistettuja;
        }

        E prev = la.next();
        while(la.hasNext()){
            E nykyinen = la.next();
            if((prev == null && nykyinen == null) || prev != null && prev.equals(nykyinen)){
                poistettuja++;
                la.remove();
            }
            prev = nykyinen;
        }
        return poistettuja;
    }
}