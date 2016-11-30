package rezervations;

import java.sql.Date;
import java.util.*;

import org.joda.time.*;

import grandhotel.Room;
import grandhotel.Room.Zajetosc;


public class Rezervation { 
	Guest gosc; 
	public Rezervation(Guest gosc, Room pokoj, DateTime start, DateTime end) {
		super();
		this.pokoj = pokoj;
		this.gosc = gosc; 
		cena_p=this.pokoj.getCena(); 
		this.pokoj.getNr_r();
		this.pokoj = pokoj;
		this.start = start;
		this.end = end; 
		dni=this.pobyt(start, end);
		
		
	} 
	
	Room pokoj; 
	DateTime start;
	DateTime end;  
	int dni; 
	int cena_p;
	
	public int pobyt(DateTime start, DateTime end){
		return Days.daysBetween(start, end).getDays();
	}  
	
	public int zapłata (int dni, int cena_p){
		return dni*cena_p;
	} 
	
	public boolean wolny(){  
		
		if (this.pokoj.getZajetosc()==Zajetosc.wolny)
		return true; 
		else 
			return false;
	}
	
	
	
	
	
	
	
	

}
