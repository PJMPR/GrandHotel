package grandhotel;

import model.IHaveId;

public class Room implements IHaveId{ 
	private long id; 
	private int cena; 
	private int capasity; 
	

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

	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	

}
