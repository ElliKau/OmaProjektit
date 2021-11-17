import java.util.*;


public class testia {

        public static void main(String[] args) {

            /*
            ArrayList<Integer> A = new ArrayList();
            A.add(2);
            A.add(7);
            A.add(8);
            A.add(3);
            A.add(3);
            A.add(4);
            A.add(6);
            for (Integer x :
                    A)
                System.out.print(" " + x);
            System.out.println();
            Collections.sort(A);
            for (Integer y :
                    A)
                System.out.print(" " + y);


             */

            LinkedList<Integer> L1 = new LinkedList<>();
            LinkedList<Integer> L2 = new LinkedList<>();
            luoLista(L1);
            luoLista(L2);

            yhdistaListat(L1, L2);

        }
/**
 //poista kokoelmasta A kaikki kokoelmassa B esiintyvät alkiot
 public static void poista(Collection A, Collection B){
 Iterator i = A.iterator();
 while (i.hasNext())
 if (B.contains(i.next()))
 i.remove();

 }

 //kertoman lasku rekursiolla
 public static int factorial(int n){
 if (n <= 1)
 return 1;
 else return n * factorial(n-1);
 }
 **/
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

