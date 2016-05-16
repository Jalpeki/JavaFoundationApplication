package chapter7;

public class List7_2 {
	public static void main(String[] args) throws Exception {
		System.out.println("計算を開始します");
		int x = 56;
		int y = 76;
		int z = 31;
		int  p = x + y + z;
		System.out.println("計算終了。メモで出します");
		ProcessBuilder pb = new ProcessBuilder(
				"c:\\windows\\system32\\notepad.exe",
				"calcreport.txt"
				);
		pb.start();
	}

}
