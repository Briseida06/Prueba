package com.cip.prog;

import java.util.Scanner;
/**
 * Descripcion:Calculo del perimetro!!!
 * @author Briseida
 *
 */

public class Perimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado;
		int perimetroCuadrado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el lado del cuadrado: ");
		lado =sc.nextInt();
		perimetroCuadrado = lado * 4;
		System.out.println("El perimetro es : " + perimetroCuadrado);
		sc.close();
		

	}

}
