package grandhotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room { 
	int nr; 
	int capasity; 
	private double price; 
	List<Date> wolne = new LinkedList<Date>(); 
	//dostêpnoœæ pokoju albo za pomoc¹ listy mapy albo setu zale¿nie od podejœcia
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	

}
