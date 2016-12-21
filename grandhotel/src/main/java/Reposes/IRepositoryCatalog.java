package Reposes;



public interface IRepositoryCatalog {

	public IR_guest people();
	public IR_Rez accounts();
	//public IEnumRepository dictionaries();
	//public IHistoryRepository history();
	
	public void saveAndClose();
	
}