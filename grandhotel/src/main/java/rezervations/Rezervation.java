package rezervations;
import java.util.*;

import org.joda.time.*;

import grandhotel.Room;

public class Rezervation {  
	long nr_r;
	Room pokoj;  
	Guest gosc; 
	DateTime start; 
	DateTime end;  
	
	int get_cena(){
		return pokoj.getCena();
		
	} 
	
	long get_room_nr(){
		return pokoj.getNr_r();
	} 
	
	int dlugosc_pobytu(DateTime start, DateTime end){
		
		
		int days = Days.daysBetween(start, end).getDays();
		
		return days;
	} 
	
	boolean czy_wolny(){
		return true;
	} 
	
	int oplata (){
		return 0;
	}
	
	
	
	
	

}
