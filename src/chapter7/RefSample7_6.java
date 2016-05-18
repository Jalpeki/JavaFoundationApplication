package chapter7;

public class RefSample7_6 {
	public int times = 0;
	public RefSample7_6(int t){
		this.times = t;
	}
	public void hello(String msg){
		this.hello(msg, this.times);
	}
	public void hello(String msg, int t){
		System.out.println("Hello," + msg + "x" + t);
	}
}
