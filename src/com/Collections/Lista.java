package com.Collections;

public class Lista<T> implements Collections{
	private  int index = 0;
	
	private Object[] niz = new Object[10];
	
	private Object[] copyNiz;
	

	private Object[] copyNizMethod(){

			this.copyNiz = new Object[((this.niz.length)*2)];
				for(int i=0; i<this.niz.length; i++){
					this.copyNiz[i] = this.niz[i];
				}
			
				return this.copyNiz;

	}
	
	@Override
	public boolean add(Object o) {
		if(index == this.niz.length-1){
			this.niz = copyNizMethod();
			}
		else{
			this.niz[this.niz.length-1]=o;
		}
			index++;
			
		return true;
	
	}

	@Override
	public void clear() {
		for(int i=0; i<this.niz.length; i++){
				this.niz[i] = null;
			}
	
		
		this.index = 0;
	}

	@Override
	public boolean contains(Object o) {
		for(int i=0; i<this.niz.length; i++){
				if(this.niz[i]==o){
					return true;
				}	
		}
		
		return false;
	}

	@Override
	public boolean isEmpty() {
		int brojac = 0;
			for(int i=0; i<this.niz.length; i++){
					if(this.niz[i] == null){
						brojac++;
					}
			}
	
			if(brojac==this.niz.length){
					return true;
				}
	
		return false;
	}

	@Override
	public boolean remove(Object o) {
		for(int i=0; i<this.niz.length; i++){
				if(this.niz[i]==o){
						this.niz[i]=null;
								this.index-=1;
										return true;
				}
		}
		
		return false;
	}

	@Override
	public int size() {
		return this.index;
	}
	
	/*
	public void printElements(){
		for(int i=0; i<this.niz.length; i++){
			if(this.niz[i] != null){ 
			System.out.println(niz[i]);
			}
		}
		
	}
*/

}
