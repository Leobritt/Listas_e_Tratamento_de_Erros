package Listas_Tratamento_Erro;

import java.util.ArrayList;
import java.util.Iterator;

public class Pratica10 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = criarLista();
		System.out.println("Fibonacci");
		imp(lista);
		System.out.println("---------------------------------------");
		System.out.println("Fibonacci Pares");
		lista = criarListaPares(lista);
		imp(lista);

		
	}

	public static ArrayList<Integer> criarLista() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer fibo1 = 0;
		Integer fibo2 = 1;

		for (int i = 0; i < 30; i++) {
			list.add(fibo1);
			fibo1 = fibo1 + fibo2;
			fibo2 = fibo1 - fibo2;
		}
		return list;

	}

	public static ArrayList<Integer> criarListaPares(ArrayList<Integer> list) {
		ArrayList<Integer> listPares = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0 && list.get(i) != 0) {
				listPares.add(list.get(i));
			}
		}
		return listPares;
	}
	public static void imp(ArrayList<Integer> listPares) {
		for (int i = 0; i < listPares.size(); i++) {
			System.out.println(listPares.get(i)+" ");
		}
	}

}
