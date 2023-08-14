package controller;

public class RecursivaSoma {
	public RecursivaSoma() {
		super();
	}
	//Explica��o: Utiliza a vari�vel n2 como um contador, definindo sua parada para quando n2 for igual a 1, retornando n1 quando atingido ( pois qualquer n�mero vezes 1 � o pr�prio n�mero ).
	public int soma (int n1, int n2, int soma) {
		if (n2 == 1) {
			return n1;
		}else {
			soma = n1 + soma(n1 , n2 - 1, soma);
		}
		return soma;
	}
}
