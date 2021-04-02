package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Database {

	public static List<Company> lista = new ArrayList<>();		
	
	public void create(Company company) {
		lista.add(company);
	}
	
	public List<Company> getCompanies() {
		return lista;
	}
	
}
