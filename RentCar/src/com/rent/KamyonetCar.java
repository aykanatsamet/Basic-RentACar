package com.rent;

public class KamyonetCar extends Car {
	
	private int MaxYuk;
	private static boolean b1=true,b2=false,b3=false;

	public KamyonetCar(Customer c1) {
		super(c1);
		
	}
	
public void SetCar(int sel) {
		
		switch(sel) {
		case 1: 
			 InıtsetCar("FORD","TRANSİT",2021,900);
			 break;
		case 2:
			 InıtsetCar("FİAT","DUCATO",2019,950);
			 break;
		case 3:
			 InıtsetCar("HYUNDAİ","H100",2018,750);
			 break;
			
			
		}

		
	}
	public void InıtsetCar(String brand,String model,int year,int MaxYuk) {
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.MaxYuk=MaxYuk;
	
		
	}
	public void rent() {
		Klist();
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
	

	public void Klist() {
		System.out.println("1. FORD\n2.FİAT\n3.HYUNDAİ");
	}
public void aracBilgileriniGoster() {
		
		System.out.println("Marka: "+ this.brand+" Model: "+this.model+" Üretildiği yıl: "+this.year+" Maximum yük: "+this.MaxYuk);
	}
	
	
	public void CustomerInfo() {
		System.out.println("Kiralayan: "+ c1.getName()+" Ehliyet sınıfı: "+ c1.getEhliyet());
		
	}
	
public boolean aracBosMu() {
		
		if(this.brand.equals("FORD")) {
			boolean b1=Rented();
			return b1;
		}
		if(this.brand.equals("FİAT")) {
			boolean b2=Rented();
			return b2;
		}
		if(this.brand.equals("HYUNDAİ")) {
			boolean b3=Rented();
			return b3;
		}
		return true;
	}
	
	public boolean Rented() {
	
			
			if(this.brand.equals("FORD")) {
				if(!b1) {
				b1=true;
				return b1;
				}
				else {
					return false;
				}
				
			}
			if(this.brand.equals("FİAT")) {
				if(!b2) {
					b2=true;
					return b2;
					}
					else {
						return false;
					}
			
			}
			if(this.brand.equals("HYUNDAİ")) {
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
		Klist();
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

	public int getMaxYuk() {
		return MaxYuk;
	}

	public void setMaxYuk(int maxYuk) {
		MaxYuk = maxYuk;
	}
	
	
	
	

}
