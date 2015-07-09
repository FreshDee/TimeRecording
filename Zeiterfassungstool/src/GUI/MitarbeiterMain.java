package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MitarbeiterMain extends JFrame {

	private JPanel contentPane;
	static MitarbeiterMain frame = new MitarbeiterMain();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					frame.setVisible(true);
					frame.setTitle("MitarbeiterMain");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MitarbeiterMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 217, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClaimTime = new JButton("Claim Time");
		btnClaimTime.setBounds(10, 11, 181, 23);
		contentPane.add(btnClaimTime);
		btnClaimTime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Hier kommt das Claim Time Fenster");
				TimeClaim.main(null);
				frame.dispose();
			}
		});
		
		JButton btnBuchungsUebersicht = new JButton("Buchungsübersicht");
		btnBuchungsUebersicht.setBounds(10, 45, 181, 23);
		contentPane.add(btnBuchungsUebersicht);
		btnBuchungsUebersicht.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Hier kommt das Buchungsfenster");
				
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(102, 108, 89, 23);
		contentPane.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Sie wurden ausgeloggt");
				frame.dispose();
				Einloggfenster.main(null);
			}
		});
	}

}

