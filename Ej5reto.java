package Prncipal;

import java.util.Scanner;

public class Ej5reto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int usuarios = 0;

	        int usuario = 1;

	        int dias = 0;

	        int dia = 1;

	        int minutos = 0;



	        int totalMinutosUsuario = 0;

	        int totalMinutosTodos = 0;

	        int diasMas60 = 0;

	        int totalDiasTodos = 0;



	        int mayorMinutos = 0;

	        int usuarioMayor = 0;



	        double media = 0;



	        Scanner teclado = new Scanner(System.in);



	        // Número de usuarios

	        System.out.print("¿Cuántos usuarios se van a registrar? ");

	        usuarios = teclado.nextInt();



	        // Registrar usuarios

	        while (usuario <= usuarios) {



	            System.out.println();

	            System.out.println("Usuario " + usuario);



	            totalMinutosUsuario = 0;

	            diasMas60 = 0;

	            dia = 1;



	            // Número de días que ha acudido

	            System.out.print("¿Cuántos días ha acudido al gimnasio? ");

	            dias = teclado.nextInt();



	            // Registrar los minutos de cada día

	            while (dia <= dias) {



	                System.out.print("Minutos de ejercicio del día " + dia + ": ");

	                minutos = teclado.nextInt();



	                totalMinutosUsuario = totalMinutosUsuario + minutos;



	                if (minutos > 60) {

	                    diasMas60 = diasMas60 + 1;

	                }



	                dia = dia + 1;

	            }



	            // Calcular la media

	            media = (double) totalMinutosUsuario / dias;



	            System.out.println();

	            System.out.println("Total de minutos: " + totalMinutosUsuario);

	            System.out.println("Media de minutos por día: " + media);

	            System.out.println("Días con más de 60 minutos: " + diasMas60);



	            // Comprobar objetivo semanal

	            if (totalMinutosUsuario > 300) {

	                System.out.println("Ha alcanzado el objetivo semanal.");

	            } else {

	                System.out.println("No ha alcanzado el objetivo semanal.");

	            }



	            // Sumar datos de todos los usuarios

	            totalMinutosTodos = totalMinutosTodos + totalMinutosUsuario;

	            totalDiasTodos = totalDiasTodos + dias;



	            // Comprobar qué usuario ha realizado más minutos

	            if (totalMinutosUsuario > mayorMinutos) {

	                mayorMinutos = totalMinutosUsuario;

	                usuarioMayor = usuario;

	            }



	            usuario = usuario + 1;

	        }



	        // Resultado final

	        System.out.println();

	        System.out.println("========== RESULTADO FINAL ==========");

	        System.out.println("Usuario que realizó más minutos: Usuario " + usuarioMayor);

	        System.out.println("Minutos realizados por ese usuario: " + mayorMinutos);

	        System.out.println("Total de minutos entre todos los usuarios: " + totalMinutosTodos);

	        System.out.println("Total de días de entrenamiento: " + totalDiasTodos);



	        teclado.close();
	}

}
