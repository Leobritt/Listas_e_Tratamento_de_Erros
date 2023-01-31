package Listas_Tratamento_Erro;

import java.util.Scanner;

public class Pratica11_TratamentoErro {
	int valor = 0;
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Pratica11_TratamentoErro pExec = new Pratica11_TratamentoErro();
		pExec.valor();
		pExec.imp(pExec.valor);
		
		Integer[][] matriz = pExec.pa(3,4);
		pExec.imp(matriz);
		
		pExec.imp(pExec.vetor(matriz));

	}

	public void valor() {
		try {
			System.out.println("Informe um valor");
			valor = input.nextInt();
		} catch (Exception e) {
			System.out.println("Tipo de dado informado errado");
		}

	}

	public void imp(int valor) {
		System.out.println("Valor informado: " + valor);
	}

	public Integer[][] pa(int l, int c) {
		Integer[][] arBi = new Integer[l][c];
		int termoI = 3, razao = 5;
		for (int i = 0; i < arBi.length; i++) {
			for (int j = 0; j < arBi[i].length; termoI += razao, j++) {
				arBi[i][j] = termoI;
			}
		}
		return arBi;
	}

	public void imp(Integer[][] pa) {
		System.out.println();
		for (int i = 0; i < pa.length; i++) {
			for (int j = 0; j < pa[i].length; j++) {
				if (pa[i][j] < 10) {
					System.out.println(pa[i][j]);
					System.out.println();
				} else {
					System.out.println(pa[i][j]);
					System.out.println();
				}

			}
		}
	}

	public Integer[] vetor(Integer[][] pa) {
		Integer[] vet = new Integer[pa.length * pa[0].length];

		for (int i = 0, iv = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++, iv++) {

			}
		}
		return vet;
	}

	public void imp(Integer[] vet) {
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

}
