
public class class4 {
	public
		String className;
		int classNumber;
		/*
		class4(String s, int i){
			className= s;
			classNumber= i;
		}
		*/
		class4(String className, int classNumber){
			this.className= className;
			this.classNumber= classNumber;
		}
		void info() {
			System.out.println("Class name is: "+className);
			System.out.println("Class no is: "+classNumber);
		}
}


