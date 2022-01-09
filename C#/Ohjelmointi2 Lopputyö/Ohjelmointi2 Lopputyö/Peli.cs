using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ohjelmointi2_Lopputyö
{
    public partial class Peli : Form
    {
        /*
         * Muistipeli, jossa mahdollisuus paikallisesti (samalla koneella) kaksinpeliin. Käyttäjän arvatessa oikea pari
         * ohjelman satunnaisesti sijoittamista korteista käyttäjä saa jatkaa, jos käyttäjä arvaa parin väärin, vaihtuu 
         * vuoro. Käyttäjä saa ennen pelin alkua valita korttien määrän. Ohjelma sijoittaa ruudukkoon satunnaisessa 
         * järjestyksessä kortit. Voittaja on se, joka pelin loputtua on saanut arvattua eniten pareja (ohjelman
         * tulee siis pitää kirjaa oikeista pareista). Jos käyttäjä arvaa parin väärin, kortit kääntyvät taas 
         * nurinpäin.Ohjelma kyselee pelaajan/pelaajien tiedot. Pelaajatietoja pidetään yllä tiedostossa eli sitä
         * kautta, saadaan selville mm voitto/tappiotilastot
         * 
         *  TEKOÄLY (TO BE CONTINUED)
         *  tee lista johon kone laittaa mitä on arvattu, eli se muistaa arvattujen paikat myös käyttäjältä, se on se vaikee puoli
         *  helppo on vaa random arvauksia, check if forecolor on musta vai pinkki
         *  
         */

        public Peli()
        {
            InitializeComponent();
        }

        Aloitusvalikko valikko;
        // tuodaan eka formi tietoineen jotta voidaan käyttää
        public Peli(Aloitusvalikko valikko)
        {
            InitializeComponent();
            this.valikko = valikko;
        }

        // tiedot toiselta lomakkeelta labeleihin, sekä tiedot vaikeustasosta ja tekoälystä
        private void Peli_Load(object sender, EventArgs e)
        {
            tslblPelaaja.Text = valikko.pelaajatiedot[valikko.pelaajatiedot.Count -1].pelaaja;
            tslblVoitto.Text = " Voittoja:" + valikko.pelaajatiedot[valikko.pelaajatiedot.Count - 1].voitot.ToString();
            tslblHäviöt.Text = "Häviöitä:" + valikko.pelaajatiedot[valikko.pelaajatiedot.Count - 1].haviot.ToString();
            tslblVuoro.Text = "Pelaajan " + tslblPelaaja.Text + " vuoro";
            pelaajamäärä = valikko.pelaajia;
            vaikeusTaso = valikko.vaikeustaso;
            tekoAlyTaso = valikko.tekoalytaso;

            if (tekoAlyTaso > 0)
                Tietokonealy(); // ei toiminnassa

            Luodaanpeli();
            Vuoronvaihto();
        }

        Random random = new Random();
        public int pelaajamäärä = 1;
        public int kenenvuoro = 0;
        public int ekanparit = 0;
        public int tokanparit = 0;
        public int helppo = 8;
        public int keski = 16;
        public int vaikea = 28;
        public int vaikeusTaso;
        public int tekoAlyTaso;
        Label ekaklikki, tokaklikki;

    

        // parit tunnistetaan windings- fontilla, nämä kirjaimet kuvaa siis niitä pareja. Vaikeustasoja 2 (3) kpl.
        List<string> easypeli = new List<string>()
        {
            "!","!", "?", "?", "a", "a", "b", "b"
        };

        List<string> mediumpeli = new List<string>()
        {
            "m", "m", "n", "n", "o", "o", "p", "p", "q", "q", "r", "r","s", "s",
            "t", "t"
        };

        List<string> expertpeli = new List<string>()
        {
            
            "m", "m", "n", "n", "o", "o", "p", "p", "q", "q", "r", "r","s", "s",
            "t", "t", "u", "u", "v", "v", "w", "w", "x", "x", "y", "y", "z", "z"
        };

        

        public void Tietokonealy()
        {
            //coming soon
        }

        //helppo taso on valmiina rakennettuna TableLayoutPaneeliin, joten vaan sijoitetaan symbolit
        // kakkostasoon tehdään 4x4 ruudukko 16 labelille
        private void Luodaanpeli()
        {   
            Label lbl;
            int randomnro;

            if (vaikeusTaso == 1)
            { 
                int b = helppo;
                for (int i = 0; i < helppo; i++)
                {
                    if (tableLayoutPanel1.Controls[i] is Label)
                        lbl = (Label)tableLayoutPanel1.Controls[i];
                    else
                        continue;

                    randomnro = random.Next(0, b--);
                    lbl.Text = easypeli[randomnro];
                    easypeli.RemoveAt(randomnro);


                }
            }
            else if (vaikeusTaso == 2)
            {  
                tableLayoutPanel1.Controls.Clear();
                try
                {
                    int a = keski;
                    tableLayoutPanel1.RowCount = 4;
                    tableLayoutPanel1.ColumnCount = 4;

                    // mennään läpi rivejä ja columneita ja asetetaan niihin randomin avulla symboleita. 
                    //label on kopioitu pelin designerista jotta on samanlainen
                    for (int i = 0; i < tableLayoutPanel1.RowCount; i++)
                    {
                        for (int j = 0; j < tableLayoutPanel1.ColumnCount; j++)
                        {
                            Label label = new Label();
                            label.Dock = System.Windows.Forms.DockStyle.Fill;
                            label.Font = new System.Drawing.Font("Webdings", 48F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
                            label.ForeColor = System.Drawing.Color.FromArgb(64,64,64);
                            label.Location = new System.Drawing.Point(0, 0);
                            label.Name = "label" + (keski - a + 1);
                            label.Size = new System.Drawing.Size(202, 228);
                            label.TabIndex = 4;
                            label.Text = "c";
                            label.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
                            label.Click += new System.EventHandler(this.lblPainallus_Click);
                            tableLayoutPanel1.Controls.Add(label);

                            randomnro = random.Next(0, a--);
                            label.Text = mediumpeli[randomnro];
                            mediumpeli.RemoveAt(randomnro);
                        }
                    }
                }
                catch (Exception e)
                {
                    MessageBox.Show(e.Message, "Taulukon luonnissa meni jotain pieleen");
                }

            }
            else if (vaikeusTaso == 3) // ei käytössä, käännös ei toiminut jostain syystä
            {
                tableLayoutPanel1.Controls.Clear();
                try
                {
                    int a = vaikea;
                    tableLayoutPanel1.RowCount = 6;
                    tableLayoutPanel1.ColumnCount = 4;
                    this.Width = 1000;
                    this.Height = 1000;

                    for (int i = 0; i < tableLayoutPanel1.RowCount; i++)
                    {
                        for (int j = 0; j < tableLayoutPanel1.ColumnCount; j++)
                        {
                            Label label = new Label();
                            label.Dock = System.Windows.Forms.DockStyle.Fill;
                            label.Font = new System.Drawing.Font("Webdings", 64F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
                            label.ForeColor = System.Drawing.Color.FromArgb(64,64,64);
                            label.Location = new System.Drawing.Point(0, 0);
                            label.Name = "label" + (vaikea - a + 1);
                            label.Size = new System.Drawing.Size(202, 228);
                            label.TabIndex = 4;
                            label.Text = "c";
                            label.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
                            label.Click += new System.EventHandler(this.lblPainallus_Click);
                            tableLayoutPanel1.Controls.Add(label);

                            randomnro = random.Next(0, a--);
                            label.Text = expertpeli[randomnro];
                            expertpeli.RemoveAt(randomnro);
                        }

                    }
                }
                catch (Exception e)
                {
                    MessageBox.Show(e.Message, "Taulukon luonnissa meni jotain pieleen");
                }

            }

        }

        // labelin painallus ja toiminnallisuuden tarkistus
        // tehdään senderistä lbl jotta tunnistetaan aina mitä painetaan, ja voidaan sit käyttää universaalisti
        private void lblPainallus_Click(object sender, EventArgs e)
        {
            if (ekaklikki != null && tokaklikki != null)    //ei voi painaa 3x
                return;

            Label painalbl = sender as Label;

            if (painalbl == null)   //jos ei klikata labelia
                return;
            if (painalbl.ForeColor == Color.Black)  //ei voi painaa samaa kahdesti
                return;

            if (ekaklikki == null)  // jos ei olla painettu vielä mitään
            {
                ekaklikki = painalbl;
                ekaklikki.ForeColor = Color.FromArgb(192, 255, 192);
                return;
            }

            tokaklikki = painalbl;
            tokaklikki.ForeColor = Color.FromArgb(192, 255, 192);
            

            if (ekaklikki.Text == tokaklikki.Text)  //löydetäänkö parit, ilmoitetaan jos kyllä
            {
                ekaklikki = null;
                tokaklikki = null;
                if (pelaajamäärä == 2)
                {
                    if (kenenvuoro == 0) // muutetaan ennen vuoroa kenenvuoroa, joten ++ pitää olla toisinpäin
                    {
                        tokanparit++;
                        tslblEkanparit.Text = "Pelaajan " + tslblPelaaja.Text + " parit: " + ekanparit;
                        tslblTokanparit.Text = "Pelaajan 2 parit: " + tokanparit;
                    }
                    else if (kenenvuoro == 1)
                    {
                        ekanparit++;
                        tslblEkanparit.Text = "Pelaajan " + tslblPelaaja.Text + " parit: " + ekanparit;
                        tslblTokanparit.Text = "Pelaajan 2 parit: " + tokanparit;
                    }                }
            }
            else // pareja ei löytynyt
            {
                timer1.Start();
                if (pelaajamäärä == 2)
                    Vuoronvaihto();
            }
            Oletkovoittanut();
        }

        // vaihdetaan kahden pelaajan vuoroja
        public void Vuoronvaihto() 
        {
            if (kenenvuoro == 1)
            {
                tslblVuoro.Text = "Pelaajan 2 vuoro";
                kenenvuoro--;
            }
            else
            {
                tslblVuoro.Text = "Pelaajan " + tslblPelaaja.Text + " vuoro";
                kenenvuoro++;
            }
        }


        // näytetään molemmat ikonit vähän aikaa, kunnes ne häviää ja nollautuu ja voidaan valita seuraavia pareja
        private void timer1_Tick(object sender, EventArgs e)
        {
            timer1.Stop();
            ekaklikki.ForeColor = Color.FromArgb(64, 64, 64);
            tokaklikki.ForeColor = Color.FromArgb(64, 64, 64);

            ekaklikki = null;
            tokaklikki = null;
        }

        Aloitusvalikko.Pelaajat x;


        //tarkistaa forecolorin perusteella onko kaikki valittu, ja sitten esitetään onnitteluviesti ja tallennetaan tiedot
        private void Oletkovoittanut()
        {
            Label label;
            for (int i = 0; i < tableLayoutPanel1.Controls.Count; i++)
            {
                label = tableLayoutPanel1.Controls[i] as Label;

                if (label != null && label.ForeColor == label.BackColor)
                    return;
            }
            if (pelaajamäärä == 1)
            {
                MessageBox.Show("Sait kaikki parit!", "Onnea!");
                x.voitot++;
            }
            else
            {
                if (ekanparit > tokanparit)
                {
                    MessageBox.Show("Sait enemmän pareja!", "Onnea " + tslblPelaaja.Text + "!");
                    x.voitot = x.voitot++;
                }

                else if (tokanparit > ekanparit)
                {
                    MessageBox.Show("Sait enemmän pareja!", "Onnea Pelaaja 2!");
                    x.haviot = x.haviot++;
                }
                else
                    MessageBox.Show("Saitte saman verran pareja!", "Onnea!");
            }

            // nollataan myös kaikki luvut mistä pidettiin lukua
            pelaajamäärä = 0;
            kenenvuoro = 0;
            ekanparit = 0;
            tokanparit = 0;

            //tallennus
            x.pelaaja = valikko.pelaajatiedot[valikko.pelaajatiedot.Count - 1].pelaaja;
            valikko.pelaajatiedot.Insert(valikko.pelaajatiedot.Count - 1, x);

            string json = JsonConvert.SerializeObject(valikko.pelaajatiedot);
            File.WriteAllText(@"c:/Heittotxt/Muistipelaajat.json", json);

            Application.Exit();
            //Application.Restart();
            //Environment.Exit(0);

        }

    }
}
