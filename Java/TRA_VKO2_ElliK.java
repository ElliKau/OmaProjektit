import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TRA_VKO2_ElliK {
    /**
     * Kirjoita algoritmi (Java-metodi) joka saa parametrinaan kaksi kokonaislukutaulukkoa
     * (In teger[] A, Integer[] B) ja joka luo ja palauttaa uuden kokonaislukutaulukon jossa on kaikki
     * ne alkiot jotka löytyvät jommastakummasta taulukosta (siis niiden yhdisteen). Kukin al kio
     * (.equals() palauttaa toden) tulee kuitenkin tulostaulukkoon vain yhden kerran vaikka
     * se esiintyisi toisessa tai molemmissa taulukoissa useamman kerran. Mikä on algoritmisi
     * aikavaativuus? Voisiko sitä parantaa?
     *
     * ITSEARVIOINTI:
     * Tehtävää on yritetty joskaan en ihan toimimaan saa, molempien listojen vertailun tulostus ei toimi.
     * Kuitenkin arvioin algoritmin vaativuudeksi n^2 luokan koska kierrätän jokaista A alkiota kohden
     * jokaista B alkiota.
     */
    private static final int num = 5;
    private static Integer[] A = new Integer[num];
    private static Integer[] B = new Integer[num];
    private static Integer[] C = new Integer[(num*2)];

//constructorit

    public static void main(String[] args ){

        luoTaulu(A, B);
    }

    static Integer[] luoTaulu(Integer[] a, Integer[] b){
        Random rnd = new Random();


        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            b[i] = rnd.nextInt(10);
            System.out.print(b[i] + " ");
        }

        //lisätään taulu A yhteiseen tauluun C
        for (int i = 0; i < a.length; i++) {
            C[i] = a[i];
        }

        System.out.println();

        //yhdistetään taulukot
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < C.length; j++) {

                if(C[j].equals(b[i]) == false){ //ongelmat täällä
                    C[j] = b[i];
                    System.out.print(b[j] + " ");
                }
            }
        }

        for (Integer x :
                C) {
            System.out.print(x + " ");
        }
        return C;
        //TODO: ei tee tarkistusta oikein
    }


}
