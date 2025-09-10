/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class NomeIdadeAltura
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite sua idade em metros: ");
		double altura = scanner.nextDouble();
		
		System.out.println("\n---Dados informados---");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Altura:" + altura + " metros");
		
		
		scanner.close();
		
	}
}