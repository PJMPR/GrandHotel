package maper; 
import java.sql.ResultSet;
import java.sql.SQLException;
import Reposes.IRepository;
import domain.model.IHaveId;

public interface IMapResultSetIntoEntity<TEntity extends IHaveId> { 
	
	
	public TEntity map(ResultSet rs) throws SQLException;

}
