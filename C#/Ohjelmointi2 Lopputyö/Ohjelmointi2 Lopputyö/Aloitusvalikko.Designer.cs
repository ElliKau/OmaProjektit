
namespace Ohjelmointi2_Lopputyö
{
    partial class Aloitusvalikko
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
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle3 = new System.Windows.Forms.DataGridViewCellStyle();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Aloitusvalikko));
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtUusipelaaja = new System.Windows.Forms.TextBox();
            this.dgridPelaajatiedot = new System.Windows.Forms.DataGridView();
            this.radYksin = new System.Windows.Forms.RadioButton();
            this.radKaksin = new System.Windows.Forms.RadioButton();
            this.groupPelaajat = new System.Windows.Forms.GroupBox();
            this.groupVastustaja = new System.Windows.Forms.GroupBox();
            this.label3 = new System.Windows.Forms.Label();
            this.radHelppo = new System.Windows.Forms.RadioButton();
            this.radVaikea = new System.Windows.Forms.RadioButton();
            this.btnTuoProfiili = new System.Windows.Forms.Button();
            this.btnLetsMennaan = new System.Windows.Forms.Button();
            this.lblPelaaja = new System.Windows.Forms.Label();
            this.radExpert = new System.Windows.Forms.RadioButton();
            this.radMedium = new System.Windows.Forms.RadioButton();
            this.radEasy = new System.Windows.Forms.RadioButton();
            this.groupVaikeus = new System.Windows.Forms.GroupBox();
            this.errorProvider1 = new System.Windows.Forms.ErrorProvider(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.dgridPelaajatiedot)).BeginInit();
            this.groupPelaajat.SuspendLayout();
            this.groupVastustaja.SuspendLayout();
            this.groupVaikeus.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Sitka Small", 17.25F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(143, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(197, 34);
            this.label1.TabIndex = 0;
            this.label1.Text = "Muistipeli v0.1";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F);
            this.label2.Location = new System.Drawing.Point(24, 171);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(68, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Uusi pelaaja:";
            // 
            // txtUusipelaaja
            // 
            this.txtUusipelaaja.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.txtUusipelaaja.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtUusipelaaja.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.txtUusipelaaja.Location = new System.Drawing.Point(149, 168);
            this.txtUusipelaaja.MaxLength = 30;
            this.txtUusipelaaja.Name = "txtUusipelaaja";
            this.txtUusipelaaja.Size = new System.Drawing.Size(101, 20);
            this.txtUusipelaaja.TabIndex = 9;
            // 
            // dgridPelaajatiedot
            // 
            this.dgridPelaajatiedot.BackgroundColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.dgridPelaajatiedot.CellBorderStyle = System.Windows.Forms.DataGridViewCellBorderStyle.SingleHorizontal;
            this.dgridPelaajatiedot.ColumnHeadersBorderStyle = System.Windows.Forms.DataGridViewHeaderBorderStyle.Single;
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.Color.White;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.Silver;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dgridPelaajatiedot.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle1;
            this.dgridPelaajatiedot.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            dataGridViewCellStyle2.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle2.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            dataGridViewCellStyle2.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            dataGridViewCellStyle2.SelectionForeColor = System.Drawing.Color.Black;
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dgridPelaajatiedot.DefaultCellStyle = dataGridViewCellStyle2;
            this.dgridPelaajatiedot.GridColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.dgridPelaajatiedot.Location = new System.Drawing.Point(8, 203);
            this.dgridPelaajatiedot.MultiSelect = false;
            this.dgridPelaajatiedot.Name = "dgridPelaajatiedot";
            this.dgridPelaajatiedot.ReadOnly = true;
            dataGridViewCellStyle3.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            dataGridViewCellStyle3.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle3.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            dataGridViewCellStyle3.NullValue = null;
            dataGridViewCellStyle3.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            dataGridViewCellStyle3.SelectionForeColor = System.Drawing.Color.Black;
            dataGridViewCellStyle3.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dgridPelaajatiedot.RowHeadersDefaultCellStyle = dataGridViewCellStyle3;
            this.dgridPelaajatiedot.RowHeadersVisible = false;
            this.dgridPelaajatiedot.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgridPelaajatiedot.Size = new System.Drawing.Size(332, 123);
            this.dgridPelaajatiedot.TabIndex = 3;
            this.dgridPelaajatiedot.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgridPelaajatiedot_CellContentClick);
            this.dgridPelaajatiedot.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgridPelaajatiedot_CellContentClick);
            // 
            // radYksin
            // 
            this.radYksin.AutoSize = true;
            this.radYksin.Location = new System.Drawing.Point(15, 19);
            this.radYksin.Name = "radYksin";
            this.radYksin.Size = new System.Drawing.Size(67, 17);
            this.radYksin.TabIndex = 4;
            this.radYksin.TabStop = true;
            this.radYksin.Text = "Yksinpeli";
            this.radYksin.UseVisualStyleBackColor = true;
            this.radYksin.CheckedChanged += new System.EventHandler(this.radYksin_CheckedChanged);
            // 
            // radKaksin
            // 
            this.radKaksin.AutoSize = true;
            this.radKaksin.Location = new System.Drawing.Point(136, 19);
            this.radKaksin.Name = "radKaksin";
            this.radKaksin.Size = new System.Drawing.Size(73, 17);
            this.radKaksin.TabIndex = 5;
            this.radKaksin.TabStop = true;
            this.radKaksin.Text = "Kaksinpeli";
            this.radKaksin.UseVisualStyleBackColor = true;
            this.radKaksin.CheckedChanged += new System.EventHandler(this.radKaksin_CheckedChanged);
            // 
            // groupPelaajat
            // 
            this.groupPelaajat.Controls.Add(this.radYksin);
            this.groupPelaajat.Controls.Add(this.radKaksin);
            this.groupPelaajat.Location = new System.Drawing.Point(27, 59);
            this.groupPelaajat.Name = "groupPelaajat";
            this.groupPelaajat.Size = new System.Drawing.Size(267, 39);
            this.groupPelaajat.TabIndex = 7;
            this.groupPelaajat.TabStop = false;
            this.groupPelaajat.Text = "Pelimuoto";
            // 
            // groupVastustaja
            // 
            this.groupVastustaja.Controls.Add(this.label3);
            this.groupVastustaja.Controls.Add(this.radHelppo);
            this.groupVastustaja.Controls.Add(this.radVaikea);
            this.groupVastustaja.Location = new System.Drawing.Point(149, 101);
            this.groupVastustaja.Name = "groupVastustaja";
            this.groupVastustaja.Size = new System.Drawing.Size(144, 61);
            this.groupVastustaja.TabIndex = 8;
            this.groupVastustaja.TabStop = false;
            this.groupVastustaja.Text = "Tietokonevastustaja";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(48, 23);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(34, 16);
            this.label3.TabIndex = 13;
            this.label3.Text = "DLC";
            // 
            // radHelppo
            // 
            this.radHelppo.AutoSize = true;
            this.radHelppo.Enabled = false;
            this.radHelppo.Location = new System.Drawing.Point(13, 19);
            this.radHelppo.Name = "radHelppo";
            this.radHelppo.Size = new System.Drawing.Size(96, 17);
            this.radHelppo.TabIndex = 8;
            this.radHelppo.TabStop = true;
            this.radHelppo.Text = "Helppo tekoäly";
            this.radHelppo.UseVisualStyleBackColor = true;
            this.radHelppo.Visible = false;
            this.radHelppo.CheckedChanged += new System.EventHandler(this.radHelppo_CheckedChanged);
            // 
            // radVaikea
            // 
            this.radVaikea.AutoSize = true;
            this.radVaikea.Enabled = false;
            this.radVaikea.Location = new System.Drawing.Point(13, 38);
            this.radVaikea.Name = "radVaikea";
            this.radVaikea.Size = new System.Drawing.Size(95, 17);
            this.radVaikea.TabIndex = 12;
            this.radVaikea.TabStop = true;
            this.radVaikea.Text = "Vaikea tekoäly";
            this.radVaikea.UseVisualStyleBackColor = true;
            this.radVaikea.Visible = false;
            // 
            // btnTuoProfiili
            // 
            this.btnTuoProfiili.Location = new System.Drawing.Point(121, 266);
            this.btnTuoProfiili.Name = "btnTuoProfiili";
            this.btnTuoProfiili.Size = new System.Drawing.Size(145, 23);
            this.btnTuoProfiili.TabIndex = 8;
            this.btnTuoProfiili.Text = "Lisää pelaaja tiedostoon";
            this.btnTuoProfiili.UseVisualStyleBackColor = true;
            this.btnTuoProfiili.Visible = false;
            this.btnTuoProfiili.Click += new System.EventHandler(this.btnTuoProfiili_Click);
            // 
            // btnLetsMennaan
            // 
            this.btnLetsMennaan.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.btnLetsMennaan.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.btnLetsMennaan.FlatAppearance.BorderSize = 5;
            this.btnLetsMennaan.ForeColor = System.Drawing.Color.Black;
            this.btnLetsMennaan.Location = new System.Drawing.Point(343, 281);
            this.btnLetsMennaan.Margin = new System.Windows.Forms.Padding(0);
            this.btnLetsMennaan.Name = "btnLetsMennaan";
            this.btnLetsMennaan.Size = new System.Drawing.Size(113, 45);
            this.btnLetsMennaan.TabIndex = 10;
            this.btnLetsMennaan.Text = "Lets play!";
            this.btnLetsMennaan.UseVisualStyleBackColor = false;
            this.btnLetsMennaan.Click += new System.EventHandler(this.btnLetsMennaan_Click);
            // 
            // lblPelaaja
            // 
            this.lblPelaaja.AutoSize = true;
            this.lblPelaaja.Location = new System.Drawing.Point(438, 238);
            this.lblPelaaja.Name = "lblPelaaja";
            this.lblPelaaja.Size = new System.Drawing.Size(0, 13);
            this.lblPelaaja.TabIndex = 11;
            // 
            // radExpert
            // 
            this.radExpert.AutoSize = true;
            this.radExpert.Location = new System.Drawing.Point(38, 77);
            this.radExpert.Name = "radExpert";
            this.radExpert.Size = new System.Drawing.Size(55, 17);
            this.radExpert.TabIndex = 12;
            this.radExpert.TabStop = true;
            this.radExpert.Text = "Expert";
            this.radExpert.UseVisualStyleBackColor = true;
            this.radExpert.CheckedChanged += new System.EventHandler(this.radEasy_CheckedChanged);
            // 
            // radMedium
            // 
            this.radMedium.AutoSize = true;
            this.radMedium.Location = new System.Drawing.Point(38, 54);
            this.radMedium.Name = "radMedium";
            this.radMedium.Size = new System.Drawing.Size(62, 17);
            this.radMedium.TabIndex = 13;
            this.radMedium.TabStop = true;
            this.radMedium.Text = "Medium";
            this.radMedium.UseVisualStyleBackColor = true;
            this.radMedium.CheckedChanged += new System.EventHandler(this.radEasy_CheckedChanged);
            // 
            // radEasy
            // 
            this.radEasy.AutoSize = true;
            this.radEasy.Location = new System.Drawing.Point(38, 31);
            this.radEasy.Name = "radEasy";
            this.radEasy.Size = new System.Drawing.Size(48, 17);
            this.radEasy.TabIndex = 14;
            this.radEasy.TabStop = true;
            this.radEasy.Text = "Easy";
            this.radEasy.UseVisualStyleBackColor = true;
            this.radEasy.CheckedChanged += new System.EventHandler(this.radEasy_CheckedChanged);
            // 
            // groupVaikeus
            // 
            this.groupVaikeus.Controls.Add(this.radEasy);
            this.groupVaikeus.Controls.Add(this.radMedium);
            this.groupVaikeus.Controls.Add(this.radExpert);
            this.groupVaikeus.Location = new System.Drawing.Point(321, 59);
            this.groupVaikeus.Name = "groupVaikeus";
            this.groupVaikeus.Size = new System.Drawing.Size(106, 103);
            this.groupVaikeus.TabIndex = 7;
            this.groupVaikeus.TabStop = false;
            this.groupVaikeus.Text = "Vaikeustaso";
            // 
            // errorProvider1
            // 
            this.errorProvider1.ContainerControl = this;
            // 
            // Aloitusvalikko
            // 
            this.AccessibleDescription = "Memorygame";
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.ClientSize = new System.Drawing.Size(462, 336);
            this.Controls.Add(this.groupVastustaja);
            this.Controls.Add(this.groupVaikeus);
            this.Controls.Add(this.lblPelaaja);
            this.Controls.Add(this.btnLetsMennaan);
            this.Controls.Add(this.dgridPelaajatiedot);
            this.Controls.Add(this.txtUusipelaaja);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.groupPelaajat);
            this.Controls.Add(this.btnTuoProfiili);
            this.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Aloitusvalikko";
            this.Padding = new System.Windows.Forms.Padding(5);
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Aloitusvalikko";
            this.Load += new System.EventHandler(this.Aloitusvalikko_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgridPelaajatiedot)).EndInit();
            this.groupPelaajat.ResumeLayout(false);
            this.groupPelaajat.PerformLayout();
            this.groupVastustaja.ResumeLayout(false);
            this.groupVastustaja.PerformLayout();
            this.groupVaikeus.ResumeLayout(false);
            this.groupVaikeus.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtUusipelaaja;
        private System.Windows.Forms.DataGridView dgridPelaajatiedot;
        private System.Windows.Forms.RadioButton radYksin;
        private System.Windows.Forms.RadioButton radKaksin;
        private System.Windows.Forms.GroupBox groupPelaajat;
        private System.Windows.Forms.Button btnTuoProfiili;
        private System.Windows.Forms.Button btnLetsMennaan;
        private System.Windows.Forms.Label lblPelaaja;
        private System.Windows.Forms.RadioButton radExpert;
        private System.Windows.Forms.RadioButton radMedium;
        private System.Windows.Forms.RadioButton radEasy;
        private System.Windows.Forms.GroupBox groupVaikeus;
        private System.Windows.Forms.GroupBox groupVastustaja;
        private System.Windows.Forms.RadioButton radHelppo;
        private System.Windows.Forms.RadioButton radVaikea;
        private System.Windows.Forms.ErrorProvider errorProvider1;
        private System.Windows.Forms.Label label3;
    }
}