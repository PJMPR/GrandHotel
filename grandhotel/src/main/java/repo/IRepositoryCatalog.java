package repo;



public interface IRepositoryCatalog {

	public IRepositoryGuest guest();
	public IRezervationRepository rezervation();
	public IRoomRepository room();
	//public IEnumRepository dictionaries();
	//public IHistoryRepository history();
	
	public void saveAndClose();
	
}