import fi.uef.cs.tra.BTree;
import fi.uef.cs.tra.BTreeNode;

public class TRAI_21_X4_ellikau implements TRAI_21_X4 {

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
        BTreeNode s;            //uusi node johon verrataan
        BTreeNode p = null;    //parent


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
    }

}

     /*
                    //Osa aikaisemmista kokeiluista
                    p = n.getParent();
                if (n == p.getParent())
                    return p;
                if(n == p.getRightChild() && p.getLeftChild() != null && p.getParent() != null){
                    n = p.getLeftChild();
                    if (n.getRightChild() == null)
                        return n;

                    while( n.getRightChild() != null){
                        n = n.getRightChild();
                    }
                    return n;
                }
                if(p.getLeftChild() == null || p.getParent() == null){
                    return p;
                }
                if (p.getLeftChild() == n){
                    return p.getParent();
                }
            }
            else{
                if(n.getLeftChild() != null){
                    s = n.getLeftChild();
                    while(s.getRightChild()!= null || s == n.getRightChild()){
                        s = s.getRightChild();
                    }
                    return s;
                }
            }*/
        /*
                  5
              3      6
           2    4        8
                      7   10
        while( n!=null)
        Lähdetään oikealta alhaalta
        vanhempia
            kyllä, mene, palauta vanhempi
            poista oikea lapsi josta tultiin

        lapsia oikealla
            kyllä, mene
            ei
        lapsia vasemmalla
            kyllä, mene
            ei

        jos ollaan oikea lapsi mennään vanhempaan < palauta vanhempi ( unohda oikea lapsi)
        onko vanhemmalla sitten vasen lapsi
        jos on niin sinne
        onkos sillä lapsella oikea lapsi

        if hasleft
            if   hasright



        if (n.getLeftChild() != null ){ //|| n == n.getRightChild()
            n = n.getLeftChild();
            n.setLeftChild(n);
        }
        else if (n.getRightChild() != null && n != n.getRightChild()){
            n = n.getRightChild();
            n.setRightChild(n);
            return n;
        }
        else if(n.getParent() != null){
            //jos n on samanalainen kuin getrightchild niin mennään vasemmalle
            n = n.getParent();
            n.removeRightChild();
            return n;
        }
        */

