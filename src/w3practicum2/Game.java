package w3practicum2;

public class Game {
	private String name;
	private int releaseJaar;
	private double nieuwPrijs;
	
	public Game(String name, int rj, double nPr){
		this.name = name;
		releaseJaar = rj;
		nieuwPrijs = nPr;
	}
	
	public String getNaam(){
		return name;
	}
	public double huidigeWaarde(){
		//caluculation needed
		return nieuwPrijs;
	}
	
}
