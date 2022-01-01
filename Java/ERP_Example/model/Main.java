package ERP_Example.model;
// Enterprise resource project eli tilaustoimitusjärjestelmä
//Singleton esimerkki

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tilaus> tilaukset = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // tehdään tuote ja tilausrivi
        Tuote t = new Tuote(123, "saha");
        TilausRivi tr = new TilausRivi(2, 4, 5.00, t); // aikasempi tuote

        while (true) {
            System.out.print("Tilausnumero: ");
            int tnro = scan.nextInt();
            if (tnro <= 0)
                break;
            Tilaus ti = new Tilaus(tnro, new Asiakas(1, "Kai"));
            tilaukset.add(ti);
            ti.addTilausRivi(tr);
        }
        for (Tilaus ti : tilaukset) {
            System.out.println(ti);
        }

        Varasto v1 = Varasto.getVarasto("Neulaniemi");
        Varasto v2 = Varasto.getVarasto(""); 
        System.out.println(v1.getNimi());
        System.out.println(v2.getNimi());

    }
}
