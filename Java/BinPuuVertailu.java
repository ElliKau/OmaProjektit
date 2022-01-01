// TRAI_21_t14_15.java SJ

import fi.uef.cs.tra.BTree;
import fi.uef.cs.tra.BTreeNode;
import fi.uef.cs.tra.LinkedQueue;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TRAI_21_t14_15_ellikau {
    /**
     * Kirjoita algoritmi joka etsii binÃ¤Ã¤ripuun matalimman (vÃ¤hiten syvÃ¤n)
     * lehtisolmun.
     *
     * @param T binÃ¤Ã¤ripuu
     * @return matalin lehtisolmu tai null jos puu on tyhjÃ¤
     **/

    public static void main(String[] args) {

        BTree<Integer> puu = null;

        int N = 15;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        puu = new BTree<Integer>();

        System.out.println("\nPuuhun:");
        Random r = new Random(42);
        Integer x = null;
        for (int i = 0; i < N; i++) {
            x = r.nextInt(N * 2);
            System.out.print(x + " ");
            inorderInsert(puu, x);
        }
        System.out.println();

        System.out.println("Matalin lehtisolmu = " + matalin(puu).getElement());

        puu = exampleBTree();

        BTree<Integer> puu2 = exampleBTree();

        System.out.println("Samat rakenteet : " + vertaaRakenne(puu, puu2));

        System.out.println("LisÃ¤tÃ¤Ã¤n: 7");
        inorderInsert(puu, 7);
        System.out.println("Samat rakenteet : " + vertaaRakenne(puu, puu2));

        System.out.println();

    } // main()

    public static BTreeNode matalin(BTree T) {
        if (T.isEmpty())
            return null;
        LinkedQueue<BTreeNode> qq = new LinkedQueue<BTreeNode>();
        BTreeNode l;
        BTreeNode r;

        if (T.getRoot() != null) {
            qq.offer(T.getRoot());
            while (!qq.isEmpty()) {
                BTreeNode n = qq.poll();
                l = n.getLeftChild();
                r = n.getRightChild();
                if (l != null)
                    qq.offer(l);
                if (r != null)
                    qq.offer(r);
                if (l == null && r == null)
                    return n;
            }
        }
        return null;
    } // matalin()

    /**
     * Kirjoita algoritmi, joka vertaa kahta binÃ¤Ã¤ripuuta ja palauttaa toden jos
     * puut ovat raken-
     * teeltaan samat, muuten epÃ¤toden. Puun sisÃ¤ltÃ¤miÃ¤ elementtejÃ¤ ei siis
     * vertailla, vain puun
     * rakennetta, korkeutta.
     *
     * @param T1  syÃ¶tepuu1
     * @param T2  syÃ¶tepuu2
     * @param <E> alkiotyyppi (ei kÃ¤ytetÃ¤)
     * @return ovatko rakenteeltaan samat vai ei
     */
    public static <E> boolean vertaaRakenne(BTree<E> T1, BTree<E> T2) {

        if (verrataan(T1.getRoot(), T2.getRoot()) == true) {
            return true;
        } else
            return false;
    }

    public static boolean verrataan(BTreeNode n1, BTreeNode n2) {
        if (n1 == null & n2 == null) {
            return true;
        }
        // jää jonoon oikeet lapset koska eka tarkistetaan vasemmat lapset
        if (n1 != null && n2 != null) {
            return (verrataan(n1.getLeftChild(), n2.getLeftChild()) &&
                    verrataan(n1.getRightChild(), n2.getRightChild()));
        }

        return false;

    }

    /**
     * LisÃ¤ys sisÃ¤jÃ¤rjestettyyn binÃ¤Ã¤ripuuhun.
     * 
     * @param T binÃ¤Ã¤ripuu
     * @param x lisÃ¤ttÃ¤vÃ¤ alkio
     * @return tehtiinkÃ¶ lisÃ¤ys vai ei
     */
    public static <E extends Comparable<? super E>> boolean inorderInsert(BTree<E> T, E x) {
        BTreeNode<E> n = T.getRoot();
        if (n == null) {
            T.setRoot(new BTreeNode<E>(x));
            return true;
        }

        while (true) {

            if (x.compareTo(n.getElement()) == 0)
                return false;

            else if (x.compareTo(n.getElement()) < 0) {
                if (n.getLeftChild() == null) {
                    n.setLeftChild(new BTreeNode<>(x));
                    return true;
                } else
                    n = n.getLeftChild();
            } else {
                if (n.getRightChild() == null) {
                    n.setRightChild(new BTreeNode<>(x));
                    return true;
                } else
                    n = n.getRightChild();
            }
        }
    } // inorderInsert()

} // class TRAI_21_t14.java