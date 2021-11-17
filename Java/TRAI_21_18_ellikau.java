// TraI_21_t18.java SJ

import fi.uef.cs.tra.TraSet;

import javax.swing.text.Element;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TRAI_21_18_ellikau {

    public static void main(String[] args) {

        int N = 10;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);


        TraSet<Integer> S1 = new TraSet<>();
        TraSet<Integer> S2 = new TraSet<>();
        TraSet<Integer> S3 = new TraSet<>();

        Random r = new Random(42);
        Integer x, y;
        for (int i = 0; i < N; i++) {
            x = r.nextInt(N * 2);
            y = r.nextInt(N * 2);
            S1.add(x);
            S2.add(x - y);
            S3.add(x + y);
        }

        System.out.println("S1:      " + S1);
        System.out.println("S2:      " + S2);
        System.out.println("S3:      " + S3);


        System.out.println("KaksikolmestaTRA: " + kaksiKolmesta(S1, S2, S3));


    } // main()


    /**
     * 18. Kirjoita algoritmi joka hakee joukkojen â€kaksi kolmestaâ€ leikkauksen. Algoritmi saa
     * siis parametrinaan kolme
     * tietorakennekirjastomme joukkoa (TraSet) ja muodostaa uuden joukon niistÃ¤ alkioista jotka kuuluvat tÃ¤smÃ¤lleen
     * kahteen syÃ¶tejoukoista. Mukana ei siis ole niitÃ¤ alkioita jotka kuuluvat vain yhteen syÃ¶tejoukoista,
     * eikÃ¤ niitÃ¤
     * alkioita jotka kuuluvat kaikkiin syÃ¶tejoukkoihin. Ã„lÃ¤ muuta syÃ¶tejoukkoja
     * Ã¤lÃ¤kÃ¤ kÃ¤ytÃ¤ apuna kuvausta (Map) tai
     * Javan va- kiokirjaston joukkoa (Set). VihjeitÃ¤: voit ottaa joukoista kopioita,
     * kÃ¤ytÃ¤ joukko-operaatioita, ei
     * kannata lÃ¤hteÃ¤ iteroimaan joukkoja alkioittain. MikÃ¤ on algoritmisi aikavaativuus
     * kun TraSet:n operaatioiden
     * aikavaativuus on kuten vastaavilla TreeSet -operaatioilla?
     *
     * @param A   syÃ¶tejoukko
     * @param B   syÃ¶tejoukko
     * @param C   syÃ¶tejoukko
     * @param <E> alkiotyyppi (ei kÃ¤ytetÃ¤)
     * @return uusi joukko jossa on ne alkiot jotka lÃ¶ytyvÃ¤t tasan kahdesta syÃ¶tejoukosta
     */
    public static <E> TraSet<E> kaksiKolmesta(TraSet<E> A, TraSet<E> B, TraSet<E> C) {
        //Aikavaativuus luokka O(nlogn)
        //verrataan settien elementtejä A:han jotta saadaan 2x 2 listan yhteiset alkiot
        TraSet<E> P = new TraSet();
        P.addAll(A.intersection(B));    //nlogn
        P.addAll(A.intersection(C));    //nlogn
        //verrataan onko alkioita kolmatta kertaa. jos on, poistetaan listalta, jos ei niin lisätään uusia
        for (E x :
                C.intersection(B)) {    //? nlogn
            if(P.contains(x))         //logn
                P.remove(x);         //logn
            else
                P.add(x);         //logn
        }
        return P;         //1
    } // kaksiKolmesta()


} // class TraI_21_t18