package w1practicum2;

public class Voetbalclub {
	private String naam;
	private int aantalGewonnen = 0;
	private int aantalGelijk = 0;
	private int aantalVerloren = 0;

	public Voetbalclub(String nm) {
		naam = nm;
	}

	public void verwerkResultaat(char ch) {
		if (ch == 'w')
			aantalGewonnen = aantalGewonnen + 1;
		if (ch == 'g')
			aantalGelijk = aantalGelijk + 1;
		if (ch == 'v')
			aantalVerloren = aantalVerloren + 1;
	}
	
	private int aantalGespeeld(){
		return aantalGelijk+aantalGewonnen+aantalVerloren;
	}
	
	private int aantalPunten(){
		int winP = 3*aantalGewonnen;
		int totaal = winP+aantalGelijk;
		return totaal;
	}
		
	public String toString(){
		String s = naam + aantalGespeeld() + "\t \t" +  aantalGewonnen + "\t" + aantalGelijk + "\t" + aantalVerloren
				+ "\t \t" + aantalPunten();
		return s;
	}
}
