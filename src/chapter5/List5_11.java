package chapter5;


class Outer{
	int outField;
	static int outerStaticField;
	static class Inner{
		void innerMethod(){
			outerStaticField = 10;
		}
	}
	void outerMethod(){
		Inner ic = new Inner();
	}
}


public class List5_11 {
	public static void main(String[] args) {
		Outer.Inner ic = new Outer.Inner();
		System.out.println(ic);


	}
}
