package maper; 


import java.sql.ResultSet;
import java.sql.SQLException;

import rezervations.Guest;

public class Guest_Maper implements IMapResultSetIntoEntity<Guest>{

	public Guest map(ResultSet rs) throws SQLException {
		Guest p = new Guest();
		p.setG_id(rs.getLong("id"));
		p.setName(rs.getString("name"));
		p.setSurname(rs.getString("surname"));
		return p;
	}

}

