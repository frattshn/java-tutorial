package innerOuterClasses;

//Access Outer Class From Inner Class

public class OuterClass3 {
	int x=10;
	
	public class InnerClass3{
		public int myInnerMethod() {
			return x;
		}
	}
}
