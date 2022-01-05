using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uusin_vittusaatana_eli_teht_11
{
    public struct Mittaus
    {
        public string nimi;
        public string mitattavaArvo;
        public bool toiminnassa;
        public string sijainti;

        public string Nimi
        {
            get { return nimi; }
        }
        public string MitattavaArvo
        {
            get { return mitattavaArvo; }
        }

        public string Toiminnassa
        {
            get // tarvii returnin
            {
                if (toiminnassa)
                    return "Kyllä";
                else
                    return "Ei";
            }
        }

        public string Sijainti
        {
            get { return sijainti; }
        }

    }

    public partial class Form1 : Form
    {

        public List<Mittaus> mittaukset = new List<Mittaus>();


        public Form1()
        {
            InitializeComponent();
        }

        private void btnvie_Click(object sender, EventArgs e)
        {
            Mittaus mittaus; // luodaan tietue, ja haetaan tiedot
            mittaus.nimi = tbNimi.Text;
            mittaus.mitattavaArvo = cbArvo.Text;
            mittaus.toiminnassa = cbtoiminnassa.Checked;
            mittaus.sijainti = cbsijainti.Text;

            mittaukset.Add(mittaus);

            dgviittaus.DataSource = null; // mittaukset pitää nollata ennen sijoitusta
            dgviittaus.DataSource = mittaukset;
        }
    }
}
