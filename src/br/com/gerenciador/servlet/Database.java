package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {

	public static List<Company> lista = new ArrayList<>();
	private static Integer chavePrimaria = 1;
	
	public void create(Company company) {
		company.setId(Database.chavePrimaria ++);
		lista.add(company);
	}
	
	public List<Company> getCompanies() {
		return lista;
	}
	
	public void deleteCompany(Integer id) {
		
		Iterator<Company> it = lista.iterator();
		
		while(it.hasNext()) {
			Company company = it.next();
			
			if(company.getId() == id) {
				it.remove();
			}
		}
		
	}
	
	public Company searchCompany(Integer id) {
		for(Company company: lista) {
			if(company.getId() == id) {
				return company;
			}
		}
		return null;
		
	}
	
}
