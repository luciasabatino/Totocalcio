package it.polito.tdp.toto;

import java.util.ArrayList;
import java.util.List;

public class Pronostico {

	private int N;
	//Il pronostico � una lista di previsioni
	private List<Previsione> colonna;

	public Pronostico(int N) {
		this.N = N;
		colonna = new ArrayList<>();
	}
	
	public int getN() {
		return N;
	}
	public void add(Previsione p) {
		if(colonna.size()<N) {
			colonna.add(p) ;
		} else {
			throw new IllegalStateException("Too many elements in Proonostico") ;
		}
	}
	
	public Previsione get(int i) {
		return this.colonna.get(i);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder() ;
		for(Previsione p: colonna) {
			sb.append(p.toString()) ;
			sb.append("-") ;
		}
		sb.deleteCharAt(sb.length()-1) ;
		return sb.toString() ;
	}

}
