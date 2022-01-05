namespace Uusin_vittusaatana_eli_teht_11
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.tbNimi = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.cbArvo = new System.Windows.Forms.ComboBox();
            this.cbsijainti = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.cbtoiminnassa = new System.Windows.Forms.CheckBox();
            this.btnvie = new System.Windows.Forms.Button();
            this.dgviittaus = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.dgviittaus)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(45, 55);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(27, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Nimi";
            // 
            // tbNimi
            // 
            this.tbNimi.Location = new System.Drawing.Point(156, 55);
            this.tbNimi.Name = "tbNimi";
            this.tbNimi.Size = new System.Drawing.Size(143, 20);
            this.tbNimi.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(45, 101);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(75, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Mitattava arvo";
            // 
            // cbArvo
            // 
            this.cbArvo.FormattingEnabled = true;
            this.cbArvo.Items.AddRange(new object[] {
            "lämpörila",
            "kosteus",
            "ph",
            "tuulen nopeus"});
            this.cbArvo.Location = new System.Drawing.Point(156, 101);
            this.cbArvo.Name = "cbArvo";
            this.cbArvo.Size = new System.Drawing.Size(143, 21);
            this.cbArvo.TabIndex = 3;
            // 
            // cbsijainti
            // 
            this.cbsijainti.FormattingEnabled = true;
            this.cbsijainti.Items.AddRange(new object[] {
            "sisällä",
            "ulkona",
            "ulkona suojatusti"});
            this.cbsijainti.Location = new System.Drawing.Point(156, 188);
            this.cbsijainti.Name = "cbsijainti";
            this.cbsijainti.Size = new System.Drawing.Size(121, 21);
            this.cbsijainti.TabIndex = 4;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(45, 191);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(35, 13);
            this.label3.TabIndex = 5;
            this.label3.Text = "sijainti";
            this.label3.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // cbtoiminnassa
            // 
            this.cbtoiminnassa.AutoSize = true;
            this.cbtoiminnassa.Location = new System.Drawing.Point(156, 152);
            this.cbtoiminnassa.Name = "cbtoiminnassa";
            this.cbtoiminnassa.Size = new System.Drawing.Size(81, 17);
            this.cbtoiminnassa.TabIndex = 6;
            this.cbtoiminnassa.Text = "toiminnassa";
            this.cbtoiminnassa.UseVisualStyleBackColor = true;
            // 
            // btnvie
            // 
            this.btnvie.Location = new System.Drawing.Point(307, 142);
            this.btnvie.Name = "btnvie";
            this.btnvie.Size = new System.Drawing.Size(164, 67);
            this.btnvie.TabIndex = 7;
            this.btnvie.Text = "vie";
            this.btnvie.UseVisualStyleBackColor = true;
            this.btnvie.Click += new System.EventHandler(this.btnvie_Click);
            // 
            // dgviittaus
            // 
            this.dgviittaus.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.dgviittaus.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgviittaus.Location = new System.Drawing.Point(12, 229);
            this.dgviittaus.Name = "dgviittaus";
            this.dgviittaus.Size = new System.Drawing.Size(473, 182);
            this.dgviittaus.TabIndex = 8;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(497, 425);
            this.Controls.Add(this.dgviittaus);
            this.Controls.Add(this.btnvie);
            this.Controls.Add(this.cbtoiminnassa);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.cbsijainti);
            this.Controls.Add(this.cbArvo);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.tbNimi);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Tuntiesimerkki 11";
            ((System.ComponentModel.ISupportInitialize)(this.dgviittaus)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox tbNimi;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox cbArvo;
        private System.Windows.Forms.ComboBox cbsijainti;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.CheckBox cbtoiminnassa;
        private System.Windows.Forms.Button btnvie;
        private System.Windows.Forms.DataGridView dgviittaus;
    }
}

