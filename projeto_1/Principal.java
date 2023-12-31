package projeto_1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		objeto conta1 = new objeto("Jane Green", 50.00); //contas
		objeto conta2 = new objeto("John Blue", -7.53);
		
		displayConta(conta1);
		displayConta(conta2);
	
		Scanner input = new  Scanner(System.in);
		
		System.out.printf("%n ");
		System.out.printf("%nDigite a quantidade de deposito para a (conta 1): ");
		double deposito = input.nextDouble();
		System.out.printf("%n Adicionando %.2f para o Saldo da (conta 1)%n",deposito); 
		conta1.deposito(deposito);  //adicionando deposito conta1
		
		displayConta(conta1);
		displayConta(conta2);
		
		System.out.printf("%n ");
		System.out.printf("%nDigite a quantidade de deposito para a (conta 2): ");
		deposito = input.nextDouble();
		System.out.printf("%n Adicionando %.2f para o Saldo da (conta 2)%n",deposito);
		conta2.deposito(deposito); //adicionando deposito conta1
		
		
		System.out.printf("%n%s Saldo: %.2f",
				conta1.getName(), conta1.getSaldo()); // mostrando o saldo conta 1
		System.out.printf("%n%s Saldo: %.2f%n",
				conta2.getName(), conta2.getSaldo()); //conta 2
		
		
		System.out.printf("%nDigite a quantidade de debito para a (conta 1): "); //saque conta 1
		double saque = input.nextDouble();
		System.out.printf("retirando %.2f do Saldo da (conta 1)",saque);
		conta1.saque(saque); //metodo saqueconta1
		
		displayConta(conta1);
		
		System.out.printf("%n ");
		System.out.printf("%nDigite a quantidade de debito para a (conta 2): "); //saque conta 2
		saque = input.nextDouble();
		System.out.printf("retirando %.2f do Saldo da (conta 2)",saque);
		conta2.saque(saque); //metodo saque conta2
		
		displayConta(conta2);
		System.out.printf("%n %n");
		System.out.printf(" ");
		
		displayConta(conta1);
		displayConta(conta2);
		
		input.close();
	}
	
	public static void displayConta(objeto contaToDisplay)
	{
		System.out.printf("%n%s Saldo: %.2f",
				contaToDisplay.getName(), contaToDisplay.getSaldo());   // mostrando o saldo da conta
	}
	
	
	
	
}
