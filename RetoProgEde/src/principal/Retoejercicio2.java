package principal;

import java.util.Scanner;

public class Retoejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String DNI;

		int tipo;

		int continuar;

		int carreras;

		int minutos;

		int segundos;

		int totalParticipantes = 0;

		int menosDe60 = 0;

		int masDe3Carreras = 0;

		int tiempoTotal = 0;

		int mejorTiempo = 0;

		do {

			System.out.println("Introduce tu DNI");

			DNI = teclado.next();

			System.out.println("Cual es el tipo de tu participacion en la carrera?");

			System.out.println("1. Individual");

			System.out.println("2. Pareja");

			tipo = teclado.nextInt();

			while (tipo != 1 && tipo != 2) {

				System.out.println("Opcion no valida. Introduce 1 o 2.");

				tipo = teclado.nextInt();
			}

			System.out.println("En cuantas carreras populares has participado?");

			carreras = teclado.nextInt();

			while (carreras == 0) {

				System.out.println("No es correcto. Debes introducir un numero mayor que 0.");

				carreras = teclado.nextInt();
			}

			if (carreras > 3) {

				masDe3Carreras++;
			}

			System.out.println("Cuantos minutos?");

			minutos = teclado.nextInt();

			System.out.println("Cuantos segundos?");

			segundos = teclado.nextInt();

			int tiempo = minutos * 60 + segundos;

			if (totalParticipantes == 0) {

				mejorTiempo = tiempo;
			}

			if (tiempo < mejorTiempo) {

				mejorTiempo = tiempo;
			}

			tiempoTotal = tiempoTotal + tiempo;

			totalParticipantes++;

			if (tiempo < 3600) {

				System.out.println("Ha terminado en menos de 60 minutos");

				menosDe60++;

			} else {

				System.out.println("No ha terminado en menos de 60 minutos");
			}

			System.out.println("Quieres registrar otro participante?");

			System.out.println("1. Si");

			System.out.println("2. No");

			continuar = teclado.nextInt();

		} while (continuar == 1);

		System.out.println("Total de participantes: " + totalParticipantes);

		System.out.println("Participantes que terminaron en menos de 60 minutos: " + menosDe60);

		System.out.println("Participantes con mas de 3 carreras: " + masDe3Carreras);

		double tiempoMedio = (double) tiempoTotal / totalParticipantes;

		int minutosMedio = (int) tiempoMedio / 60;

		int segundosMedio = (int) tiempoMedio % 60;

		int minutosMejor = mejorTiempo / 60;

		int segundosMejor = mejorTiempo % 60;

		System.out.println("Tiempo medio: " + minutosMedio + " minutos y " + segundosMedio + " segundos");

		System.out.println("Mejor tiempo: " + minutosMejor + " minutos y " + segundosMejor + " segundos");
	}

	}


	
