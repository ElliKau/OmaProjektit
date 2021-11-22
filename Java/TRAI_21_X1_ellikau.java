public class TRAI_21_X1_ellikau implements TRAI_21_X1 {
    //         ^^^^^
    // oma tunnus tÃ¤hÃ¤n


    /**
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