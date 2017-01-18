package grandhotel; 


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.joda.time.DateTime;

import maper.RezervationMapper;
import repo.IRepositoryCatalog;
import repo.IRoomRepository;
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
		// nic 2
		
		String url = "jdbc:hsqldb:hsql://localhost/workdb";
    	try {
			Connection connection = DriverManager.getConnection(url);
			IRepositoryCatalog catalog = new ReposytoryCatalog(new UnitOfWork(connection), connection);
			
			
			Guest janek = new Guest();
			janek.setName("lemmy");
			janek.setSurname("kilmister");
			janek.setId(1);
			List<Guest> janki = catalog.guest().withName("janek");
			
			catalog.guest().add(janek);
			 System.out.println( janki.size() );
			 janki.add(janek);
			 System.out.println( janki.size() );
				
			Room pokoj = new Room(); 
			pokoj.setId(3);
			pokoj.setCena(2500);
			pokoj.setCapasity(5);
			
			catalog.room().add(pokoj); 
			 System.out.println( "zapisuje pokój" );
			
			
			DateTime start = new DateTime(2017, 4, 9, 0, 0, 0);
			DateTime end = new DateTime(2017, 11, 1, 0, 0, 0, 0);
			
			
			
			
			catalog.rezervation().add(newRezervation(janki.get(0),pokoj, start,end)); 
			
			 System.out.println( "zapisuje rezerwacjê" );
			
			
			
			
			
			
	        System.out.println( "zapisuje janka" );
			
	        catalog.saveAndClose();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	try {
			Connection connection = DriverManager.getConnection(url);
			IRepositoryCatalog catalog = new ReposytoryCatalog(new UnitOfWork(connection), connection);
			for(Rezervation rezervation : catalog.rezervation().getAll()) {
				System.out.println(rezervation.getId());
			}
			
	        catalog.saveAndClose();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "Koniec" );
        
    }
	
	private static Rezervation newRezervation(Guest guest, Room room,DateTime start,DateTime end) {
		int k; 
		int l;
		int u; 
		start=start.minusYears(1900);
		end=end.minusYears(1900);
		Rezervation rezervation = new Rezervation();
		rezervation.setGosc(guest);
		rezervation.setPokoj(room); 
		rezervation.setStart(start);
		rezervation.setEnd(end); 
		rezervation.pobyt(start,end); 
		k=rezervation.pobyt(start, end); 
		rezervation.setDni(k); 
		l=room.getCena(); 
		rezervation.setCena_p(l); 
		u=rezervation.zaplata(k,l); 
		rezervation.setNaleznosc(u); 
		rezervation.setNumer("rezer_1");
		
		
		
		return rezervation;
		
	}

	} 

/* 
 * runHSQLDBServer.sh
 * 
 * #!/bin/bash
java -cp /opt/devel/hsqldb-2.3.0/hsqldb/lib/hsqldb.jar org.hsqldb.server.Server --database.0 mem:mydb --dbname.0 workdb
 */ 



/*
 * runHSQLDBClient.sh
 * 
 * #! /bin/bash
java -cp /opt/devel/hsqldb-2.3.0/hsqldb/lib/hsqldb.jar org.hsqldb.util.DatabaseManagerSwing --url jdbc:hsqldb:hsql://localhost/workdb
 * 
 */