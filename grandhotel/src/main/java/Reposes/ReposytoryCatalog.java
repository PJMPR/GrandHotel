package Reposes;



import java.sql.Connection;
import java.sql.SQLException;

import maper.Rezervation_Mapper;
//import maper.EnumDirectoryMapper;
//import dao.mappers.HistoryLogMapper;
import maper.Guest_Maper;
import baza.IUnitOfWork;

public class ReposytoryCatalog implements IRepositoryCatalog{

	IUnitOfWork uow;
	Connection connection;
	
	
	public ReposytoryCatalog(IUnitOfWork uow, Connection connection) {
		super();
		this.uow = uow;
		this.connection = connection;
	}

	
	public IR_guest people() {
		return new R_guest(connection, new Guest_Maper(), uow);
	}

	public IR_Rez Rezervations() {
		return new R_Rez(connection, new Rezervation_Mapper(), people(), uow);
	}

	/*public IEnumRepository dictionaries() {
		return new EnumDictionaryRepository(connection, new EnumDirectoryMapper(), uow);
	}

	public IHistoryRepository history() {
		return new HistoryLogRepository(connection, new HistoryLogMapper(), uow);
	}*/

	public void saveAndClose() {
		try{
		uow.commit();
		connection.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}


	public IR_Rez accounts() {
		// TODO Auto-generated method stub
		return null;
	}

}