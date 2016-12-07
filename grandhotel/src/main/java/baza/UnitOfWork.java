package baza;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UnitOfWork implements IUnitOfWork{
private List<Entity> entities = new ArrayList<Entity>();
Connection connection;
public UnitOfWork(Connection connection) throws SQLException {
this.connection = connection;
this.connection.setAutoCommit(false);
}
public void commit() throws SQLException {
for(Entity entity: entities){
entity.persist();
}
connection.commit();
entities.clear();
}
public void undo() throws SQLException {
connection.rollback();
entities.clear();
}
public void markAsNew(Entity entity, IUnitOfWorkRepository repository) {
entity.setState(baza.Entity.EntityState.New);
entity.setRepository(repository);
entities.add(entity);
}
public void markAsDeleted(Entity entity, IUnitOfWorkRepository repository) {
entity.setState(baza.Entity.EntityState.Deleted);
entity.setRepository(repository);
entities.add(entity);
}
public void markAsChanged(Entity entity, IUnitOfWorkRepository repository) {
entity.setState(baza.Entity.EntityState.Changed);
entity.setRepository(repository);
entities.add(entity);
}
}
