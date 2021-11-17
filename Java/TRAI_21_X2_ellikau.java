import java.util.*;

public class TRAI_21_X2_ellikau implements TRAI_21_X2 {

    /**
     * ITSEARVIONTI TÃ„HÃ„N:
     *  Totta puhuen tämä oli vaikein tehtävä mitä ikinä ohjelmoinnissa tehnyt vaikka idea on hyvin simppeli.
     *  Tehtävää on rassattu 4+ tuntia enkä saanut sitä toimivaksi, tai ajamaan loppuun asti virheittä.
     *  Joillakin kerroilla pääsin lyhyisiin listoihin asti ja joskus se tyssäsi heti ensimmäiseen listapariin.
     *  Erilaisia versioita olen kokeillut kymmenisen kappaletta, käyttäen erillisä while ja for looppeja,
     *  kokeilemalla .equals metodia ja iteraattoria, ja päädyin lopulta siihen minkä tiedän parhaiten eli
     *  ihan vain n^2 ratkaisu simppeleillä tarkistuksilla. En ole tyytyväinen tuotokseeni.
     *
     */
    /**
     * Kasvavien listojen erotus.
     * Palauttaa sellaiset alkiot jotka lÃ¶ytyvÃ¤t listasta A, mutta eivÃ¤t listasta B.
     * Jos alkio on listassa A useasti, mutta ei lainkaan listassa B, alkio tulee tuloslistaan
     * yhtÃ¤ monta kertaa kuin se listassa A on. Jos alkio on edes yhden kerran listassa B, se ei tule
     * tuloslistaan lainkaan.
     * Tuloslista tulee myÃ¶s kasvavaan jÃ¤rjestykseen.
     * Jos listassa A ei ole alkioita tai kaikki listan A alkiot löytyvät
     * listasta B, niin tuloksena on tyhjä lista (lista jossa ei ole yhtään alkiota). Et saa käyttää
     * apuna joukko tai kuvaus -tyyppejä (Set/Map), käyttää valmista removeAll() -operaatiota
     * etkä muuttaa syötelistoja. Mikä on algoritmisi aikavaativuus? Aikavaativuus vaikuttaa arvosteluun
     * (lineaarinen max 5p, neliöllinen max 3p). Jotta saat algoritmistasi tehokkaan,
     * hyödynnä tietoa siitä, että alkiot ovat valmiiksi kasvavassa järjestyksessä.
     *
     * @param A ensimmÃ¤inen syÃ¶telista, alkiot kasvavassa jÃ¤rjestyksessÃ¤
     * @param B toinen syÃ¶telista, alkiot kasvavassa jÃ¤rjestyksessÃ¤
     * @return erotuslista
     */
    @Override
    public ArrayList<Integer> kasvavienErotus(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> tulos = new ArrayList<Integer>();

        Collections.sort(A);        //nlogn
        Collections.sort(B);        //nlogn

        //n^2 aikavaativuus. Ideana hyppiä listaa alkio kerrallaan eteenpäin  kunnes päästään listan loppuun

        int bb = 0;                                         //1
        for (int i = 0; i < A.size(); i++) {                //n
            if (A.size() < 0)                               //1
                break;

            while (B.get(bb) < A.get(0) && bb < B.size()){  //m
                bb++;                                       //1
            }

            if (A.get(i) > B.get(bb)){                      //t
                bb++;                                       //1
                if (A.get(i) < B.get(bb))                   //1
                    tulos.add(A.get(i));                    //1
            }
            else if (A.get(i) == B.get(bb)){                 //t
                continue;
            }
            else if (A.get(i) < B.get(bb)){                  //t
                tulos.add(A.get(i));                         //1
            }
        }
        return tulos;

        /*
        //Parempi versio missä ei n^2 aikavaativuutta mutta ei toimi
        int b = 0;
        int i = 0;
        while (i < A.size()) {

            if (A.size() < 1)
                break;
            else if (B.get(b) < A.get(i)){
                b++;
                if(A.get(i) < B.get(b))
                    tulos.add(A.get(i));
                break;
            }
            else if ( B.get(b) > A.get(i)|| B.size() < 1) {
                i++;
                if (B.get(b) > A.get(i))
                    tulos.add(A.get(i));
                break;
            }
            else if (A.get(i) == B.get(b)){
                i++;
            }
        }

         */



        //* tällä se edes ajaa vaikka väärin
 /*       int b = 0;
        int i = 0;
        while (i < A.size()) {
            if (A.size() < 1)
                break;
            else if (B.get(b) < A.get(i)) {
                b++;
                if (A.get(i) < B.get(b))
                    tulos.add(A.get(i));
                break;
            } else if (B.get(b) > A.get(i) || B.size() < 1) {
                i++;
                if (B.get(b) > A.get(i))
                    tulos.add(A.get(i));
                break;
            } else if (A.get(i) == B.get(b)) {
                i++;
            }
        }
    */

        }
    }




