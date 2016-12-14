package maper; 


import java.sql.ResultSet;
import java.sql.SQLException;

import Reposes.IReposytory;
import rezervations.Rezervation;
import rezervations.Guest; 
import org.joda.time.*;


public class Rezervation_Mapper implements IMapResultSetIntoEntity<Rezervation> {
IReposytory<Guest> GuestRepo;
	
	
	
	public IReposytory<Guest> getGuestRepo() {
		return GuestRepo;
	}



	public void setGuestRepo(IReposytory<Guest> GuestRepo) {
		this.GuestRepo = GuestRepo;
	}



	public Rezervation map(ResultSet rs) throws SQLException {
		Rezervation Rezervation = new Rezervation(null, null, null, null, 0);// tu trzeba jeszcze coœ po wpisywaæ
		Rezervation.setR_nr(rs.getInt("id"));
		Rezervation.gosc.setG_id(rs.getInt("Guestid"));
		Rezervation.setStart(rs.getTime("start"));
		Rezervation.setCurrency(rs.getString("currency"));
		if(GuestRepo!=null)
		Rezervation.setGuest(this.GuestRepo.get(Rezervation.getGuestId()));
		
		return Rezervation;
	}
}
