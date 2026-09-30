package principal;

import java.util.Scanner;

public class Ej3reto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diaactual = 0;
		int mesactual = 0;
		int añoactual = 0;

		int identificacion = 0;
		int diarevision = 0;

		int mesrevision = 0;
		int añorevision = 0;
		int respuesta = 0;

		int bicicletarevision = 0;
		int bicicletanorevision = 0;

		boolean salir = false;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el día:");
		diaactual = teclado.nextInt();

		System.out.println("Introduce el mes:");
		mesactual = teclado.nextInt();

		System.out.println("Introduce el año:");
		añoactual = teclado.nextInt();

		while (salir == false) {

			System.out.println("Introduce el número de identificación de la bicicleta:");
			identificacion = teclado.nextInt();

			System.out.println("Introduce el día de la última revisión:");
			diarevision = teclado.nextInt();

			System.out.println("Introduce el mes de la última revisión:");
			mesrevision = teclado.nextInt();

			System.out.println("Introduce el año de la última revisión:");
			añorevision = teclado.nextInt();

			System.out.println(
					"¿Quiere registrar otra bicicleta? Si quiere responde N ponga 1 y si quiere responder S ponga 2");
			respuesta = teclado.nextInt();

			salir = true;
		}

		if (añorevision < añoactual) {
			System.out.println("La revisión es anterior a la fecha actual.");
		} else if (añorevision == añoactual && mesrevision < mesactual) {
			System.out.println("La revisión es anterior a la fecha actual.");
		} else if (añorevision == añoactual && mesrevision == mesactual && diarevision < diaactual) {
			System.out.println("La revisión es anterior a la fecha actual.");
		} else {
			System.out.println("La revisión no es anterior a la fecha actual.");
		}

		if (añorevision < añoactual - 1) {
			System.out.println("Esta bicicleta necesita revisión");
		} else {
			System.out.println("Esta bicicleta NO necesita revisión.");
		}
		if (añorevision < añoactual - 1) {
			bicicletarevision++;
		} else {
			bicicletanorevision++;
		}
		System.out.println("Bicicletas que necesitan revision: " + bicicletarevision);
		System.out.println("Bicicletas que no necesitan revision: " + bicicletanorevision);

		teclado.close();
	}

}
