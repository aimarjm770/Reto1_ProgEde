package Principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int clientes;
		int menu;
		int veces=0;
		int entradasadulto = 0;
		int entradasniños = 0;
		int entradastotaladulto = 0;
		int entradastotalniños=0;
		int numeroveces2=0;
		int numeroveces1=0;
		int precioadulto=0;
		int precioniños = 0;
		int preciosindescuento=0;
		double descuentoadulto = 0;
		double descuentoniños = 0;
		double descuentototal = 0;
		double recaudado = 0;
		int mayorcompra=0;
		int clientemayorcompra=0;

		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuantos clientes se van a registrar?");
		clientes=Integer.parseInt(teclado.nextLine());

		while(clientes>veces) {
			System.out.println("1-.Numero de entradas de adulto "
					+ "2-.Numero de entradas infantiles"
					+ "3-.Numero total de entradas"
					+ "4-.Precio a pagar");
			menu=Integer.parseInt(teclado.nextLine());
			
			veces=veces+1;

			if(menu==1){
				System.out.println("¿Cuantas entradas de adulto quiere?");
				entradasadulto=Integer.parseInt(teclado.nextLine());
				entradastotaladulto=entradastotaladulto+entradasadulto;
				precioadulto=entradasadulto*9;//4,5
			}
			
			if(menu==2){
				System.out.println("¿Cuantas entradas infantiles quiere?");
				entradasniños=Integer.parseInt(teclado.nextLine());	
				entradastotalniños=entradastotalniños+entradasniños;
				precioniños=entradasniños*6;//6
			}
			
			if (entradasadulto>=5) {
				descuentoadulto=precioadulto*10/100;
			}
			
			if (entradasniños>=5) {
				descuentoniños=precioniños*10/100;
			}
			
			descuentototal=descuentoadulto+descuentoniños;
			preciosindescuento=precioadulto+precioniños;
			recaudado=preciosindescuento-descuentototal;
			
			if(entradasadulto+entradasniños>mayorcompra){
				mayorcompra=entradasadulto+entradasniños;
				clientemayorcompra=veces;
			}
			
		}

		System.out.println("El dinero recaudado es de "+recaudado);
		System.out.println("El numero de entradas de adulto es de  "+entradastotaladulto);
		System.out.println("El numero de entradas infantiles es de "+entradastotalniños);
		System.out.println("El cliente que mas compro fue el cliente "+clientemayorcompra
				+" con "+mayorcompra+" entradas.");


		}
	}
