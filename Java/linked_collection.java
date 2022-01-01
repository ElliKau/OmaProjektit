// TRAI_21_t8_9.java SJ
// PÃ¤Ã¤ohjelma viikon 2 tehtÃ¤viin 8 ja 9

import java.util.*;


public class TRAI_21_t24 {

    /**
     * LisÃ¤Ã¤ jÃ¤rjestettyy listaan jÃ¤rjestÃ¤mÃ¤ttÃ¶mÃ¤n kokoelman alkiot
     * siten, ettÃ¤ lista pysyy jÃ¤rjestyksessÃ¤.
     * @param L jÃ¤rjestetty lista johon lisÃ¤tÃ¤Ã¤n
     * @param C kokoelma jonka alkiot lisÃ¤tÃ¤Ã¤n
     * @param <E> alkiotyyppi
     */
    public static <E extends Comparable<? super E>> void lisaaJarjestettyyn(LinkedList<E> L, Collection<E> C) {
        //Aikavaativuus on n+ mlogm = nlogn

        PriorityQueue<E> pque = new PriorityQueue();
        Iterator<E> iter = C.iterator();

        while(iter.hasNext()){
            E ite = iter.next();
            pque.add(ite);
        }

        ListIterator<E> iteL = L.listIterator();       
        E edellinen = L.peek();

        //käydään lista L läpi ja lisätään oikeisiin kohtiin priolistasta alkiot
        //pidetään mielessä aina seuraava ja edellinen iteraattorin alkio vertailua varten,
        //eli jos osuu samanairvoiseen, tai osuu johonkin väliin
            while(iteL.hasNext() && !pque.isEmpty()){              
                E iterE = iteL.next();                            
                if(iterE.compareTo(pque.peek()) > 0){            
                    if(edellinen.compareTo(pque.peek()) < 0){       
                        iteL.add(pque.poll());                   
                    }
                }
                else if(iterE.compareTo(pque.peek()) == 0)       
                    iteL.add(pque.poll());                  
                edellinen = iterE;                          
            }
            while (!pque.isEmpty())     
                L.add(pque.poll());    
    }

} // class
