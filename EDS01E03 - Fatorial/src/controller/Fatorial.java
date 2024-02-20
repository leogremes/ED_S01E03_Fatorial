package controller;

public class Fatorial
{
	public Fatorial() {
		super();
	}
	
	public int encontrarFatorial(int n)
	{
		/*
		CONDIÇÃO DE PARADA
		fatorial de 1 ou 0 é igual a 1
		  
		CHAMADA DE PASSOS
		o valor atual multiplicado pela saída da função de um número abaixo.
		 */
		
		if (n <= 1) return 1;
		return n * encontrarFatorial(--n);	
	}
}
