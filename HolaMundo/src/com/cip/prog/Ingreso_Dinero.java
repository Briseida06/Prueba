package com.cip.prog;

import java.util.Scanner;
/**
 * 
 * @author Briseida
 *
 */
public class Ingreso_Dinero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad;
		double precio;
		double importe;

		Scanner sc =new Scanner (System.in);
		System.out.println("Ingrese la cantidad de artículos: ");
		cantidad =sc.nextInt();
		System.out.println("Ingrese el precio del artículo: ");
		precio =sc.nextInt();

		importe = precio*cantidad;

		System.out.println("El importe total a pagar es: " + importe );
		sc.close();
			
	}

}