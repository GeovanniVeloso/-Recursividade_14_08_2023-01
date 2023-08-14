package controller;

public class RecursivaSoma {
	public RecursivaSoma() {
		super();
	}
	
	public int soma (int n1, int n2, int soma) {
		if (n2 == 1) {
			return n1;
		}else {
			soma = n1 + soma(n1 , n2 - 1, soma);
		}
		return soma;
	}
}
