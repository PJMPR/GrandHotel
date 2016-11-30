package grandhotel;

import java.util.*;



public class Room { 
	long nr_r; 
	public long getNr_r() {
		return nr_r;
	}




	public void setNr_r(long nr_r) {
		this.nr_r = nr_r;
	}




	public int getCena() {
		return cena;
	}




	public void setCena(int cena) {
		this.cena = cena;
	}




	int capasity; 
	int cena;  
	
	
	
	
	enum zajetosc{
		wolny ,zajety
	}
	
	

}
