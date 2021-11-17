public class TRAI_21_X1_ellikau implements TRAI_21_X1 {
    //         ^^^^^
    // oma tunnus tÃ¤hÃ¤n


    /**
     * ITSEARVIOINTI TÃ„HÃ„N:
     *
     *Omien ruosteessa kesän jälkeen olevien taitojen perusteella ihan hyväksyttävä vastaus. En ole ekspertti
     * koodauksessa tai sen tehokkaammaksi muokkauksessa, joten tämä on parasta mihin näillä taidoilla pystyn. Jo
     * tekemällä tätät itsearviointia muutin algoritmin kahdesta for loopista yhdeksi jonka sisällä kaikki
     * tapahtuu, eli parannusta on jo tehty niin että koko syötettä ei tarvitse mennä kahdesti läpi.
     *
     * Ensimmäinen ongelma tulee heti minimiluvun etsinnässä, kun olen asettanut jonkun tietyn luvun maksimiksi,
     * johon verrataan kun etsitään pienempää lukua. Joissain syötteissä laittamani 2 miljoonan yläraja ei riitäkään
     * jolloin saataisiin väärä tulos. En vain osannut käyttää Integer luokan minimi ja maksimi metodeita joten
     * siksi tälläinen versio. Myös iteraattorin käyttö oli suositeltavaa.
     *
     * Aikavaativuudesta:
     * Näkisin että kun jokainen alkio käydään läpi kerran, aikavaativuus olisi syötteen määrä plus prosessit n + 2 ,
     * koska teemme kaksi tarkastusta ja sijoituksen(ei joka kerta) ne olisivat O(1) per tarkastus.
     * En tiedä miten se satunnainen sijoitus pitäisi merkitä aikavaativuudessaan.
     *
    /**
     * Suurimman ja pienimmÃ¤n summa.
     * Palauttaa taulukon suurimman ja pienimmÃ¤n luvun summan tai null jos
     * taulukko on tyhjÃ¤.
     *
     * @param A SyÃ¶tetaulukko.
     * @return suurimman ja pienimmÃ¤n summan tai null jos taulukko on tyhjÃ¤.
     */
    @Override
    public Integer suurinJaPieninSumma(Integer[] A) {
        if (A.length < 1)
            return null;

        Integer max = 0;
        Integer min = 2000000;

        if(A.length > 0) {
            //etsitään suurin ja pienin luku ja verrataan, sijoitetaan
            for (int i = 0; i < A.length; i++) {
                if (A[i] > max) {
                    max = A[i];
                }

                if(A[i] < min){
                    min = A[i];
                }
            }
            return  (max + min);
        }
        else
            return 0;
    }
}