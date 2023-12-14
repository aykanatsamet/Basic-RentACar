package com.rent;



public class SportCar extends Car{
	private int TopSpeed;
	
	private static boolean b1=true,b2=false,b3=false;
	

	public SportCar(Customer c1) {
		super(c1);
		
	
	}
	
	public void SetCar(int sel) {
		
		switch(sel) {
		case 1: 
			 InıtsetCar("BMW","520",2023,284);
			break;
		case 2:
			 InıtsetCar("AUDİ","A6",2022,273);
			 break;
		case 3:
			 InıtsetCar("MERCEDES","S400",2021,266);
			 break;
			
			
		}

		
	}
	public void InıtsetCar(String brand,String model,int year,int TopSpeed) {
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.TopSpeed=TopSpeed;

	}
	
	public void rent() {
		Slist();
		int select=scan.nextInt();
		while(select<1 || select>3) {
			System.out.print("Lütfen geçerli bir değer giriniz");
			select=scan.nextInt();
		}
		
		SetCar(select);
		System.out.println();
		if(aracBosMu()) {
			System.out.println("Araç Kiralandı.");
		aracBilgileriniGoster();
		CustomerInfo();
		
		}
		else if(!aracBosMu()) {
			System.out.println("Araç boşta değil");
			System.out.println("Başka araç kiralamak ister misiniz?");
			System.out.println();
			rent();
		}
	   
	
		}
	
	public boolean aracBosMu() {
		
		if(this.brand.equals("BMW")) {
			boolean b1=Rented();
			return b1;
		}
		if(this.brand.equals("AUDİ")) {
			boolean b2=Rented();
			return b2;
		}
		if(this.brand.equals("MERCEDES")) {
			boolean b3=Rented();
			return b3;
		}
		return true;
	}
	
	public boolean Rented() {
	
			
			if(this.brand.equals("BMW")) {
				if(!b1) {
				b1=true;
				return b1;
				}
				else {
					return false;
				}
				
			}
			if(this.brand.equals("AUDİ")) {
				if(!b2) {
					b2=true;
					return b2;
					}
					else {
						return false;
					}
			
			}
			if(this.brand.equals("MERCEDES")) {
				if(!b3) {
					b3=true;
					return b3;
					}
					else {
						return false;
					}
			}
			
			return true;	
	}
	
	public void AracTeslim() {
		System.out.println("Teslim etmek istediğiniz aracı seçiniz");
		Slist();
		int select=scan.nextInt();
	if(select==1) {
		b1=false;
		System.out.println("Araç teslim edildi.");
		}
		if(select==2) {
		b2=false;
		System.out.println("Araç teslim edildi.");
	
		}
		if(select==3) {
		b3=false;
		System.out.println("Araç teslim edildi.");
	
	    }
		
	}
	
	
	public void CustomerInfo() {
		System.out.println("Kiralayan: "+ c1.getName()+" Ehliyet sınıfı: "+ c1.getEhliyet());
		
	}


	

	
public void aracBilgileriniGoster() {
		
		System.out.println("Marka: "+ this.brand+" Model: "+this.model+" Üretildiği yıl: "+this.year+" Maximum hız: "+this.TopSpeed);
	}


	public void Slist() {
		System.out.println("1. BMW\n2.AUDİ\n3.MERCEDES");
	}
	
	public int getTopSpeed() {
		return TopSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		TopSpeed = topSpeed;
	}
	

	
	

}
