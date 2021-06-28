
public class main {
	
	
	

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int anArray[]= {3,5,7,58,55};
		System.out.println("Element 1 at index 0: "+anArray[0]);
		for(int i=0; i<5; i++)
			System.out.println(anArray[i]);
		
		System.out.println();
		
		int[] Array= {55,58,61};
		for(int i=0; i<3; i++)
			System.out.print(Array[i]+" ");
		System.out.println();
		for(int numbers:Array)
			System.out.println(numbers);
		
		System.out.println();
	
		String[][] names= {
				{"Memduh", "Hakký"},
				{"Fýrat", "Batuhan"}
		};
		System.out.println(names[0][0]+" "+names[1][0]);
		System.out.println(names[0][1]+" "+names[1][1]);
		System.out.println("Length of names: "+names.length);
		
		System.out.println();
		
		//Array Copy
		int[] copyFrom= {0,1,2,3,4,5,6,7};
		int[] copyTo = new int[5];
		//Kopyalanan dizi, kaçýncý indexten baþlayacaðý
		//Hedef dizi, hedef dizide kaçýncý diziden baþlayacaðý
		//Kaç adet veri kopyalanacaðý
		System.arraycopy(copyFrom, 1, copyTo, 0, 5);
		for(int numbers : copyTo)
			System.out.print(numbers+" ");
		
		System.out.println();
		speedCheck();
		System.out.println();
		graduateDemo(50);
		System.out.println();
		int theAnswer= getMonthNo("FeBruArY");
		System.out.println(theAnswer);
		
	}
	//END OF THE MAIN
	public static void speedCheck(){
		boolean isHighSpeed=true;
		if(isHighSpeed)
			System.out.println("High Speed!!");
	}
	
	public static void graduateDemo(int puan) {
		if(puan>=75 && puan <=100)
			System.out.println("A!");
		else if(puan>=50 && puan<=75)
			System.out.println("B!");
		else
			System.out.println("C!");
	}
	
	public static int getMonthNo (String month) {
		int getMonthNo=0;
		switch(month.toLowerCase()) {
		case "january":
			getMonthNo=1;
			break;
		case "february":
			getMonthNo=2;
			break;
		default:
			System.out.println("Wrong month name!!");
		}
		return getMonthNo;
	}
}
