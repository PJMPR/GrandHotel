package Reposes; 


import java.util.List;

import model.EnumDictionary;

public interface IEnumRepository extends IReposytory<EnumDictionary>{

	public List<EnumDictionary> byEnumerationName(String name);
}