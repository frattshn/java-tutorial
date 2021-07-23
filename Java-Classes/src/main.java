import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections; //sort method

import java.util.HashMap;

import java.util.Iterator;

import myPack.Student;

import extendedClasses.*;

import polymorphismClasses.*;

import innerOuterClasses.*;

import abstractClass.*;

import interfaceClasses.*;

import java.time.LocalTime;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;


enum Level{
	LOW,
	MEDIUM,
	HIGH
}

enum Numbers{
	One,
	Two,
	Three,
	Four,
	Five
}

public class main {
	int x=5;
	
	
	static void staticMethod() {
		System.out.println("This is a static method.");
	}

	public static void main(String[] args) {
		
		main myObj= new main();
		System.out.println(myObj.x);
		System.out.println();
		class1 ilk= new class1();
		System.out.println("Class no is "+ilk.no);
		System.out.println("Class name is "+ilk.className);
		System.out.println("29*2 is "+ilk.carp(29, 2));
		
		System.out.println();
		
		class2 kutu= new class2();
		kutu.boy=2;
		kutu.en=5;
		kutu.yukseklik=3;
		int hacim= kutu.boy*kutu.en*kutu.yukseklik;
		System.out.println("Kutunun hacmi: "+hacim);
		
		System.out.println();
		
		class3 dikdortgen= new class3();
		dikdortgen.boy=20;
		dikdortgen.en=5;
		System.out.println("Dikdortgenin alaný: "+dikdortgen.alan());
		System.out.println("Dikdortgenin çevresi: "+dikdortgen.cevre());
		
		System.out.println();
		
		staticMethod();
		
		System.out.println();
		
		class4 anotherClass= new class4("Class4", 4);
		anotherClass.info();
		
		System.out.println();
		
		class5 newClass= new class5();
		newClass.setYear(2021);
		System.out.println(newClass.getYear());
		
		System.out.println();
		
		class52 newClass2= new class52();
		newClass2.setYear(2071);
		System.out.println(newClass2.getYear());
		
		System.out.println();
		
		Scanner myScanner= new Scanner(System.in);
		System.out.println("Enter username ");
		String userName= myScanner.nextLine();
		System.out.println("Username: "+ userName);
		
		System.out.println();
		
		Student student= new Student("Fýrat", 27);
		student.studInfo();
		
		System.out.println();
		
		Car myCar= new Car();
		myCar.honk();
		System.out.println(myCar.brand+" "+myCar.modelName);
		
		System.out.println();
		
		Animal myAnimal= new Animal();
		myAnimal.animalSound();
		
		Animal myKangal= new Kangal();
		myKangal.animalSound();
		
		Animal myVanCat= new VanCat();
		myVanCat.animalSound();
		
		System.out.println();
		
		OuterClass myOuter= new OuterClass();
		OuterClass.InnerClass myInner= myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
		
		System.out.println();
		
		OuterClass2.InnerClass2 myInner2 = new OuterClass2.InnerClass2();
		System.out.println(myInner2.y);
		
		System.out.println();
		
		OuterClass3 myOuter3= new OuterClass3();
		OuterClass3.InnerClass3 myInner3= myOuter3.new InnerClass3();
		System.out.println(myInner3.myInnerMethod());
		
		System.out.println();
		
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.sleep();
		
		System.out.println();
		
		Man myMan= new Man();
		myMan.PersonName("Memduh");
		myMan.sleep();
		
		System.out.println();
		
		Level myLevel= Level.MEDIUM;
		switch(myLevel) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		}
		
		System.out.println();
		
		//Numbers myNumbers= Numbers.One;
		for(Numbers myNumbers : Numbers.values())
			System.out.println(myNumbers);
		
		System.out.println();
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter name, age and salary");
		
		//String, integer and double inputs
		String name= obj.nextLine();
		int age= obj.nextInt();
		double salary= obj.nextDouble();
		
		System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary);
		
		System.out.println();
		
		LocalTime date= LocalTime.now();
		System.out.println(date);
		
		System.out.println();
		
		LocalDateTime myDateObj= LocalDateTime.now();
		System.out.println("Before formatting: "+myDateObj);
		
		DateTimeFormatter myFormatObj= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate= myDateObj.format(myFormatObj);
		System.out.println("After formatting: "+formattedDate);
		
		System.out.println();
		
		//ArrayList(String)
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		System.out.println(cars.get(0));
		cars.set(0, "Ferrari");
		System.out.println(cars.get(0));
		cars.remove(0);
		//Remove all the elements in the car list.
		//cars.clear();
		for(int i=0; i<cars.size(); i++)
			System.out.println(cars.get(i));
		System.out.println();
		for(String i:cars)
			System.out.println(i);
		
		Collections.sort(cars);
		for(String i:cars)
			System.out.println(i);
		
		//ArrayList(Integer)
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(5);
		numbers.add(8);
		for(int i:numbers)
			System.out.println(i);
		
		ArrayList<Integer> numbers2= new ArrayList<Integer>();
		numbers2.add(58);
		numbers2.add(55);
		numbers2.add(34);
		System.out.println(numbers2);
		Collections.sort(numbers2);
		System.out.println(numbers2);
		
		HashMap<String, String> capitalCities= new HashMap<String, String>();
		capitalCities.put("Turkey", "Ankara");
		capitalCities.put("Germany", "Berlin");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("Turkey"));
		
		//Print keys
		for(String i: capitalCities.keySet())
			System.out.println(i);
		
		//Print values
		for(String i: capitalCities.values())
			System.out.println(i);
		
		//Print keys and values
		for(String i: capitalCities.keySet())
			System.out.println("key: "+i+" value: "+capitalCities.get(i));
		
		System.out.println();
		
		//Iterator
		ArrayList<Double> doubles= new ArrayList<Double>();
		doubles.add(2.25);
		doubles.add(2.0);
		doubles.add(5.58);
		doubles.add(3.4);
		doubles.add(58.5);
		
		//Get the iterator
		Iterator<Double> it= doubles.iterator();
		//Print the first item
		System.out.println(it.next());
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();
		
		//Removing Items from a Collection
		ArrayList<Double> doubless= new ArrayList<Double>();
		doubless.add(2.25);
		doubless.add(20.0);
		doubless.add(13.58);
		doubless.add(9.4);
		doubless.add(58.5);
		Iterator<Double> it2= doubless.iterator();
		while(it2.hasNext()) {
			double i= it2.next();//ilk eleman ve sonralarý
			if(i<10)
				it2.remove();
		}
		System.out.println(doubless);
		
		
	}
}
