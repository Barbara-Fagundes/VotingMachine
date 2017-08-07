package br.com.barbara.urnaeletronica.controller;
import java.util.HashMap;

import br.com.ricardo.urnaeletronica.model.Candidato;

public class Candidatos {
	
	private static HashMap<String, Candidato> candidatos;
	
	public static HashMap<String, Candidato> getCandidatos() {
		return candidatos;
	}
	 
	
	public Candidatos() {
		
		candidatos = new HashMap<String, Candidato>();
		
		Candidato c1 = new Candidato("45","Aécio Neves", "Aécio NEVER");
		Candidato c2 = new Candidato("13","Dilma Roussef", "Dilma Bolada");
		Candidato c3 = new Candidato("20","Pastor Everaldo", "Pastor de ovelha");
		Candidato c4 = new Candidato("40","Marina Silva", "Marina Má");
		Candidato c5 = new Candidato("43","Eduardo Jorge", "Dudu");
		Candidato c6 = new Candidato("50","Luciana Genro", "Luciana do pó");
		
		candidatos.put(c1.getNumero(), c1);
		candidatos.put(c2.getNumero(), c2);
		candidatos.put(c3.getNumero(), c3);
		candidatos.put(c4.getNumero(), c4);
		candidatos.put(c5.getNumero(), c5);
		candidatos.put(c6.getNumero(), c6);
		
		
	}
			

}
