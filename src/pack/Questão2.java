package pack;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);

	    System.out.println("Ano:");
	    int ano = teclado.nextInt();
	    System.out.println("Mês:");
	    int mes = teclado.nextInt();
	    System.out.println("Dia:");
	    int dia = teclado.nextInt();
	    
		LocalDate hoje = LocalDate.now();
		LocalDate data = LocalDate.of(ano, mes, dia);
		
		Period periodo = Period.between(hoje, data);
		
		dia = periodo.getDays();
		mes = periodo.getMonths();
		ano = periodo.getYears();
		System.out.println("Faltam " + ano + " ano(s), " + mes + " mes(es) e " + dia + " dia(s).");

	}

}
