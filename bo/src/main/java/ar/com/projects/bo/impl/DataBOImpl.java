package ar.com.projects.bo.impl;

import java.util.List;

import ar.com.projects.bean.Persona;
import ar.com.projects.bo.DataBO;
import ar.com.projects.dao.DataDAO;
import ar.com.projects.dao.impl.DataDAOImpl;

public class DataBOImpl implements DataBO {

	private DataDAO dataDao = null;
	
	public DataBOImpl() {
		super();
		this.dataDao = new DataDAOImpl();
	}
	
	public List<Persona> processData() {
		return this.dataDao.loadData();
	}

}
