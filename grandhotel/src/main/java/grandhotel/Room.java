package grandhotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room { 
	int nr; 
	int capasity; 
	private double price; 
	List<Date> wolne = new LinkedList<Date>(); 
	//dost�pno�� pokoju albo za pomoc� listy mapy albo setu zale�nie od podej�cia
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	

}
