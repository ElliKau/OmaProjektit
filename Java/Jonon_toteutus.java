import java.util.Iterator;
import java.util.NoSuchElementException;

public class TRAI_21_28_29_ellikau<E>  {

    /**
     *
     * Lisää jonon toteutukseen operaatio toString() joka palauttaa jonon
     * senhetkisen sisällön merkkijonoesityksen (esim. ” < a b c < ”). Rakenna merkkijono käyttäen
     * StringBuilder-luokkaa.
     * Jatka tehtävän X7 jonon toteutusta lisäämällä siihen iteraattorin toteutus (implements
     * Iterable<E>). Iteraattori ei ole jonon tyypillinen operaatio, mutta harjoitellaan nyt sen
     * toteuttamista.
     */


    /**
     * LisÃ¤Ã¤ jonoon yhden alkion.
     *
     * @param x lisÃ¤ttÃ¤vÃ¤ alkio.
     */
    private Integer maara = 0;
    private E[] tauludata = (E[]) new Object[10];

   
    public void lisaa(E x) {
        //maara pitää muistissa indeksikohtaa. Kutsutaan jonon koon tuplausta jos indeksi menee yli
        //tauludatan pituuden.

        if(maara > tauludata.length || maara < 0){          
            throw new NoSuchElementException();
        }
        if(maara >= tauludata.length){          
            tauludata = tuplaaKoko(tauludata);      
        }
        tauludata[maara] = x;       
        maara++;            
    }

    public E[] tuplaaKoko(E[] taulukko){
        E[] tauludata2 = (E[]) new Object[(taulukko.length * 2)];
        for (int i = 0; i < taulukko.length; i++) {         
            tauludata2[i] = taulukko[i];        
        }
        taulukko = tauludata2;      
        return taulukko;            
    }

    /**
     * Poistaa ja palauttaa jonosta siellÃ¤ pisimpÃ¤Ã¤n olleen alkion.
     *
     * @return poistettu jonossa pisimpÃ¤Ã¤n ollut alkio.
     * @throws NoSuchElementException jollei jonossa ole yhtÃ¤Ã¤n alkiota.
     */
   
    public E poista() {
        // Otetaan ensimmäinen alkio talteen. Siirretään jonoa, jotta indeksi 0:ssa on aina
        //ensimmäinen alkio olemassa
        E x = tauludata[0];         
        if (x == null)          
            throw new NoSuchElementException("Sisältö on null");

        for (int i = 0; i < maara ; i++) {         
            tauludata[i] = tauludata[(i+1)];    
        }
        maara--;            
        return x;       

    }

    /**
     * Onko jono tyhjÃ¤ vai ei?
     *
     * @return true jos jonossa ei ole yhtÃ¤Ã¤n alkiota, muuten false
     */
    
    public boolean onkoTyhja() {
        // Koska pidämme aina vähintään ensimmäisessä solussa dataa, jos se on tyhjä on muukin taulukko tyhjä
        if (tauludata[0] == null)   
            return true;
        else                    
            return false;
    }

   
    public String Tulosta(){
        // Aikavaativuus lineaarinen O(n), koska käydään koko taulukko läpi
        StringBuilder strTaulukko = new StringBuilder();
        strTaulukko.append("..::[ ");


        if(tauludata.length < 1)                
            strTaulukko.append(" tyhjää täynnä");

        for (int i = 0; i < tauludata.length; i++) {        
            if(tauludata[i] == null)                        
                break;
            strTaulukko.append(tauludata[i].toString());    
            strTaulukko.append(" ");            
        }
        strTaulukko.append("]::..");    
        return strTaulukko.toString();      
    }

}




