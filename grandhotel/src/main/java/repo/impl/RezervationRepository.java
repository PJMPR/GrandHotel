package repo.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import maper.GuestMaper;
import maper.IDataMapper;
import baza.IUnitOfWork;
import grandhotel.Room;
import rezervations.Rezervation;
import rezervations.Guest; 
import maper.RezervationMapper;
import repo.IReposytory;
import repo.IRezervationRepository;
import repo.RepositoryBase;

public class RezervationRepository extends RepositoryBase<Rezervation>
	implements IRezervationRepository{
	
	private final IDataMapper dataMapper; 
	
	public RezervationRepository(Connection connection, 
			RezervationMapper mapper, IDataMapper dataMapper, IUnitOfWork uow) {
		super(connection, mapper,uow);
		this.dataMapper = dataMapper;
	}
	
	@Override
	protected String tableName() {
		return "Rezervation";
	}
	@Override
	protected String createTableSql() {
		// TODO Auto-generated method stub
		return "CREATE TABLE Rezervation("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
				+ "gosc_id int,"
				+ "room_id int,"
				+ "start date,"
				+ "end date,"
				+ "dni int,"
				+ "cena_p int ,"
				+ "naleznosc int,"
				+ "numer varchar(24)" 
				+ ")";
	}
	@Override
	protected String insertSql() {
		// TODO Auto-generated method stub
		return "INSERT INTO rezervation("
				+ "gosc_id, "
				+ "room_id, "
				+ "start,"
				+ "end,"
				+ "dni,"
				+ "cena_p,"
				+ "naleznosc,"
				+ "numer"
				+ ") VALUES (?, ?, ?,?,?,?,?,?)";
	}
	@Override
	protected String deleteSql() {
		// TODO Auto-generated method stub
		return "DELETE FROM Rezervation WHERE id = ?";
	}
	@Override
	protected String updateSql() {
		// TODO Auto-generated method stub
		return "UPDATE Rezervation SET gosc_id = ?, room_id = ?, start = ?,end = ?,dni = ?,cena_p = ?,naleznosc = ?,numer = ? WHERE id = ?";
	}
	@Override
	protected String selectByIdSql() {
		// TODO Auto-generated method stub
		return "SELECT * FROM Rezervation WHERE id=?";
	}
	@Override
	protected String selectAllSql() {
		// TODO Auto-generated method stub
		return "SELECT * FROM Rezervation";
	}
	
	@Override
	protected void setInsert(Rezervation entity) throws SQLException {
		insert.setLong(1, entity.getGosc().getId());
		insert.setLong(2, entity.getPokoj().getId());
		insert.setDate(3, dataMapper.map(entity.getStart()));
		insert.setDate(4, dataMapper.map(entity.getEnd())); 
		insert.setInt(5, entity.getDni());
		insert.setInt(6, entity.getCena_p());
		insert.setInt(7, entity.getNaleznosc());
		insert.setString(8, entity.getNumer());
		
	}

	@Override
	protected void setUpdate(Rezervation entity) throws SQLException {
		insert.setLong(1, entity.getGosc().getId());
		insert.setLong(2, entity.getPokoj().getId());
		insert.setDate(3, dataMapper.map(entity.getStart()));
		insert.setDate(4, dataMapper.map(entity.getEnd())); 
		insert.setInt(5, entity.getDni());
		insert.setInt(6, entity.getCena_p());
		insert.setInt(7, entity.getNaleznosc());
		insert.setString(8, entity.getNumer());
}

	public List<Rezervation> byGuest(Guest Guest) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(Guest entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(Guest entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Guest entity) {
		// TODO Auto-generated method stub
		
	}

	public int getMaxId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*public Rezervation get(long g_id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	public List<Rezervation> byPerson(Guest guest) {
		// TODO Auto-generated method stub
		return null;
	}
}