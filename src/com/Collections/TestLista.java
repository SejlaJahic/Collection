package com.Collections;

public class TestLista {

	public static void main(String[] args) {
		Lista <String> test = new Lista<>();
		System.out.println("Tek smo kreirali listu test... ");
		System.out.println("Da li je lista prazna? " + test.isEmpty());
		System.out.println("Velièina liste: " + test.size());
		
		String o  = new String();
		o = "Mehehe";
		test.add(o);
		
		System.out.println();
		System.out.println("Nakon dodavanja  \"o\" objekta: ");
		System.out.println("Velièina liste: " + test.size());
		System.out.println("Da li je lista prazna? " + test.isEmpty());
		System.out.println("Da li lista sadrži objekat \"o\"  " + test.contains(o));
		
	
		test.remove(o);
		System.out.println();
		System.out.println("Nakon uklanjanja \"o\" objekta: ");
		System.out.println("Velièina liste: " + test.size());
		System.out.println("Da li je lista prazna? " + test.isEmpty());
		System.out.println("Da li lista sadrži objekat \"o\"  " + test.contains(o));
		
		for(int i = 0; i<50; i++){
			test.add(new String()); 
		}
		
		System.out.println();
		System.out.println("Dodali smo deset objekata u listu, stanje liste sada: ");
		System.out.println("Velièina liste: " + test.size());
		System.out.println("Da li je lista prazna? " + test.isEmpty());
		
		test.clear();
		System.out.println();
		System.out.println("Obrisali smo sve elemente iz liste, trenutno stanje liste: ");
		System.out.println("Velièina liste: " + test.size());
		System.out.println("Da li je lista prazna? " + test.isEmpty());
		
		
	}

}
