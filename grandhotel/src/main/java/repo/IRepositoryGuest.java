package repo;
import java.util.List;
import rezervations.Guest;

public interface IRepositoryGuest extends IReposytory<Guest>{
	public List<Guest> withName(String name);
}
