package com.rent;



import java.util.Scanner;


public class Car {
	protected String brand,model;
	protected int year;
	Customer c1;
	Scanner scan=new Scanner(System.in);
	
	public Car(Customer c1) {
	
		this.c1=c1;
		
	}
	
	
	public void aracBilgileriniGoster() {
		
		System.out.println("Marka: "+ this.brand+" Model: "+this.model+" Üretildiği yıl: "+this.year);
	}

	public void CarList() {
	
		if(c1.getEhliyet().equals("B")) {
			System.out.println(c1.getEhliyet()+" ehliyetiniz ile kiralayabileceğiniz araçlar");
			System.out.println("1.Sport Araçlar\n2.Ticari Araçlar");
			System.out.println("Seçiminiz: ");
		}
		else if(c1.getEhliyet().equals("D")){
			System.out.println(c1.getEhliyet()+" ehliyetiniz ile kiralayabileceğiniz araçlar");
			System.out.println("1.Sport Araçlar\n2.Ticari Araçlar\n3.Kamyonet araçlar");
			System.out.println("Seçiminiz: ");
		}
		else {
			System.out.println("Geçerli bir ehliyet giriniz.");
			String nEhliyet=scan.nextLine();
			c1.setEhliyet(nEhliyet.toUpperCase());
			CarList();
			
		}
		
		
		}
	public void SelCar(int selection) {
		
		
		if(c1.getEhliyet().equals("B")) {
			switch(selection) {
			case 1:
				SportCar car=new SportCar(c1);
				car.rent();
				break;
			case 2:
				TicariCar car2=new TicariCar(c1);
				car2.rent();
		
				break;
			case 3:
			break;
			default:
				System.out.println("Lütfen geçerli bir değer giriniz");
				selection=scan.nextInt();
				SelCar(selection);
			}
				
		}
		else if(c1.getEhliyet().equals("D")){
			switch(selection) {
			case 1:
				SportCar car=new SportCar(c1);
				car.rent();
				break;
			case 2:
				TicariCar car2=new TicariCar(c1);
				car2.rent();
				break;
			case 3:
			 KamyonetCar car3=new KamyonetCar(c1);
			 car3.rent();
			 break;
			default:
				System.out.println("Lütfen geçerli bir değer giriniz");
				selection=scan.nextInt();
				SelCar(selection);
			}
		
		}
		
	}
	public void AracTeslimi() {
		System.out.println("Teslim etmek istediğiniz aracın tipini seçiniz.");
		System.out.println("1.Sport Araçlar\n2.Ticari Araçlar\n3.Kamyonet araçlar");
		System.out.println("Seçiminiz: ");
		int sel=scan.nextInt();
		switch(sel) {
		case 1:
		SportCar car=new SportCar(c1);
		car.AracTeslim();
		break;
		case 2:
		TicariCar car2=new TicariCar(c1);
		car2.AracTeslim();
		break;
		case 3:
		 KamyonetCar car3=new KamyonetCar(c1);
		 car3.AracTeslim();
		break;
			
		}
	}
			
		

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
