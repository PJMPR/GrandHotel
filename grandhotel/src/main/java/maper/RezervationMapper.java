package maper; 


import java.sql.ResultSet;

import java.sql.SQLException;

import rezervations.Rezervation;
import rezervations.Guest; 
import org.joda.time.*;

import grandhotel.Room;
import repo.IReposytory;


public class RezervationMapper implements IMapResultSetIntoEntity<Rezervation> {
	private IReposytory<Guest> guestRepo;
	private IReposytory<Room> roomRepo;
	private IDataMapper dataMapper;
	
	public RezervationMapper(IReposytory<Guest> guestRepo, IReposytory<Room> roomRepo, IDataMapper dataMapper) {
		super();
		this.guestRepo = guestRepo;
		this.roomRepo = roomRepo;
		this.dataMapper = dataMapper;
	}

	public Rezervation map(ResultSet rs) throws SQLException {
		Rezervation reservation = new Rezervation();
		reservation.setId(rs.getLong("id"));
		reservation.setDni(rs.getInt("dni"));
		reservation.setGosc(guestRepo.get(rs.getLong("gosc_id")));
		reservation.setPokoj(roomRepo.get(rs.getLong("room_id")));
		reservation.setNumer(rs.getString("numer"));
		reservation.setNaleznosc(rs.getInt("naleznosc")); 
		reservation.setCena_p(rs.getInt("cena_p"));
		reservation.setStart(dataMapper.map(rs.getDate("start")));
		reservation.setEnd(dataMapper.map(rs.getDate("end")));
		return reservation;
	}
}
