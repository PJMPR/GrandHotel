package Reposes;



import java.util.List;

//import javax.management.relation.Relation;

import rezervations.Rezervation;
import rezervations.Guest;

public interface IR_Rez extends IReposytory<Rezervation>{
	public List<Rezervation> byPerson(Guest guest);
}
