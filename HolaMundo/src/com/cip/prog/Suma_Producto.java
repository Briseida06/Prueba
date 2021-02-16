package com.cip.prog;

import java.util.Scanner;
/**
 * 
 * @author Briseida
 *
 */
public class Suma_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		int n3;
		int n4;
		int suma;
		int producto;
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Dime el primero número: ");
		n1 =sc.nextInt();
		System.out.println("Dime el segundo número: ");
		n2 =sc.nextInt();
		System.out.println("Dime el tercero número: ");
		n3 =sc.nextInt();
		System.out.println("Dime el cuarto número: ");
		n4 =sc.nextInt();
		
		suma = n1+n2;
		producto = n3*n4;
		
		System.out.println("La suma del primer y segundo numero es : " + suma);
		System.out.println("El producto del tercer y cuarto es : " + producto);
		sc.close();

	}

}
