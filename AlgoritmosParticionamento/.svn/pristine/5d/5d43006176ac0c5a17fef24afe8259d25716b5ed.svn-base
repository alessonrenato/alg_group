package com.agrupamentos;

import java.util.Arrays;

public class Centroid {
	private double[] cordenada;
	private Elemento proximo;
	private int classe;
	private int[] qtDeElementos;
	public double[] getCordenada() {
		return cordenada;
	}

	public void setCordenada(double[] cordenada) {
		this.cordenada = cordenada;
		
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public int[] getQtDeElementos() {
		return qtDeElementos;
	}

	public void setQtDeElementos(int[] qtDeElementos) {
		this.qtDeElementos = qtDeElementos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cordenada);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centroid other = (Centroid) obj;
		if (!Arrays.equals(cordenada, other.cordenada))
			return false;
		return true;
	}

    
	 
	
	
}
