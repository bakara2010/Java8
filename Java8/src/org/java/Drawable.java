package org.java;

//1 Interface fonctionnelle
@FunctionalInterface
public interface Drawable {
	
	public void draw(String name);
	
	public default int addiction(int a,int b) {
		return a+b;
	}
	
	public static int soustraction(int a,int b) {
		return a-b;
	}
}
