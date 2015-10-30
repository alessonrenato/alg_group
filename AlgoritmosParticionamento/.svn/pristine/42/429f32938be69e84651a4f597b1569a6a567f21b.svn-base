package com.agrupamentos;

public class Scanner {
	private String[] numLinha;
	public static int numeroClasses;
	public static int a=0;
	public static int b=0;
	

	public Scanner(String linha) {
		this.numLinha = linha.split("  ");	
				
	}

	public int retornarClasse() {
		int resultado = (int) Double.parseDouble(numLinha[0]);
		if(resultado == 1){
			a++;
		}else if(resultado == 2){
			b++;
		}
		
		if (resultado > numeroClasses) {
			numeroClasses = resultado;
		}

		return resultado;
	}

	public double[] retornarLinha() {
		double[] resultado = new double[numLinha.length - 1];

		for (int i = 1; i < numLinha.length; i++) {
			resultado[i - 1] = Double.parseDouble(numLinha[i]);

		}

		return resultado;
	}

	public int getNumeroClasses() {
		return numeroClasses;
	}
	
	

}
