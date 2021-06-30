import java.util.Scanner;

import myPack.Student;

import extendedClasses.*;

import polymorphismClasses.*;

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
	}

}
