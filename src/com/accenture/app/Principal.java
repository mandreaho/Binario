package com.accenture.app;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int resultadoParcial = 0;
		String resultadoString = "";
		int divisor = 2;
		int resultado = 0;

		System.out.println("Número en base decimal a convertir: ");

		int numeroIngr = scanner.nextInt();
		resultadoParcial = numeroIngr;

		while (resultadoParcial > 0) {

			resultado = resultadoParcial % divisor;
			resultadoString = resultado + resultadoString;
			resultadoParcial = resultadoParcial / divisor;
		}

		System.out.println("Representación binaria: " + resultadoString);
	}
}

