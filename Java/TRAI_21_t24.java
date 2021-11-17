// TRAI_21_t8_9.java SJ
// PÃ¤Ã¤ohjelma viikon 2 tehtÃ¤viin 8 ja 9

import java.util.*;


public class TRAI_21_t24 {


    // PÃ¤Ã¤ohjelman kÃ¤yttÃ¶:
    // java TRAI_21_t25 [N] [N2] [S]
    // missÃ¤ N on alkioiden mÃ¤Ã¤rÃ¤, N2 on alkoiden mÃ¤Ã¤rÃ¤ toisessa taulukossa
    // ja S on satunnaislukusiemen
    public static void main(String[] args) {

        // alkioiden mÃ¤Ã¤rÃ¤
        int n1 = 15;
        if (args.length > 0)
            n1 = Integer.parseInt(args[0]);

        int pituus = 1; // merkkijonojen pituus
        if (n1 > 30)
            pituus = 2;

        int merkisto = 25;

        // tÃ¤mÃ¤ antaa aina erilaisen syÃ¶tteen:
        Random r = new Random(System.currentTimeMillis());
        // Random r = new Random(n1); // tÃ¤mÃ¤ antaa aina saman syÃ¶tteen

        // testataan vaihteeksi merkkijonoilla
        LinkedList<String> LL = new LinkedList<>();
        // tÃ¤ytetÃ¤Ã¤n alkioilla
        for (int i = 0; i < n1; i++) {
            LL.add(randomString(r, pituus, merkisto));
        }

        Collections.sort(LL);

        // tulostetaan lista jos alkioita ei ole paljoa
        if (n1 <= 20) {
            System.out.println("LL: " + LL);
        }

        // tehdÃ¤Ã¤n toinen kokoelma

        int n2 = r.nextInt((int)Math.sqrt(n1)+2);
        // int n2 = (int)Math.sqrt(n1)+2; // jos haluat aina samanmittaisen syÃ¶tteen
        ArrayList<String> AL = new ArrayList<>(n2);
        for (int i = 0; i < n2; i++) {
            AL.add(randomString(r, pituus, merkisto));
        }
        if (n2 <= 20) {
            System.out.println("AL: " + AL);
        }


        lisaaJarjestettyyn(LL, AL);

        if (n1 <= 20) {
            System.out.println("LL: " + LL);
        }




    } // main()

    /**
     * LisÃ¤Ã¤ jÃ¤rjestettyy listaan jÃ¤rjestÃ¤mÃ¤ttÃ¶mÃ¤n kokoelman alkiot
     * siten, ettÃ¤ lista pysyy jÃ¤rjestyksessÃ¤.
     * @param L jÃ¤rjestetty lista johon lisÃ¤tÃ¤Ã¤n
     * @param C kokoelma jonka alkiot lisÃ¤tÃ¤Ã¤n
     * @param <E> alkiotyyppi
     */
    public static <E extends Comparable<? super E>> void lisaaJarjestettyyn(LinkedList<E> L, Collection<E> C) {
        //Aikavaativuus on n+ mlogm = nlogn
        //jos lista L = n pitkä, ja lista C = m pitkä, voisi aikavaativuudeksi sanoa vaaditun |L| +|C|log|C|
        // eli n käydään kerran läpi, ja jokaista m:n alkiota kohtaan se pitää pollilla lisätä mikä on logn,
        //ja koko m lista pitää käydä läpi = mlogm

        PriorityQueue<E> pque = new PriorityQueue();
        Iterator<E> iter = C.iterator();

        while(iter.hasNext()){
            E ite = iter.next();
            pque.add(ite);
        }

        ListIterator<E> iteL = L.listIterator();        //1
        E edellinen = L.peek();     //1

        //käydään lista L läpi ja lisätään oikeisiin kohtiin priolistasta alkiot
        //pidetään mielessä aina seuraava ja edellinen iteraattorin alkio vertailua varten
        // eli jos osuu samanairvoiseen, tai osuu johonkin väliin
            while(iteL.hasNext() && !pque.isEmpty()){              //n
                E iterE = iteL.next();                            //1
                if(iterE.compareTo(pque.peek()) > 0){            //1+1
                    if(edellinen.compareTo(pque.peek()) < 0){       //1+1
                        iteL.add(pque.poll());                   //logn
                    }
                }
                else if(iterE.compareTo(pque.peek()) == 0)       //1+1
                    iteL.add(pque.poll());                  //logn
                edellinen = iterE;                           //1
            }
            //jos loppuun jää listan vikan alkion jälkeen kuuluvia elementtejä, lisätään listaan
            while (!pque.isEmpty())     //1
                L.add(pque.poll());     //logn
    }



    /**
     * Palauttaa satunnaisen len mittaisen merkkijonon.
     *
     * @param r   satunnaislukugeneraattori
     * @param pituus merkkijonon pituus
     * @param merkisto
     * @return uusi merkkijono
     */
    public static String randomString(Random r, int pituus, int merkisto) {
        char[] C = new char[pituus];
        for (int i = 0; i < pituus; i++)
            C[i] = (char) (r.nextInt(merkisto) + 'a');
        return new String(C);
    }


} // class
