package org.java;

//1 Interface fonctionnelle
@FunctionalInterface
public interface Drawable {
	
	public void draw(String name);
	
	// 7 M?thodes par d?faut
	public default int addiction(int a,int b) {
		return a+b;
	}
	
	public static int soustraction(int a,int b) {
		return a-b;
	}
}
