package com.cip.prog;

import java.util.Scanner;
public class Suma_Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		int n3;
		int n4;
		int suma;
		double promedio;

		Scanner sc =new Scanner (System.in);
		System.out.println("Dime el primero número: ");
		n1 =sc.nextInt();
		System.out.println("Dime el segundo número: ");
		n2 =sc.nextInt();
		System.out.println("Dime el tercero número: ");
		n3 =sc.nextInt();
		System.out.println("Dime el cuarto número: ");
		n4 =sc.nextInt();

		suma = n1+n2+n3+n4;
		promedio = suma/4;

		System.out.println("La suma de los cuatro numeros es : " + suma);
		System.out.println("El promedio es : " + promedio);
		sc.close();

	}

}
