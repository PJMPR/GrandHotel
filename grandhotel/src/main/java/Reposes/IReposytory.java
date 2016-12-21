package Reposes;

import java.util.List;
import model.IHaveId;

public interface IReposytory<TEntity extends IHaveId> {
	public TEntity get(long g_id);
	public List<TEntity> getAll();
	public void add(TEntity entity);
	public void update(TEntity entity);
	public void delete(TEntity entity); 
	public int getMaxId();
}