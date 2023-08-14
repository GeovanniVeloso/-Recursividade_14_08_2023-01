package controller;

public class RecursivaSoma {
	public RecursivaSoma() {
		super();
	}
	//Explicação: Utiliza a variável n2 como um contador, definindo sua parada para quando n2 for igual a 1, retornando n1 quando atingido ( pois qualquer número vezes 1 é o próprio número ).
	public int soma (int n1, int n2, int soma) {
		if (n2 == 1) {
			return n1;
		}else {
			soma = n1 + soma(n1 , n2 - 1, soma);
		}
		return soma;
	}
}
