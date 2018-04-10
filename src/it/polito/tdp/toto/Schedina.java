package it.polito.tdp.toto;

import java.util.ArrayList;
import java.util.List;

public class Schedina {

	private int N;
	//è un elenco di risultati
	private List<Risultato> colonna;

	public Schedina(int N) {
		this.N = N;
		this.colonna = new ArrayList<Risultato>();
	}
	
	public void removeLast() {
		colonna.remove(colonna.size()-1);
	}

	public void add(Risultato valore) {
		if (colonna.size() < N) {
			colonna.add(valore);
		} else {
			throw new IllegalStateException("Too many elements in Schedina") ;
		}
	}

	public Risultato get(int partita) {
		return colonna.get(partita);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Risultato r : colonna) {
			sb.append(r.toString());
			sb.append("-") ;
		}
		sb.deleteCharAt(sb.length()-1) ;
		return sb.toString();
	}
	
	public Schedina(Schedina other) {
		//clone constructor : data una schedina, crea un'altra schedina uguale
		this.N=other.N;
		this.colonna = new ArrayList<>(other.colonna);
	}

}
