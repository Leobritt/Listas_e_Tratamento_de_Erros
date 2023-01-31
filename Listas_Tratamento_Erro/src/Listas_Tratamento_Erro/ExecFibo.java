package Listas_Tratamento_Erro;

import java.util.ArrayList;

public class ExecFibo {
	public static void main(String[] args) {
		Fibonacci listaPares = new Fibonacci();
		listaPares.seqFibo();
		ImpressaoFibo imprimir = new ImpressaoFibo();
		imprimir.imp(listaPares.seqFibo());
		System.out.println("-----------------------------");
		//listaPares.seqFiboPares(listaPares.seqFibo());
	}


}
