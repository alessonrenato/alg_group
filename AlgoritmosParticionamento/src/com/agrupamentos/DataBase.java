package com.agrupamentos;

public class DataBase {
	private Elemento proximo;
	private Elemento ultimo;

	public DataBase() {
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

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

}
