package ar.com.projects.dao;

import java.util.List;

import ar.com.projects.bean.Persona;

public interface DataDAO {
	
	List<Persona> loadData();

}
