package com.rent;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Customer c1=new Customer("Customer1", "D");
		Car car=new Car(c1);
		Scanner scan=new Scanner(System.in);
		System.out.println("WELCOME TO X RENT A CAR");
		System.out.println("====================================");
		System.out.println();
		car.CarList();
		int selection=scan.nextInt();
		car.SelCar(selection);
		System.out.println(1);
		car.AracTeslimi();
		
		
		
		scan.close();
		


	}

}
