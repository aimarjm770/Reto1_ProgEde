package Principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Respuesta=0;
		int si;
		int kilometroscoche;
		int kilometrobus;
		int kilometrosbicicleta;
		int horasplancha;
		int horasordenador;
		int horasmovil;
		int numeropersonas;


		double emisionescoche=0;
		double emisionesbus=0;
		double emisionesbici=0;
		double emisionesplancha=0;
		double emisionesordenador=0;
		double emisionesmovil=0;
		double CO2total='0';
		double CO2grupo=0;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuantas personas se van a registrar?");

		numeropersonas=teclado.nextInt();

		boolean finalizar=false;

		while(finalizar==false) {

			System.out.println(

					"1.	Transporte en coche "

							+ "2.	Transporte en autobús "

							+ "3.	Transporte en bicicleta "

							+ "4.	Uso de plancha "

							+ "5.	Uso del ordenador "

							+ "6.	Uso del móvil "

							+ "7.	Finalizar actividades del día");

			Respuesta=teclado.nextInt();
			if(Respuesta==1) {
				System.out.println("Cuantos kilometros recorrio con el coche");//0,21kg por km
				kilometroscoche=teclado.nextInt();
				if(kilometroscoche>0) {
					emisionescoche=kilometroscoche*0.21;
				}else {System.out.println("ERROR");
				System.out.println("Vuelva a intentarlo");
				}}
			if(Respuesta==2) {
				System.out.println("Cuantos kilometros recorrio en autobus");//0,1kg por km
				kilometrobus=teclado.nextInt();
				if(kilometrobus>0) {
					System.out.println("Cuantos kilometros recorrio con el coche");//0,21kg por km
					emisionesbus=kilometrobus*0.1; }
				else {System.out.println("ERROR");
				System.out.println("Vuelva a intentarlo");
				}
			}


			if(Respuesta==3) {
				System.out.println("Cuantos kilometros recorrio en bicicleta");//0 kg CO₂ por km
				kilometrosbicicleta=teclado.nextInt();
				if(kilometrosbicicleta>0)
					emisionesbici=	kilometrosbicicleta*0;
				else {System.out.println("ERROR");
				System.out.println("Vuelva a intentarlo");
				}
			}	


			if(Respuesta==4) {
				System.out.println("Utilizo la plancha indique con un 1 si es que si, si no indique un 0");//0,70 kg CO₂ por hora
				si=teclado.nextInt();
				if (si==1) {
					System.out.println("Cuantas horas se utilizo");
					horasplancha=teclado.nextInt();
					if(horasplancha>0)
						emisionesplancha=horasplancha*0.7;
					else {System.out.println("ERROR");
					System.out.println("Vuelva a intentarlo");



					}}}if(Respuesta==5) {
						System.out.println("Cuantas horas utilizo el ordenador esta semana ");//0,08 kg CO₂ por hora
						horasordenador=teclado.nextInt();
						if(horasordenador>0)
							emisionesmovil=	horasordenador*0.08;
						else {System.out.println("ERROR");
						System.out.println("Vuelva a intentarlo");



						}}if(Respuesta==6) {
							System.out.println("Cuantas horas utilizo el movil esta semana ");//0,08 kg CO₂ por hora
							horasmovil=teclado.nextInt();
							if(horasmovil>0)
								emisionesordenador=	horasmovil*0.7;
							else {System.out.println("ERROR");
							System.out.println("Vuelva a intentarlo");

							}}
						if(Respuesta==7) {
							finalizar=true;
							System.out.println("Su sesión ha finalizado");

						}
				}
		CO2total=emisionesordenador+emisionesmovil+emisionesplancha+emisionesbici+emisionesbus+emisionescoche;
		CO2grupo=CO2total*numeropersonas;
		System.out.println("Su CO₂ producido hoy es "+CO2total+"kg por hora");
		System.out.println("Y su CO₂ producido en grupo hoy es de "+CO2grupo+"kg por hora");
		}
}


