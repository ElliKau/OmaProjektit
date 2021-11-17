import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class TRAI_21_teht9_ellikau {

    public static void main(String[] args) {
/**
 *  Kirjoita algoritmi joka saa parametrinaan kaksi järjestämätöntä listaa A ja B (LinkedList)
 * ja joka poistaa listasta A kaikki ne alkiot jotka esiintyvät listassa B. Algoritmi palauttaa
 * poistettujen alkioiden määrän. Nyt ei siis luoda uutta listaa, vaan muokataan parametrina
 * saatua. Älä käytä valmista remove(Object) tai removeAll() -operaatiota. Aikavaativuus?
 * Miten aikavaativuutta voisi parantaa?
 *
 * No sallimalla remove(Objectin) käytön nopeuttaisi jo ihan jonkin verran. Onnistuin ilmeisesti
 * tekemään n^3 operaation
 */

    LinkedList<Integer> A = new LinkedList<>();
    LinkedList<Integer> B = new LinkedList<>();
    Listaluonti(A,B);

    }


    public static Integer Listaluonti(LinkedList<Integer> A, LinkedList<Integer> B) {
        int tulos = 0;
        A.add(3);
        A.add(6);
        A.add(21);
        A.add(2);
        A.add(103);
        A.add(40);
        A.add(70);

        B.add(31);
        B.add(6);
        B.add(70);
        B.add(21);
        B.add(11);
        Collections.sort(A);
        Collections.sort(B);

        int poistetut = 0;
        ListIterator i = A.listIterator();

        //Kierretään lista iteraattorilla läpi
        while (i.hasNext()){                                //n
            Object u = i.next();                            //1
            if(B.contains(u)){                              //n
                //i.remove(); ei saanut käyttää joten
                //haetaan B.contains(u) kohta, ja korvataan se seuraavalla elementillä
                i.set(i.next());                            //n
                tulos++;                                    //1
                System.out.println("B lista sisältää alkion: " + u);    //1
                i.previous();                               //1
            }

        }
        for (Integer x :
                A) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Poistimme " + tulos + " alkiota.");
        return tulos;
    }
}
