package rezervations;

import org.joda.time.*;

import grandhotel.Room;
import model.IHaveId;


public class Rezervation implements IHaveId { 

	private long id;	
	private Guest gosc;
	private Room pokoj; 
	private DateTime start;
	private DateTime end;  
	private int dni; 
	private int cena_p;
	private int naleznosc;  
	private String numer; 
	//long l=gosc.getId();
	//long k=pokoj.getId(); 
	
	//dni=pobyt(start,end); 
	
	public long getId() {
		return id;
	}

	public Rezervation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(long id) {
		this.id = id;
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

	public String getNumer() {
		return numer;
	}

	public void setNumer(String numer) {
		this.numer = numer;
	}	
	
	public int pobyt(DateTime start, DateTime end){
		return Days.daysBetween(start, end).getDays();
	}   
	
	public int zaplata (int dni, int cena_p){
		return dni*cena_p;
	} 
	
	
	
	

	public Long setGosc(long l) {
		// TODO Auto-generated method stub
		return gosc.getId();
	}

	public Long setPokoj(long k) {
		// TODO Auto-generated method stub 
		return pokoj.getId();
		
	}
	
}
