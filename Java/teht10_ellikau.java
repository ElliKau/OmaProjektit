import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class teht10_ellikau {

    public static void main(String[] args) {

        /**
         * 10. Kirjoita tehokas algoritmi joka saa parametrinaan kaksi kasvavassa järjestyksessä olevaa
         * linkitettyä listaa (java.util.LinkedList A, B) ja joka lisää listaan A kaikki listan B alkiot
         * siten, että lisäysten jälkeen lista A on edelleen järjestyksessä. Listaa B ei muuteta.
         * Voit olettaa ettei listoissa ole null alkioita. Koska nyt harjoittelemme
         * ListIterator:n käyttöä, et saa
         * käyttää valmista addAll() -operaatiota, lajittelua, joukko/kuvausrakenteita (Set/Map) tai
         * alkiovirtaa (Stream) apuna. Mikä on algoritmisi aikavaativuus? Hyödynnä listojen kasvavaa
         * järjestystä saadaksesi algoritmista tehokkaan
         */

        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();
        luoLista(L1);
        luoLista(L2);

        yhdistaListat(L1, L2);
    }

        public static final int listanpituus = 20;
    public static final int numerovali = 30;

    public static LinkedList luoLista(LinkedList<Integer> L){
        Random rnd = new Random();

        //lisätään listaan alkiot, sortataan ja näytetään
        while(L.size() < listanpituus){
            L.add(rnd.nextInt(numerovali));

        }
        Collections.sort(L);
        System.out.println(L);
        return L;
    }
    public static LinkedList yhdistaListat(LinkedList<Integer> A, LinkedList<Integer> B){
        //yhdistetään kaikki listaan A oikeassa järjestyksessä
        ListIterator h = A.listIterator();
        ListIterator k = B.listIterator();

        int i = 0;
        while(k.hasNext()){
            //TODO
            // niin kauan kuin B:ssä on alkioita
            // käydään läpi A:ta niin että Bn alkio on >A.prev mutta <A.next, jollois .add
            Object o = h.next();
            Object p = k.next();

        }
        System.out.println(A);
        return A;
    }

}
