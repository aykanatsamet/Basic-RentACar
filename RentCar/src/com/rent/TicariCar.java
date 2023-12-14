package com.rent;



public class TicariCar extends Car{
	private int kisiSayisi;
	private static boolean b1=true,b2=false,b3=false;

	public TicariCar(Customer c1) {
		super(c1);
		
	}
	public void SetCar(int sel) {
		
		switch(sel) {
		case 1: 
			 InıtsetCar("FİAT","EGEA",2021,5);
			 break;
		case 2:
			 InıtsetCar("CİTRÖEN","BERLİNGO",2020,6);
			 break;
		case 3:
			 InıtsetCar("VOLKSWAGEN","TRANSPORTER",2022,8);
			break;
			
		}

		
	}
	public void InıtsetCar(String brand,String model,int year,int kisiSayisi) {
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.kisiSayisi=kisiSayisi;
	
		
	}
	public void rent() {
		Tlist();
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
		
		if(this.brand.equals("FİAT")) {
			boolean b1=Rented();
			return b1;
		}
		if(this.brand.equals("CİTRÖEN")) {
			boolean b2=Rented();
			return b2;
		}
		if(this.brand.equals("VOLKSWAGEN")) {
			boolean b3=Rented();
			return b3;
		}
		return true;
	}
	
	public boolean Rented() {
	
			
			if(this.brand.equals("FİAT")) {
				if(!b1) {
				b1=true;
				return b1;
				}
				else {
					return false;
				}
				
			}
			if(this.brand.equals("CİTRÖEN")) {
				if(!b2) {
					b2=true;
					return b2;
					}
					else {
						return false;
					}
			
			}
			if(this.brand.equals("VOLKSWAGEN")) {
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

	public void Tlist() {
		System.out.println("1. FİAT\n2.CİTRÖEN\n3.VOLKSWAGEN");
	}
	
public void aracBilgileriniGoster() {
		
		System.out.println("Marka: "+ this.brand+" Model: "+this.model+" Üretildiği yıl: "+this.year+" Maximum kişi sayısı: "+this.kisiSayisi);
	}
	
	
	public void CustomerInfo() {
		System.out.println("Kiralayan: "+ c1.getName()+" Ehliyet sınıfı: "+ c1.getEhliyet());
		
	}
	
	
	public void AracTeslim() {
		System.out.println("Teslim etmek istediğiniz aracı seçiniz");
		Tlist();
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
	public int getKisiSayisi() {
		return kisiSayisi;
	}
	public void setKisiSayisi(int kisiSayisi) {
		this.kisiSayisi = kisiSayisi;
	}

	

}
