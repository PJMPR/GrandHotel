package maper; 


import java.sql.ResultSet;
import java.sql.SQLException;

import rezervations.Guest;

public class GuestMaper implements IMapResultSetIntoEntity<Guest>{

	public Guest map(ResultSet rs) throws SQLException {
		Guest p = new Guest();
		p.setId(rs.getLong("id"));
		p.setName(rs.getString("name"));
		p.setSurname(rs.getString("surname"));
		p.setEmail(rs.getString("email"));
		p.setPhone(rs.getString("phone")); 
		p.setAdres(rs.getString("card"));
		return p;
	}

}

