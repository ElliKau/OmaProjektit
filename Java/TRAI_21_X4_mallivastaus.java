import fi.uef.cs.tra.BTree;
import fi.uef.cs.tra.BTreeNode;

public class TRAI_21_X4_mallivastaus implements TRAI_21_X4 {

    /**
     * ITSEARVIOINTI TÃ„HÃ„N:
     *
     * Taas yksi omalle logiikalle haastava tehtävä, eka osio sujui hyvin mutta en pysty löytämään
     * sitä yleistä logiikkaa tehtäviin mitä haetaan, ja siksi ratkaisuni ovat hirveän monimutkaisia
     * ja eivät lopulta toimi oikein. ratkaisuni on kauheaa koodia ja if-else viidakko ja pyörii ikuisesti
     * virheen takia. Ohjaustunnilla Ville kehotti miettimään uusiksi tokakohdan mutta
     * en jaksa aloittaa uudestaan neljättä kertaa ja sen suuren tuntimäärän takia jonka olen jo käyttänyt tähän
     * _yhteen_ tehtävään. Olen niin perusteellisen turhautunut siihen etten ymmärrä logiikkaa tehtävien takana.
     * Aikavaativuus ekan tehtävän kohdalta 2 * logn + 3 = O(logn)
     * Isomman tehtävän kohdalla lähin arvaukseni on 6 * logn + 10 = O(logn)
     * // TODO virhe numeroissa 39-47, pyörii 2 solmua syvässä loopissa ikuisesti
     */

    /**
     * Palauttaa binÃ¤Ã¤ripuun sisÃ¤jÃ¤rjestyksessÃ¤ viimeisen solmun.
     *
     * @param T Tarkasteltava puu.
     * @return Viimeinen solmu tai null jos puu T on tyhjÃ¤.
     */
    @Override
    public BTreeNode sisaViimeinen(BTree T) {

        BTreeNode n = T.getRoot();      //1

        if (T.isEmpty())
            return null;
        while (n != null) { //logn
            if (n.getRightChild() == null)  //1
                return n;
            else
                n = n.getRightChild();      //1
        }
        return n;
    }

    /**
     * Palauttaa binÃ¤Ã¤ripuun solmun n edeltÃ¤jÃ¤n sisÃ¤jÃ¤rjestyksessÃ¤.
     *
     * @param n BinÃ¤Ã¤ripuun solmu.
     * @return edeltÃ¤jÃ¤solmu tai null jollei edeltÃ¤jÃ¤Ã¤ ole.
     */
    @Override
    public BTreeNode sisaEdellinen(BTreeNode n) {
        BTreeNode s ;
        BTreeNode m;    //uusi node johon verrataan
        BTreeNode p ;    //parent

        /**jos s:n vasen lapsi ei ole null
         *      Node s = s:n vasen lapsi
         *      niin kauan kuin s:n oikea lapsi ei ole null
         *          s = s:n oikea lapsi
         *      palauta s;
         * muulloin
         *      Node s = s
         *      Node p = s:n vanhempi
         *      niin kauan kuin vanhempi ei ole null
         *          jos vanhemman oikea lapsi on sama kuin s
         *              palauta p;
         *          muulloin
         *              s = p
         *              p = p:n vanhempi
         *
         *  toteutus alla:
         */


        if(n.getLeftChild() != null){
            n = n.getLeftChild();
            while (n.getRightChild() != null){
                n = n.getRightChild();
            }
            return n;
        }
        else {
            s = n;
            p = n.getParent();
            while (p != null){
                if (p.getRightChild() == s){
                    return p;
                }
                else{
                    s = p;
                    p = p.getParent();
                }
            }
        }
        return null;


        /*
        if (n.getParent() != null) {                                            //1*
            if (n.getLeftChild() == null || n.getRightChild() == null) {        //1*
                p = n.getParent();
                if (p.getRightChild() == n) {                                   //1*
                    return p;
                } else if (p.getLeftChild() == n) {                             //1*
                    p = p.getParent();
                    return p;
                }
            } else if (n.getLeftChild() != null) {                              //1*
                s = n.getLeftChild();
                while (s.getRightChild() != null) {                             //logn * korkeus?
                    s = s.getRightChild();
                }
                return s;
            }
        } else {
            if (n.getLeftChild() != null) {                                     //1*
                s = n.getLeftChild();
                while (s.getRightChild() != null) {                             //logn * korkeus?
                    s = s.getRightChild();
                }
                return s;
            }

        }
        return null;

         */
    }

}


