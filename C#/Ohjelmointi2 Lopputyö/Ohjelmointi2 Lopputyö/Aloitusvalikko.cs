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
    public partial class Aloitusvalikko : Form
    {
        //pelaajatietojen tallennus structiin, myös datagridiä varten rakenteet
        public struct Pelaajat
        {
            public string pelaaja;
            public int voitot;
            public int haviot;

            public string Pelaaja
            {
                get { return pelaaja; }
            }
            public int Voitot
            {
                get { return voitot; }
            }
            public int Häviöt
            {
                get { return haviot; }
            }

        }
        public Aloitusvalikko()
        {
            InitializeComponent();
        }

        // heti alkuun haetaan tiedostosta JSON Pelaajatiedot
        private void Aloitusvalikko_Load(object sender, EventArgs e)
        {
            var path2 = Path.Combine(Directory.GetCurrentDirectory(), "\\Muistipelaajat.txt");
            //string path = @"c:/Heittotxt/Muistipelaajat.json";
            if (File.Exists(path2))
            {
                using (StreamReader rr = new StreamReader(path2))
                {
                    string json = rr.ReadToEnd();
                    pelaajatiedot = JsonConvert.DeserializeObject<List<Pelaajat>>(json);

                    dgridPelaajatiedot.DataSource = null;
                    dgridPelaajatiedot.DataSource = pelaajatiedot;
                }
            }
            else
                MessageBox.Show("Ei löydy tiedostoa " + path2);

            groupPelaajat.ForeColor = Color.FromArgb(192, 255, 192);
            groupVaikeus.ForeColor = Color.FromArgb(192, 255, 192);
            groupVastustaja.ForeColor = Color.FromArgb(192, 255, 192);
            dgridPelaajatiedot.EnableHeadersVisualStyles = false;
            dgridPelaajatiedot.ColumnHeadersDefaultCellStyle.BackColor = Color.FromArgb(64, 64, 64);
            dgridPelaajatiedot.ColumnHeadersBorderStyle = DataGridViewHeaderBorderStyle.Single;
        }


        public List<Pelaajat> pelaajatiedot = new List<Pelaajat>();
        public int vaikeustaso = 0;
        public int tekoalytaso = 0;
        public int pelaajia = 0;

        //tallennus structiin
        public void Pelaajatallennus()
        {
            Pelaajat pp;
            pp.pelaaja = txtUusipelaaja.Text;
            pp.voitot = 0;
            pp.haviot = 0;
            if (pelaajatiedot.Contains(pp))
            {
                //hae pelaajan tiedot vietäväksi
                //pelaajatiedot.find tms?
            }
            else
            {
                pelaajatiedot.Add(pp);

            }
        }

        // tallennetaan valinnat kaksinpelistä ja konevastustajasta
        private void radKaksin_CheckedChanged(object sender, EventArgs e)
        {   
            if (radKaksin.Checked == true)
            {
                pelaajia = 2;

                radHelppo.Enabled = true;
                radVaikea.Enabled = true;
            }
            else
            {
                pelaajia = 0;
                radHelppo.Checked = false;
                radHelppo.Enabled = false;
                radVaikea.Enabled = false;
                radVaikea.Checked = false;
            }
        }

        //Yksinpeli
        private void radYksin_CheckedChanged(object sender, EventArgs e)
        {
            if (radYksin.Checked == true)
                pelaajia = 1;
            else
                pelaajia = 0;
        }

        // käyttämätön, älä huomioi
        private void btnTuoProfiili_Click(object sender, EventArgs e)
        {
            //Pelaajatallennus();
        }


        // Tallennetaan tiedot vaikeustasosta
        private void radEasy_CheckedChanged(object sender, EventArgs e)
        {
            if (radEasy.Checked)
            {
                vaikeustaso = 1;
            }
            else if (radMedium.Checked)
            {
                vaikeustaso = 2;
            }
            else if (radExpert.Checked) // tätä en kerennyt viimeistellä, joten tulee dlc:ssä :) heh
            {
                radExpert.Checked = false;
                MessageBox.Show("Osta Expert taso DLC vain 39.99e niin saat huimat 28 ruutua!", "Supertarjous!");
            }
            else
                vaikeustaso = 0;
        }

        // Tallennetaan tekoälyn taso jos sitä olisi
        private void radHelppo_CheckedChanged(object sender, EventArgs e)
        {
            if (radHelppo.Checked)
            {
                tekoalytaso = 1;
            }
            else if (radVaikea.Checked)
            {
                tekoalytaso = 2;
            }
            else
                tekoalytaso = 0;
        }

        //tallennetaan pelaajatiedot jos valideja, aloitetaan peli
        private void btnLetsMennaan_Click(object sender, EventArgs e)
        {
            if (pelaajia == 0 || vaikeustaso == 0 || txtUusipelaaja.Text.Length == 0)
            {
                if (pelaajia == 0)
                    errorProvider1.SetError(groupPelaajat, "Tee valinta");
                else
                    errorProvider1.SetError(groupPelaajat, "");


                if (vaikeustaso == 0)
                    errorProvider1.SetError(groupVaikeus, "Tee valinta");
                else
                    errorProvider1.SetError(groupVaikeus, "");

                //Pelaajan valinta tai uuden tekeminen
                if (txtUusipelaaja.Text.Length == 0 && dgridPelaajatiedot.SelectedRows == null)
                    errorProvider1.SetError(txtUusipelaaja, "Anna nimi tai valitse pelaaja");
                else
                    errorProvider1.SetError(txtUusipelaaja, "");
                
            }
            else
            {
                errorProvider1.Clear();
                Pelaajatallennus();

                Peli pelinakyma = new Peli(this);
                pelinakyma.Show();
            }
        }

        private void dgridPelaajatiedot_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {

                txtUusipelaaja.Text = e.RowIndex.ToString();
            }
        }
    }
}
