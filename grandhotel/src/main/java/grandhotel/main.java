package grandhotel; 


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import maper.RezervationMapper;
import repo.IRepositoryCatalog;
import repo.impl.ReposytoryCatalog;
import repo.impl.RezervationRepository;
//import dao.mappers.EnumDirectoryMapper;
//import dao.mappers.HistoryLogMapper;
import maper.IMapResultSetIntoEntity;
import maper.GuestMaper;
import baza.UnitOfWork;
import rezervations.Guest;
import rezervations.Rezervation;
//import domain.model.EnumDictionary;
//import domain.model.HistoryLog;
import rezervations.Guest;


public class main {

	public static void main(String[] args) {
		
		
		String url = "jdbc:hsqldb:hsql:localhost/workdb";
    	try {
			Connection connection = DriverManager.getConnection(url);
			IRepositoryCatalog catalog = new ReposytoryCatalog(new UnitOfWork(connection), connection);
			
			
			Guest janek = new Guest();
			janek.setName("Jan");
			janek.setSurname("Kowalski");
			List<Guest> janki = catalog.guest().withName("janek");
			catalog.guest().add(janek);
			
			
			catalog.rezervation().add(newRezervation(janki.get(0), null));
			
	        System.out.println( "zapisuje janka" );
			
	        catalog.saveAndClose();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "Koniec" );
        
    }
	
	private static Rezervation newRezervation(Guest guest, Room room) {
		Rezervation rezervation = new Rezervation();
		rezervation.setGosc(guest);
		rezervation.setPokoj(room);
		return rezervation;
		
	}

	}


