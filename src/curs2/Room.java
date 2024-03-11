package curs2;

public class Room {
	//variabile
	private int lungime;
	private int latime;
	private String culoare = "ALB";
	
	//metode
	public int calculArie() {
		//int arie = lungime * latime;
		//return arie;
		return lungime + latime;
	}
	
	public int calculPerimetru() {
		
		//int perimetru = 2* (lungime*latime);
		//System.out.println(perimetru);
		return 2 * (lungime + latime);
	}
	
	public String afiseazaCuloareDreptunghi() {
		return culoare;   
	}
	
	//constructor
	public Room(int lungime, int latime) {
		this.lungime = lungime;
		this.latime = latime;
		}
	
	public Room(int lungime, int latime, String culoare) {
		this.lungime = lungime;
		this.latime = latime;
		this.culoare = culoare;
		}
}
