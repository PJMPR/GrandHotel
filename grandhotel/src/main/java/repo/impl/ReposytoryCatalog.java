package repo.impl;



import java.sql.Connection;
import java.sql.SQLException;

import maper.RezervationMapper;
import maper.RoomMapper;
import repo.IRepositoryCatalog;
import repo.IRepositoryGuest;
import repo.IRezervationRepository;
import repo.IRoomRepository;
import maper.DataMaper;
//import maper.EnumDirectoryMapper;
//import dao.mappers.HistoryLogMapper;
import maper.GuestMaper;
import maper.IDataMapper;
import maper.IMapResultSetIntoEntity;
import baza.IUnitOfWork;
import grandhotel.Room;

public class ReposytoryCatalog implements IRepositoryCatalog{

	IUnitOfWork uow;
	Connection connection;
	
	
	public ReposytoryCatalog(IUnitOfWork uow, Connection connection) {
		super();
		this.uow = uow;
		this.connection = connection;
	}

	private IDataMapper dataMapper() {
		return new DataMaper();
	}
	
	public IRepositoryGuest guest() {
		return new RepositoryGuest(connection, new GuestMaper(), uow);
	}

	public IRoomRepository room() {
		return new RoomRepository(connection, new RoomMapper(), uow);
	}

	public IRezervationRepository rezervation() {
		RezervationMapper r = new RezervationMapper(guest(), room(), dataMapper());
		return new RezervationRepository(connection, r, dataMapper(), uow);
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


	public IRezervationRepository accounts() {
		// TODO Auto-generated method stub
		return null;
	}

}