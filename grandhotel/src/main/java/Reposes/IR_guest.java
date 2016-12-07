package Reposes;
import java.util.List;
import rezervations.Guest;

public interface IR_guest

	extends IReposytory<Guest>{
	public List<Guest> withName(String name);
}
