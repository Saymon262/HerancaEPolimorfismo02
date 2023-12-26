package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaJuridica;
import entities.PessoasFisica;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers");
		int payers = scan.nextInt();
		
		for (int i = 1; i <= payers; i++) {
			System.out.println("Tax payer #" + i +" data: ");
			System.out.println("Individual or company ( i / c ) ? ");
			char choice = scan.next().charAt(0);
			
			System.out.println("Name: ");
			String name = scan.next();
			
			System.out.println("Anual income: ");
			Double income = scan.nextDouble();
			
			if (choice == 'i') {
				System.out.println("Healt expenditures: ");
				Double gastos = scan.nextDouble();
				list.add(new PessoasFisica(name, income, gastos));
				
			} else {
				System.out.println("Number of emplyees: ");
				Integer employees = scan.nextInt();
				list.add(new PessoaJuridica(name, income, employees));
			}
		}
		
		Double totalTaxes = 0.0;
		System.out.println("TAXES PAID ");
		for (Pessoa Pessoa : list) {
			System.out.println(Pessoa.total());
			totalTaxes += Pessoa.getIncome();
		}
		System.out.println("TOTAL TAXES: R$ " + totalTaxes);

		scan.close();
	}

}
