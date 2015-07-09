package Verarbeitungsschicht;

import java.io.Serializable;

public class Taetigkeit implements Serializable {

	private int TatigkeitsID;
	private String bezeichnung;
	private boolean isbillable;
	private Zeit Anfang;
	private Zeit Ende;
	public int getTatigkeitsID() {
		return TatigkeitsID;
	}
	public void setTatigkeitsID(int tatigkeitsID) {
		TatigkeitsID = tatigkeitsID;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public boolean isIsbillable() {
		return isbillable;
	}
	public void setIsbillable(boolean isbillable) {
		this.isbillable = isbillable;
	}
	public Zeit getAnfang() {
		return Anfang;
	}
	public void setAnfang(Zeit anfang) {
		Anfang = anfang;
	}
	public Zeit getEnde() {
		return Ende;
	}
	public void setEnde(Zeit ende) {
		Ende = ende;
	}
	public Taetigkeit(int tatigkeitsID, String bezeichnung, boolean isbillable,
			Zeit anfang, Zeit ende) {
		super();
		TatigkeitsID = tatigkeitsID;
		this.bezeichnung = bezeichnung;
		this.isbillable = isbillable;
		Anfang = anfang;
		Ende = ende;
	}
	
	
	

}
