package view;

import controller.RecursivaSoma;

public class Principal {

	public static void main(String[] args) {
		RecursivaSoma rs = new RecursivaSoma();
		
		int n1 = 2;
		int n2 = 8;
		int soma = 0;
		
		int res = rs.soma(n1, n2, soma);
		System.out.println(res);
	}

}
