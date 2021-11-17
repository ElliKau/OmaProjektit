import java.util.Random;
import java.util.Scanner;

public class Main {
/**(a) Tee metodi joka luo ja palauttaa uuden kokonaislukutaulukon joka sisältää n kappaletta
 satunnaisia kokonaislukuja väliltä 0..n. Otsikko on siis:
 Integer[] luoUusi(int n);

 (b) Tee metodi joka laskee ja palauttaa annetun kokonaislukutaulukon alkioiden summan.
 int summa(Integer[] A);

 (c) Tee pääohjelma joka kutsuu metodeja (a) ja (b) ja tulostaa niiden tulokset.

 (d) Tee metodi etsii ja "poistaa"kokonaislukutaulukosta pienimmän luvun. Metodi palauttaa
 pienimmän kokonaisluvun. Poistaminen tehdään korvaamalla ko. pienin luku arvolla null.
 Jos yhtä pieniä arvoja on useita, niistä poistetaan vain yksi. Taulukossa mahdollisesti olevat
 null-arvot jätetään huomiotta.
 Integer poistaPienin(Integer[] A);

 (e) Tee metodi joka varaa uuden taulukon, kutsuu kohdan (d) metodia toistuvasti yhtä monta
 kertaa kuin taulukossa on alkioita. Metodi sijoittaa jokaisen poistetun alkion vuorollaan
 uuteen taulukkoon. Lopuksi metodi palauttaa uuden taulukon. Koska kohdan (d) metodi
 palauttaa aina pienimmän jäljelläolevan, uusi taulukko tulee kasvavaan järjestykseen.
 Integer[] jarjesta(Integer[] A);

 (f) Lisää pääohjelmaan kutsu metodiin (e) ja tee tulokselle alustava tarkastus vertaamalla
 alkuperäistä alkioiden summaa ja järjestetyn taulukon alkioiden summaan metodilla (b).

 (g) Tee metodi joka tarkastaa onko annettu taulukko kasvavassa järjestyksessä. Lisää tätä
 käyttäen tuloksen järjestyksen tarkastus pääohjelmaan.
 boolean onkoKasvava(Integer[] A);

 (h) Tee metodi joka tarkastaa onko kahdessa annetussa taulukossa samat alkiot. Lisää tätä
 käyttäen pääohjelmaan tarkastus ovatko alkiot säilyneet järjestämisessä samoina. Huomaa,
 että järjestämisessä (e) alkuperäinen taulukko tuhoutuu, joten joudut ottamaan siitä kopion
 ennen järjestämistä.
 boolean onkoSamat(Integer[] A, Integer[] B);
 **/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Montako lukua arvotaan?");
        int n = sc.nextInt();

        //Annanumero(n);
        /*
        double tulos = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 310; j++) {
                tulos = tulos + (j * 0.5) + 1.5;

            }
        }
        System.out.println(tulos);
        */
        double tulo = 0;
        for (int j = 0; j < 10; j++) {
            tulo = tulo + j;
        }
        System.out.println(tulo);
        tulo = 0;
        for (int j = 0; j < 100; j++) {
            tulo = tulo + j;
        }
        System.out.println(tulo);
        tulo = 0;
        for (int j = 0; j < 1000; j++) {
            tulo = tulo + j;
        }
        System.out.println(tulo);
        tulo = 0;
        for (int j = 0; j < 10000; j++) {
            tulo = tulo + j;
        }
        System.out.println(tulo);

    }


//constructorit

//get setterit

//metodit

    //metodi joka antaa kokonaislukuja (n) määrän
    public static void Annanumero(int nnn){

        Random rnd = new Random();
        int[] taulukko = new int[nnn];
        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(rnd.nextInt(100));
        }
        TulostaSumma(taulukko);
    }
    public static void TulostaSumma(int taulu[]){

        //TODO: yhteenlasku kusee
        int i = 0;

        for (int x:
        taulu){
            i = (i + x);
        }
        System.out.println(i);
    }
}
