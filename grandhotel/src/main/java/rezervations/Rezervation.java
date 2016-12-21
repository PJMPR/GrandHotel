package rezervations;

import java.sql.Date;


import java.util.*;

import org.joda.time.*;

import grandhotel.Room;
import grandhotel.Room.Zajetosc; 
import model.IHaveId;


public class Rezervation implements IHaveId { 
	 
	public Rezervation(Guest gosc, Room pokoj, DateTime start, DateTime end, int R_nr) {
		super();
		this.pokoj = pokoj;
		this.gosc = gosc; 
		cena_p=this.pokoj.getCena(); 
		this.pokoj.getNr_r();
		this.start = start;
		this.end = end; 
		dni=this.pobyt(start, end); 
		naleznosc=zaplata( dni, cena_p);  
		this.R_nr= R_nr;
		
		
		
		
	}
	
	public int getR_nr() {
		return R_nr;
	}

	public void setR_nr(int r_nr) {
		R_nr = r_nr;
	}

	public Guest getGosc() {
		return gosc;
	}

	public void setGosc(Guest gosc) {
		this.gosc = gosc;
	}

	public Room getPokoj() {
		return pokoj;
	}

	public void setPokoj(Room pokoj) {
		this.pokoj = pokoj;
	}

	public DateTime getStart() {
		return start;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public DateTime getEnd() {
		return end;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCena_p() {
		return cena_p;
	}

	public void setCena_p(int cena_p) {
		this.cena_p = cena_p;
	}

	public int getNaleznosc() {
		return naleznosc;
	}

	public void setNaleznosc(int naleznosc) {
		this.naleznosc = naleznosc;
	} 
	
	
	
	
	public String StartToString() {
		return "Rezervation [start=" + start + "]";
	} 
	
	public String EndToString() {
		return "Rezervation [end=" + end + "]";
	} 
	
	
	public long getNr_k() {
		return gosc.nr_k;
	}


	int R_nr;
	public Guest gosc;
	Room pokoj; 
	DateTime start;
	DateTime end;  
	int dni; 
	int cena_p; 
	int naleznosc;
	
	
	
	public int pobyt(DateTime start, DateTime end){
		return Days.daysBetween(start, end).getDays();
	}  
	
	public int zaplata (int dni, int cena_p){
		return dni*cena_p;
	} 
	
	public boolean wolny(){  
		
		if (this.pokoj.getZajetosc()==Zajetosc.wolny)
		return true; 
		else 
			return false;  
	}
		
		public boolean zajety(){  
			
			if (this.pokoj.getZajetosc()==Zajetosc.zajety)
			return true; 
			else 
				return false;
	}

		public long getId() {
			// TODO Auto-generated method stub
			return 0;
		} 
		
		
		
	
	
	
	
	
	
	

}
