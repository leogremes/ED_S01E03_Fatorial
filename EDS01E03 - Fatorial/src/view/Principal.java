package view;

import java.util.Scanner;
import controller.Fatorial;

public class Principal
{

	public static void main(String[] args) 
	{
		int n, fat;
		Scanner s  = new Scanner(System.in);
		Fatorial f = new Fatorial();
		
		System.out.print("Digite um número: ");
		n = s.nextInt();
		fat = f.encontrarFatorial(n);
		System.out.println("O fatorial é: " + fat);
	}
}
