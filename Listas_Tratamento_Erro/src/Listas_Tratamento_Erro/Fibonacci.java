package Listas_Tratamento_Erro;

import java.util.ArrayList;

public class Fibonacci {

	public static ArrayList<Integer> seqFibo() {
		ArrayList<Integer> listaFibo = new ArrayList<Integer>();
		
		Integer fibo1 = 0;
		Integer fibo2 = 1;

		for (int i = 0; i < 30; i++) {
			listaFibo.add(fibo1);
			fibo1 = fibo1 + fibo2;
			fibo2 = fibo1 - fibo2;
		}

		return listaFibo;
	}

	public ArrayList<Integer> seqFiboPares(ArrayList<Integer> list) {
		ArrayList<Integer> listaFiboPares = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0 && list.get(i) != 0) {
				listaFiboPares.add(list.get(i));
			}
		}
		return listaFiboPares;
	}
}
