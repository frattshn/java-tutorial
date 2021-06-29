package myPack;

public class Student {
	private
		String studentName;
		int studentNo;
	public Student(String studentName, int studentNo) {
		super();
		this.studentName = studentName;
		this.studentNo = studentNo;
	}
	public void studInfo() {
		System.out.println(this.studentName+" "+this.studentNo);
	}
}
