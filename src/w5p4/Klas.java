package w5p4;

import java.util.ArrayList;

public class Klas {
	private String klasCode;
	private ArrayList<Leerling> deLeerlingen;

	public Klas(String klasCode) {
		this.klasCode = klasCode;
		deLeerlingen = new ArrayList<Leerling>();
	}

	public void voegLeerlingToe(Leerling l) {
		deLeerlingen.add(l);
	}

	public void wijzigCijfer(String naam, double newCijfer) {
		for (int i = 0; i < deLeerlingen.size(); i++) {
			if (deLeerlingen.get(i).getNaam().equals(naam)) {
				deLeerlingen.get(i).setCijfer(newCijfer);
			}
		}
	}

	public ArrayList<Leerling> getLeerling() {
		return deLeerlingen;
	}

	public int aantalLeerlingen() {
		return deLeerlingen.size();
	}

	public String toString(){
		String s = "In klas " + klasCode + " zitten de volgende leerlingen: \n";
//		for(Leerling l : deLeerlingen) {
//			s += l + "\n"
//		}
		for(int i=0; i<deLeerlingen.size(); i++){
			s += deLeerlingen.get(i) + "\n";
		}
		return s;
	}
}
