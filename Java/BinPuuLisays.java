import fi.uef.cs.tra.BTree;
import fi.uef.cs.tra.BTreeNode;

// TRAI_21_t13.java.java SJ

/**
 * Kirjoita algoritmi, joka lisÃ¤Ã¤ sisÃ¤jÃ¤rjestyksessÃ¤ olevaan binÃ¤Ã¤ripuuhun uuden solmun siten, ettÃ¤ puu sÃ¤ilyy
 * sisÃ¤jÃ¤rjestyksessÃ¤. Jos sama alkio (.equals()) oli jo puussa, niin alkiota ei lisÃ¤tÃ¤ puuhun. Parametreina puu ja
 * alkio. Algoritmi luo uuden solmun jos lisÃ¤ys tehdÃ¤Ã¤n.  Algoritmi palauttaa totuusarvon lisÃ¤ttiinkÃ¶ alkio vai ei.
 **/

// Tarvitset projektiin (tai komentoriville) TRA-kirjaston.

import fi.uef.cs.tra.BTree;
import fi.uef.cs.tra.BTreeNode;

import java.util.Random;

public class TRAI_21_t13_ellikau {

    public static void main(String[] args) {

        BTree<Integer> puu = new BTree<Integer>();

        int N = 12;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        System.out.println("Puuhun:");
        Random r = new Random(42);
        Integer x = 0;
        for (int i = 0; i < N; i++) {
            x = r.nextInt(N * 2);
            System.out.print(x + " ");
            inorderInsert(puu, x);
        }
        System.out.println();

        System.out.println("SisÃ¤jÃ¤rjestyksessÃ¤:");
        inorderPrint(puu);

        for (int i = 0; i < N * 2; i++) {
            System.out.println("Onko " + i + " : " +
                    inorderMember(puu, i));
        }

    } // main()


    /**
     * LisÃ¤ys sisÃ¤jÃ¤rjestettyyn binÃ¤Ã¤ripuuhun.
     * LisÃ¤Ã¤ alkion x binÃ¤Ã¤ripuuhun jollei sitÃ¤ siellÃ¤ ennestÃ¤Ã¤n ole.
     * @param T binÃ¤Ã¤ripuu
     * @param x lisÃ¤ttÃ¤vÃ¤ alkio
     * @return tehtiinkÃ¶ lisÃ¤ys vai ei
     * -----------------
     *  Kirjoita algoritmi joka lisää sisäjärjestyksessä olevaan binääripuuhun uuden solmun siten,
     * että puu säilyy sisäjärjestyksessä. Jos sama alkio (.equals()) oli jo puussa, niin alkiota ei
     * lisätä puuhun. Parametreina puu ja alkio. Algoritmi luo uuden solmun jos lisäys tehdään.
     * Algoritmi palauttaa totuusarvon lisättiinkö alkio vai ei.
     *
     */
    public static <E extends Comparable<? super E>>
    boolean inorderInsert(BTree<E> T, E x) {
        BTreeNode<E> n = T.getRoot();

        //Tarkistetaan onko puu tyhjä
        if(T.isEmpty()){
            BTreeNode solmu = new BTreeNode(x);
            T.setRoot(solmu);
            n = T.getRoot();
            return true;
        }

        // lisäyslooppi, false tulee jos elementti on samanarvoinen kuin verrattava
        // tarkistetaan myös onko lapsia jo olemassa ennen lisäystä
        while (n != null) {
            if (x.compareTo(n.getElement()) < 0) {
                if (n.getLeftChild() == null) {
                    n.setLeftChild(new BTreeNode<>(x));
                    //System.out.println("vasen:" + x);
                    return true;
                }
                else{
                    n = n.getLeftChild();
                }
            }
            else if (x.compareTo(n.getElement()) > 0) {
                if (n.getRightChild() == null) {
                    n.setRightChild(new BTreeNode<>(x));
                    //System.out.println("oikee:" + x);
                    return true;
                }
                else{
                    n = n.getRightChild();
                }
            }
            else
                return false;
        }
        return false;

    }


    // -------------------------------
    // esimerkkejÃ¤

    /**
     * Onko alkio sisÃ¤jÃ¤rjestetyssÃ¤ binÃ¤Ã¤ripuussa vai ei
     * @param T sisÃ¤jÃ¤rjestetty binÃ¤Ã¤ripuu
     * @param x etsittÃ¤vÃ¤ alkio
     * @param <E> alkiotyyppi
     * @return true jos alkio x on puussa, muuten false
     */
    public static <E extends Comparable<? super E>>
    boolean inorderMember(BTree<E> T, E x) {
        BTreeNode<E> n = T.getRoot();

        while (n != null) {
            if (x.compareTo(n.getElement()) == 0)
                return true;
            else if (x.compareTo(n.getElement()) < 0)
                n = n.getLeftChild();
            else
                n = n.getRightChild();
        }
        return false;

    } // inorderMember()


    /**
     * Tulostus sisÃ¤jÃ¤rjestyksessÃ¤ rekursiivisesti.
     * @param T tulostettava puu
     */
    public static void inorderPrint(BTree T) {
        inorderPrintBranch(T.getRoot());
        System.out.println();
    } // inorderPrint()


    /**
     * Tulostus sisÃ¤jÃ¤rjestyksessÃ¤ rekursiivisesti.
     * @param n tulostettavan alipuun juuri
     */
    public static void inorderPrintBranch(BTreeNode n) {
        if (n == null)
            return;

        inorderPrintBranch(n.getLeftChild());
        System.out.print(n.getElement() + " ");
        inorderPrintBranch(n.getRightChild());

    } // inorderPrintBranch()


} // class TRAI_21_t13.java