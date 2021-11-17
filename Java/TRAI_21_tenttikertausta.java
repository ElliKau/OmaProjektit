import fi.uef.cs.tra.*;

import java.util.*;

public class TRAI_21_tenttikertausta {

    public static void main(String[] args) {
        Linked();
        pino();
        binPuuTekeminen();
        trajoukko();
        kuvaus();
        jono();
    }
//metodit

    private static void Array(){   //n
        ArrayList<Integer> arr = new ArrayList();
        // O(1)
        arr.add(14);
        arr.add(24);
        arr.get(1); // indeksi
        arr.set(0,20);
        arr.remove(-1); // vain vika indeksi
        //myös iter. next ja iter.set
        // O(n)
        arr.add(2,15);
        //iter.remove
    }
    private static void Linked(){  //n
        //jos listaa ei muuteta kesken läpikäynnin mitenkään, foreach kelpaa
        System.out.println("Linkitetty lista:");
        LinkedList<Integer> link = new LinkedList<>();
        link.add(158);
        link.add(22);
        link.add(21);
        link.add(0,4);
        link.remove(0); //eka indeksi

        //muista parametroida <jotain>
        Iterator<Integer> iter = link.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            if (link.size() > 3){   //ekalla kierroksella koko > 4 joten poistetaan kohdasta
                iter.remove();
            }
        }
        System.out.println(link);

    }

    private <E> TraLinkedList<E> tralinked(TraLinkedList<E> tralink){ //n operaatiot 1
        ListNode<E> n = tralink.first();
        tralink.insert(n, (E)"aa"); //elä castaa oikeesti _ikinä_
        tralink.first();
        tralink.last();
        System.out.println(n.getElement());
        n.next();
        n.previous();
        tralink.remove(n);

        return tralink;
    }
    private static void pino(){
        //n, operaatiot 1
        //kuin korttipakka, poisto ja lisäys loppuun
        System.out.println("Pino:");
        LinkedStack<Integer> pinoa = new LinkedStack();
        pinoa.push(2);
        pinoa.push(4);
        pinoa.push(8);
        System.out.println(pinoa.peek());
        pinoa.pop();
        if(!pinoa.isEmpty()){
            pinoa.pop();
        }
        System.out.println(pinoa);

    }

    private static void jono(){
        //n, operaatiot 1
        //poisto eteen, lisäys taakse
        System.out.println("Linkitetty jono:");
        LinkedQueue<Integer> que = new LinkedQueue<>();
        que.offer(4);
        que.offer(40);
        que.offer(444);
        System.out.println(que.peek());
        que.poll();
        if(!que.isEmpty()){
            System.out.println(que);
        }
        /**
         * Prioriteettijonossa kekototeutuksen kanssa add ja poll jne logn
         * muut O(1)
         * contains ja remove O(n)
         */
    }

    private static void binPuuTekeminen(){
        //haku lisäys poisto O(H), operaatiot järjestetyssä logn
        //pituus on solmujen korkeuden määrä -1, eli solmut joilla on lapsia lasketaan
        //esijärjestys= jos puu litistetään ylhäältä, numerot ovat järjestyksessä
        //pienimmästä suurimpaan vasemmalta oikealle
        System.out.println("Binääripuun tekeminen:");
        BTree<Integer> bin = new BTree<>();
        BTreeNode<Integer> n;
        n = new BTreeNode<>(300);
        bin.setRoot(n);
        n.setLeftChild(n = new BTreeNode<>(200));       //1
        n.setRightChild(n = new BTreeNode<>(450));
        n.setRightChild(n = new BTreeNode<>(600));


        if(bin.getRoot() != null){
            n = bin.getRoot();
            while(n != null){
                System.out.println(n.getElement());
                if (n.getElement().compareTo(450) > 0)
                    System.out.print("!Hurraa!");

                if(n.getLeftChild() != null){           //1
                    n = n.getLeftChild();
                    System.out.print("vasen ");
                }
                else if(n.getRightChild() != null){
                    n = n.getRightChild();
                    System.out.print("oikea ");
                }
                else
                    break;
            }
            System.out.println();
        }
        // bin.destroyNode(n);      //1

        /**
         * Sisäjärjestys:
         * jos haettavaa alkiota ei löydy solmusta, niin:
         *  jos haettava < alkio, mennään vasemmalle
         *  muuten haetaan oikealta
         */
        //yleisessä puussa myös setRightSibling() yms metodit

    }

    private static void trajoukko(){
        //setit, xxall() on nlogn aikavaativuuksia
        //union intersection ja difference on O(n)
        TraSet<Integer> joukko = new TraSet<>();
        joukko.add(100);
        joukko.add(200);
        joukko.add(10);
        System.out.println("joukko " + joukko);
        TraSet<Integer> joukko2 = new TraSet<>();
        joukko2.add(150);
        joukko2.add(10);
        joukko2.add(190);
        System.out.println("joukko2" + joukko2);
        if(joukko.contains(100)){
            System.out.println("jipii");
        }

        TraSet<Integer> uusi = new TraSet<>();
        uusi = joukko.union(joukko2);
        System.out.println("union " + uusi);
        uusi = uusi.intersection(joukko);
        System.out.println("intersection " + uusi);
        uusi = uusi.difference(joukko2);
        System.out.println("difference " + uusi);
        uusi.addAll(joukko);
        uusi.retainAll(joukko2);
        System.out.println("retainAll" + uusi);

        /**
         * Hashsetissä add remove contains ovat O(1)
         * alkiot eivät ole järjestyksessä eli läpikäynti erilainen joka kerta
         */
    }

    private static void kuvaus(){
        Map<Integer, String > mappi = new HashMap<>();
        System.out.println("Kuvaus:");
        // puun kanssa O(logn), hashissä O(1)
        mappi.put(1, "aa");
        mappi.put(2,"bee");
        mappi.put(30, "hoo");
        mappi.put(99, "öö");
        if(mappi.containsKey(30)){
            System.out.println("Avain löytyi: " + mappi.get(30));   //hakee kuvauksen
            mappi.remove(30);
        }
        //containsValue ei ole tehokas, O(n)
        System.out.println(mappi);

    }
/**
 * Kuplalajittelu,
 *      vaihdetaan väärässä järjestyksessä olevia naapureita keskenään
 * Upotuslajittelu,
 *      kukin alkio paikalleen tauluun
 * Valintalajittelu
 *      swappaillaan jäljelläolevista pienin
 * kaikki O(n^2)
 *
 * Pikalajittelu eli divide and conquer O(nlogn, lisätila pahimmillaan n)
 *      taulukko kahteen valitun alkion kohdalta, alkio musitiin
 *      gtarkastellaan alusta ja lopusta indekseistä
 *      kun jakoalkiota pienempiä on loppupäässä, siirretään alkuun, samoin jos on isompia alussa
 *      lopussa löytyy alkion paikka
 *      jaetut voidaan jakaa useita kertoja uudestaan
 *          mediaanin jako helpottaa
 * Kekolajittelu    nlogn
 *      alkiot priojonoon ja pois
 *
 *
 */


}
