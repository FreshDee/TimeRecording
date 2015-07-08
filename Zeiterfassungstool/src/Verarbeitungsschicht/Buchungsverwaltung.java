package Verarbeitungsschicht;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Buchungsverwaltung implements IF_Buchungsverwaltung{
	private ArrayList<Buchung>BuchungsList= new ArrayList<Buchung>();
	
public boolean addBuchung (Datum buchungsdatum, Projekt projekt_gebucht, Mitarbeiter mA_gebucht, Taetigkeit taetigkeit_gebucht) throws FileNotFoundException, IOException{
		
		//Bei der Neuerstellung einer Taetigkeit im System wird die ID fortlaufend vergeben und daher automatisch ermittelt.
		BuchungsList.add(new Buchung(BuchungsList.size()+1, buchungsdatum, projekt_gebucht, mA_gebucht, taetigkeit_gebucht));
		speicher("BuchungsList");
		return true;
	}
	
	public boolean deleteBuchung (String ID){
		for(int i=0; i<BuchungsList.size(); i++){
			if(BuchungsList.get(i).getBuchungsID() == Integer.parseInt(ID)){
				BuchungsList.remove(i);
				return true;
			}
		}
		JOptionPane.showMessageDialog(null,"Die Buchung wurde nicht gefunden!","Löschen fehlgeschlagen", JOptionPane.ERROR_MESSAGE);
		return false;
	}
	
	public void speicher (String Datei) throws FileNotFoundException, IOException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Datei+".dat"));
		out.writeObject(BuchungsList);
		out.close();
		
	}
	
	public void lesen(String Datei) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream (new FileInputStream(Datei+".dat"));
		BuchungsList=(ArrayList<Buchung>) in.readObject();
		 in.close();
	}

	public void display() {
		
		for(int i= 0; i< BuchungsList.size(); i++){
			System.out.println(BuchungsList.get(i).toString());
		}
		
	}


	@Override
	public ArrayList<Buchung> getBuchungsList() {
		// TODO Auto-generated method stub
		return BuchungsList;
	}
	

}
