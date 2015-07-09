package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Verarbeitungsschicht.Taetigkeitsverwaltung;

public class Taetigkeitsauswahl extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtVonh;
	private JTextField txtBish;
	private JTextField txtVonm;
	private JTextField txtBism;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Taetigkeitsauswahl dialog = new Taetigkeitsauswahl();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Taetigkeitsauswahl() {
		setTitle("T\u00E4tigkeitsauswahl");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTtigkeitsauswahl = new JLabel("T\u00E4tigkeitsauswahl");
			lblTtigkeitsauswahl.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblTtigkeitsauswahl.setBounds(143, 10, 149, 20);
			contentPanel.add(lblTtigkeitsauswahl);
		}
		
		JComboBox comboBox = new JComboBox(getpossible());
		comboBox.setBounds(181, 90, 163, 20);
		contentPanel.add(comboBox);
		{
			JLabel lblBitteTtigkeitAuswhlen = new JLabel("Bitte T\u00E4tigkeit ausw\u00E4hlen:");
			lblBitteTtigkeitAuswhlen.setBounds(10, 93, 132, 14);
			contentPanel.add(lblBitteTtigkeitAuswhlen);
		}
		{
			JLabel lblBitteArbeitzeitraumAngeben = new JLabel("Bitte Arbeitzeitraum angeben:");
			lblBitteArbeitzeitraumAngeben.setBounds(10, 144, 163, 14);
			contentPanel.add(lblBitteArbeitzeitraumAngeben);
		}
		{
			JLabel lblVon = new JLabel("von:");
			lblVon.setBounds(127, 169, 22, 14);
			contentPanel.add(lblVon);
		}
		{
			JLabel lblBis = new JLabel("bis:");
			lblBis.setBounds(127, 204, 22, 14);
			contentPanel.add(lblBis);
		}
		{
			txtVonh = new JTextField();
			txtVonh.setText("hh");
			txtVonh.setBounds(159, 166, 22, 20);
			contentPanel.add(txtVonh);
			txtVonh.setColumns(10);
		}
		{
			txtBish = new JTextField();
			txtBish.setText("hh");
			txtBish.setColumns(10);
			txtBish.setBounds(159, 201, 22, 20);
			contentPanel.add(txtBish);
		}
		{
			txtVonm = new JTextField();
			txtVonm.setText("mm");
			txtVonm.setColumns(10);
			txtVonm.setBounds(205, 166, 31, 20);
			contentPanel.add(txtVonm);
		}
		{
			txtBism = new JTextField();
			txtBism.setText("mm");
			txtBism.setColumns(10);
			txtBism.setBounds(205, 201, 31, 20);
			contentPanel.add(txtBism);
		}
		{
			JLabel label = new JLabel(":");
			label.setBounds(191, 169, 4, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel(":");
			label.setBounds(191, 204, 4, 14);
			contentPanel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						Taetigkeitsverwaltung tmp=new Taetigkeitsverwaltung();
//						if(combobox.)
//						tmp.addTaetigkeit(combobox., start, end)
					}
					
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Abbrechen");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public String[] getpossible(){
		String [] tmp=new String[4];
		tmp[0]="Projektarbeiten";
		tmp[1]="Attending Meetings";
		tmp[2]="Organisatorische Arbeiten";
		tmp[3]="Business Travel (Projektbezogen)";
		return tmp;
	}
}
