package Reposes;



import java.util.List;

import rezervations.Rezervation;
import rezervations.Guest;

public interface IR_Rez extends IReposytory<Guest>{
	public List<Rezervation> byPerson(Guest guest);
}
