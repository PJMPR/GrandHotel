package repo;



import java.util.List;

//import javax.management.relation.Relation;

import rezervations.Rezervation;
import rezervations.Guest;

public interface IRezervationRepository extends IReposytory<Rezervation>{
	public List<Rezervation> byPerson(Guest guest);
}
