package rezervations;

import java.sql.Date;
import java.util.*;

import grandhotel.Room;


public class Rezervation { 
	Guest gosc; 
	Room pokoj;  
	Date data_przyjazdu;
	Date data_wyjazdu; 
	int dlugosc_pobytu;
	
	public int time_stay(Date data_przyjazdu, Date data_wyjazdu){
		
		int ST = 0;
		return ST;
	} 
	
	public double cost(){
		double p=this.pokoj.getPrice(); 
		int S=this.time_stay(data_przyjazdu, data_wyjazdu);
		double c=p*S; 
		return c;
	}
	

}
