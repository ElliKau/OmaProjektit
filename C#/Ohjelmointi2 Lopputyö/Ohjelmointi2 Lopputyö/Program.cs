using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ohjelmointi2_Lopputyö
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Aloitusvalikko());

            //Peli(p.pelaaja, p.voitot, p.haviot, vaikeustaso, tekoalytaso)
            //Aloitusvalikko
        }
    }
}
