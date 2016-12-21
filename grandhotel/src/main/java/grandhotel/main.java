package grandhotel; 


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import Reposes.R_Rez;
import Reposes.R_ED;
import Reposes.IRepositoryCatalog;
import Reposes.R_guest;
//import dao.HistoryLogRepository;
import Reposes.ReposytoryCatalog;
import maper.Rezervation_Mapper;
//import dao.mappers.EnumDirectoryMapper;
//import dao.mappers.HistoryLogMapper;
import maper.IMapResultSetIntoEntity;
import maper.Guest_Maper;
import baza.UnitOfWork;
import rezervations.Guest;
//import domain.model.EnumDictionary;
//import domain.model.HistoryLog;
import rezervations.Guest;


public class main {

	public static void main(String[] args) {
		
		
		String url = "jdbc:hsqldb:hsql://localhost/workdb";
    	try {
			Connection connection = DriverManager.getConnection(url);
			IRepositoryCatalog catalog = new ReposytoryCatalog(new UnitOfWork(connection), connection);
			
			Guest janek = new Guest();
			janek.setName("Jan");
			janek.setSurname("Kowalski");
			
			catalog.people().add(janek);
			
			List<Guest> janki = catalog.people().withName("janek");
			
	        System.out.println( "zapisuje janka" );
			
	        catalog.saveAndClose();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "Koniec" );
        
    }

	}


