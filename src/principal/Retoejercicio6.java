package principal;

import java.util.Scanner;

public class Retoejercicio6 {

	public static void main(String[] args) {

		int numerojugadores = 0;
		int jugador = 0;
		int partidas = 1;
		int veces = 0;
		int repetirveces = 0;

		int enemigosderrotados;
		int puntosconseguidos = 0;
		int partidasjugadas;

		int puntostotaljugador = 0;
		int enemigostotaljugador = 0;

		int puntuacionTotalTodos = 0;
		int enemigosTotalTodos = 0;

		int mayorPuntuacion = 0;
		int jugadorMayorPuntuacion = 0;

		double puntuacionMedia;

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantos jugadores se van a registrar?");
		numerojugadores = Integer.parseInt(teclado.nextLine());

		while (numerojugadores > veces) {

			veces = veces + 1;
			jugador++;

			System.out.println();
			System.out.println("Eres el jugador " + jugador);

			System.out.println("¿Cuantas partidas ha jugado?");
			partidasjugadas = Integer.parseInt(teclado.nextLine());

			repetirveces = 0;
			partidas = 1;

			puntostotaljugador = 0;
			enemigostotaljugador = 0;

			while (partidasjugadas > repetirveces) {

				System.out.println("¿Cuantos puntos ha conseguido en la partida " + partidas + "?");
				puntosconseguidos = Integer.parseInt(teclado.nextLine());

				System.out.println("¿Cuantos enemigos ha derrotado en la partida " + partidas + "?");
				enemigosderrotados = Integer.parseInt(teclado.nextLine());

				puntostotaljugador = puntostotaljugador + puntosconseguidos;

				// Bonus de 100 puntos si supera los 1000
				if (puntosconseguidos > 1000) {
					puntostotaljugador = puntostotaljugador + 100;
				}

				enemigostotaljugador = enemigostotaljugador + enemigosderrotados;

				partidas++;
				repetirveces++;
			}

			puntuacionMedia = (double) puntostotaljugador / partidasjugadas;

			System.out.println();
			System.out.println("----- RESULTADOS DEL JUGADOR " + jugador + " -----");
			System.out.println("Puntuacion total: " + puntostotaljugador);
			System.out.println("Enemigos derrotados: " + enemigostotaljugador);
			System.out.println("Puntuacion media por partida: " + puntuacionMedia);

			// Acumulamos los datos de todos los jugadores
			puntuacionTotalTodos = puntuacionTotalTodos + puntostotaljugador;
			enemigosTotalTodos = enemigosTotalTodos + enemigostotaljugador;

			// Comprobamos quién tiene la mayor puntuación
			if (puntostotaljugador > mayorPuntuacion) {
				mayorPuntuacion = puntostotaljugador;
				jugadorMayorPuntuacion = jugador;
			}
		}

		System.out.println();
		System.out.println("========== RESULTADO FINAL ==========");
		System.out.println("El jugador con mayor puntuacion es el jugador " + jugadorMayorPuntuacion + " con "
				+ mayorPuntuacion + " puntos.");
		System.out.println("Puntuacion total entre todos los jugadores: " + puntuacionTotalTodos);
		System.out.println("Numero total de enemigos derrotados: " + enemigosTotalTodos);

		teclado.close();
	}
}