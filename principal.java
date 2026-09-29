package Principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numerojugadores = 0;
		int jugador = 0;
		int partidas=1;
		int veces=0;
		int repetirveces=0;
		int enemigosderrotados;
		int puntosconseguidos = 0;
		int partidasjugadas;
		int puntostotaljugadores1 = 0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuantos jugadores se van a registrar?");
		numerojugadores=Integer.parseInt(teclado.nextLine());
		while (numerojugadores>veces) {
			veces=veces+1;
			jugador++;
			System.out.println("Eres el jugador "+jugador);
		System.out.println("¿Cuantas partidas a jugado?");
		partidasjugadas=Integer.parseInt(teclado.nextLine());
		repetirveces=0;
		partidas=1;
		puntostotaljugadores1=0;
		while(partidasjugadas>repetirveces) {
			System.out.println("¿Cuantas puntos ha conseguido en la partida? "+partidas);
			puntosconseguidos=Integer.parseInt(teclado.nextLine());
			System.out.println("¿Cuantos enemigos ha derrotado en la partida? "+partidas);
			enemigosderrotados=Integer.parseInt(teclado.nextLine());
			puntostotaljugadores1=puntosconseguidos+puntosconseguidos;		
			partidas++;
			repetirveces++;			}
	
	
		}System.out.println("La puntuacion del jugador "+jugador +"es de "+puntostotaljugadores1);
		
	
		
		
	}
	}


