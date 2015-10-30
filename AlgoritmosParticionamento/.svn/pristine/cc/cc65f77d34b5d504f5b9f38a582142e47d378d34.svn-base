package com.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.agrupamentos.Algoritms;

public class MainCore {
	//TEMPO DE EXECUÇÃO MÉDIO DAS 3 BASES: 1 MINUTO E 20 SEGUNDOS.
	public static void main(String[] args) {
		FileReader arquivoEntradaImagem;
		File saida;
		FileWriter out;
		try {
			String nomeBase;
			arquivoEntradaImagem = new FileReader("heart.txt");
			saida = new File("resultHeart.txt");
			if (!saida.exists()) {
				saida.createNewFile();
			}
			out = new FileWriter(saida);
			out.write("\t\t\tARQUIVO HEART\n");
			out.flush();
			nomeBase = "Heart";
			Algoritms.start(arquivoEntradaImagem, out, nomeBase);
			
			arquivoEntradaImagem = new FileReader("diabetes.txt");
			saida = new File("resultDiabetes.txt");
			if (!saida.exists()) {
				saida.createNewFile();
			}
			out = new FileWriter(saida);
			out.write("\t\t\tARQUIVO DIABETES\n");
			nomeBase = "Diabetes";
			Algoritms.start(arquivoEntradaImagem, out, nomeBase);
			
			arquivoEntradaImagem = new FileReader("segmentedimages.txt");
			saida = new File("resultSegmentedImages.txt");
			if (!saida.exists()) {
				saida.createNewFile();
			}
			out = new FileWriter(saida);
			out.write("\t\t\tARQUIVO SEGMENTED IMAGES\n");
			nomeBase = "Segmented Images";
			Algoritms.start(arquivoEntradaImagem, out, nomeBase);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("arquivo não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("erro de leitura/escrita");
			e.printStackTrace();
		}
		
	}

}
