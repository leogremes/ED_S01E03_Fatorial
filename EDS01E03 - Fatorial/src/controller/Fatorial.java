package controller;

public class Fatorial
{
	public Fatorial() {
		super();
	}
	
	public int encontrarFatorial(int n)
	{
		/*
		CONDI��O DE PARADA
		fatorial de 1 ou 0 � igual a 1
		  
		CHAMADA DE PASSOS
		o valor atual multiplicado pela sa�da da fun��o de um n�mero abaixo.
		 */
		
		if (n <= 1) return 1;
		return n * encontrarFatorial(--n);	
	}
}
