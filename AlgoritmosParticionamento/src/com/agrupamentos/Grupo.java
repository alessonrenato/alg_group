package com.agrupamentos;

public class Grupo {
	private Centroid centro;
	private Elemento proximo;
	private Elemento ultimo;
	private int classe;

	public Grupo() {
		this.proximo = null;
	}

	public void inserir(Elemento novo) {
		if (proximo == null) {
			proximo = novo;
			ultimo = novo;
		} else {
			ultimo.setProximo(novo);
			ultimo = novo;
		}
	}

	public void remover(Elemento remover) {
		Elemento aux = proximo;
		Elemento anterior = proximo;

		if (remover.getProximo() == null) {
			proximo = null;

		} else {

			while (aux != remover) {
				anterior = aux;
				aux = aux.getProximo();
			}
		}

		anterior.setProximo(aux.getProximo());

	}

	public Centroid getCentro() {
		return centro;
	}

	public void setCentro(Centroid centro) {
		this.centro = centro;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

}
