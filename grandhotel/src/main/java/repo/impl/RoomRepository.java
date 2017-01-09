package repo.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import baza.IUnitOfWork;
import grandhotel.Room;
import maper.IMapResultSetIntoEntity;
import repo.IRoomRepository;
import repo.RepositoryBase;
import rezervations.Guest;

public class RoomRepository extends RepositoryBase<Room> implements IRoomRepository {

	protected RoomRepository(Connection connection, IMapResultSetIntoEntity<Room> mapper, IUnitOfWork uow) {
		super(connection, mapper, uow);
	}

	@Override
	protected void setInsert(Room entity) throws SQLException {
		insert.setInt(1, entity.getCena());
		insert.setInt(2, entity.getCapasity());
		
	}

	@Override
	protected void setUpdate(Room entity) throws SQLException {
		update.setInt(1, entity.getCena());
		update.setInt(2, entity.getCapasity());
		
	}

	@Override
	protected String tableName() {
		return "room";
	}

	@Override
	protected String createTableSql() {
		return "CREATE TABLE room("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "cena int," 
				+ "capasity int)";
		
	}

	@Override
	protected String insertSql() {
		return "insert into room ("
				+ "cena, "
				+ "capasity) "
				+ "values (?,?)";
	}

	@Override
	protected String updateSql() {
		// TODO Auto-generated method stub
		return "update room room ("
				+ "cena, "
				+ "capasity) "
				+ "values (?,?)";
	}

}
