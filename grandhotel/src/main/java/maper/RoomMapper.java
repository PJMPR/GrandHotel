package maper;

import java.sql.ResultSet;
import java.sql.SQLException;

import grandhotel.Room;

public class RoomMapper implements IMapResultSetIntoEntity<Room>{

	public Room map(ResultSet rs) throws SQLException { 
		Room r = new Room(); 
		r.setId(rs.getLong("id"));
		r.setCena(rs.getInt("cena"));
		r.setCapasity(rs.getInt("capasity"));
		return r;
	}

}
