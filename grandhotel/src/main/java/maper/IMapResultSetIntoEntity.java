package maper;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.IHaveId;
import repo.IReposytory;

public interface IMapResultSetIntoEntity<TEntity extends IHaveId> {

	public TEntity map(ResultSet rs) throws SQLException;
}