package grandhotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

	public int getCapasity() {
		return capasity;
	}

	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}

	int cena; 
	int capasity; 
	
	public enum zajetosc{
		wolny, zajety
	}
	
	

}
