package ar.com.projects.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import ar.com.projects.bean.Persona;
import ar.com.projects.bean.Sexo;
import ar.com.projects.dao.DataDAO;

public class DataDAOImpl implements DataDAO {

	@Override
	public List<Persona> loadData() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return Arrays.asList(new Persona("Juan Perez", 25456784, sdf.parse("10/05/1994"), Sexo.MASCULINO),
								 new Persona("Carlos Lopez", 25741852, sdf.parse("10/04/1997"), Sexo.MASCULINO),
								 new Persona("Romina Morales", 30547658, sdf.parse("01/08/2005"), Sexo.FEMENINO));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Arrays.asList(new Persona[] {});
	}

}
