package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

import Verarbeitungsschicht.Taetigkeit;

public class TimeClaim extends JFrame {

	private JPanel contentPane;
	private Taetigkeit tmp;
	private static TimeClaim frame = new TimeClaim();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TimeClaim() {
		setTitle("Time Claim");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTimeclaim = new JLabel("TimeClaim");
		lblTimeclaim.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTimeclaim.setBounds(165, 11, 93, 14);
		panel.add(lblTimeclaim);
		
		JLabel lblMitarbeiter = new JLabel("Mitarbeiter:");
		lblMitarbeiter.setBounds(10, 52, 72, 14);
		panel.add(lblMitarbeiter);
		
		JLabel lblNewLabel = new JLabel("Mitarbeiterinfos\r\n");
		lblNewLabel.setBounds(182, 52, 110, 14);
		panel.add(lblNewLabel);
		
		JLabel lblTtigkeitsauswahl = new JLabel("T\u00E4tigkeit:");
		lblTtigkeitsauswahl.setBounds(10, 91, 72, 14);
		panel.add(lblTtigkeitsauswahl);
		
		JLabel lblT = new JLabel("T\u00E4tigkeitsinfo");
		lblT.setBounds(182, 91, 72, 14);
		panel.add(lblT);
		
		JLabel lblBuchungsdatum = new JLabel("Buchungsdatum:");
		lblBuchungsdatum.setBounds(10, 155, 93, 14);
		panel.add(lblBuchungsdatum);
		
		JLabel lblDatumDerBuchung = new JLabel("Datum der Buchung");
		lblDatumDerBuchung.setBounds(182, 155, 110, 14);
		panel.add(lblDatumDerBuchung);
		
		JLabel lblProjekt = new JLabel("Projekt");
		lblProjekt.setBounds(182, 130, 110, 14);
		panel.add(lblProjekt);
		
		JLabel lblZugehrigesProjekt = new JLabel("zugeh\u00F6riges Projekt:");
		lblZugehrigesProjekt.setBounds(10, 130, 122, 14);
		panel.add(lblZugehrigesProjekt);
		
		JButton btnTtigkeitsauswahl = new JButton("T\u00E4tigkeitsauswahl");
		btnTtigkeitsauswahl.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Taetigkeitsauswahl.main(null);
				frame.dispose();
			}
			
		});
		btnTtigkeitsauswahl.setBounds(286, 187, 128, 23);
		panel.add(btnTtigkeitsauswahl);
		
		JButton btnHi = new JButton("hi");
		btnHi.setBounds(20, 187, 89, 23);
		panel.add(btnHi);
	}
}
