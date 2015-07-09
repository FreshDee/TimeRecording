package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ProjektleiterMain extends JFrame {

	private JPanel contentPane;
	static ProjektleiterMain frame = new ProjektleiterMain();

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
	public ProjektleiterMain() {
		setTitle("ProjektleiterMain");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblProjektleiterHauptfenster = new JLabel(
				"Projektleiter Hauptfenster");
		lblProjektleiterHauptfenster.setBounds(105, 11, 213, 24);
		lblProjektleiterHauptfenster.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblProjektleiterHauptfenster);

		JButton btnTimeclaim = new JButton("TimeClaim");
		btnTimeclaim.setBounds(44, 86, 139, 23);
		btnTimeclaim.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TimeClaim.main(null);
				frame.dispose();
				
			}
			
		});
		panel.add(btnTimeclaim);

		JButton btnMitarbeiterverwaltung = new JButton("Mitarbeiterverwaltung");
		btnMitarbeiterverwaltung.setBounds(44, 120, 139, 23);
		panel.add(btnMitarbeiterverwaltung);

		JButton btnProjektverwaltung = new JButton("Projektverwaltung");
		btnProjektverwaltung.setBounds(44, 154, 139, 23);
		panel.add(btnProjektverwaltung);

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(325, 218, 89, 23);
		btnLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Sie wurden ausgeloggt");
				frame.dispose();
				Einloggfenster.main(null);
			}
		});
		panel.add(btnLogout);
	}
}
