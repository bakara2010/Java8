package org.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		//2 Expressions Lambda
		System.out.println("//2 Expressions Lambda");
		Drawable d1 = (String object)->{System.out.println("Draw "+object);};
		d1.draw("anim");
		System.out.println(d1.addiction(2, 3));
		System.out.println(Drawable.soustraction(2, 3));
		
		//3 R�f�rences de m�thode
		System.out.println("//3 R�f�rences de m�thode");
		Drawable d2=MyClass::show;
		d2.draw("New object1");
		//
		Drawable d3=MyClass::new;
		d3.draw("New object2");
		
		//4 Optional
		System.out.println("//4 Optional");
		OptionalExample.show(1);
		OptionalExample.show(2);
		
		//5 forEach
		System.out.println("//5 forEach");
		List<String> names = Arrays.asList("Larry", "Steve", "James");
		names.forEach(System.out::println);
		
		//6 API Date/Time
		System.out.println("//6 API Date/Time");
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
	    DateTimeFormatter format =
	    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	    String formatedDateTime = current.format(format); 
	    System.out.println("in formatted manner "+
	                        formatedDateTime);
		//8 API Stream
	    
	    
	}
}

//3 R�f�rences de m�thode
class MyClass{
	MyClass(String object){
		System.out.println(object);
	}
	public static void show(String object){
		System.out.println(object);
	}
}

//4 Optional
class OptionalExample{
	static void show(int indice) {
		String [] str=new String[5];
		str[1]="Hello the value is not null";
		Optional<String> isNull = Optional.ofNullable(str[indice]);
		if(isNull.isPresent()) {
			System.out.println(str[indice].trim());
		}
		else {
			System.out.println("The value is null");
		}
	}
}

