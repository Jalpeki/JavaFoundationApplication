package chapter3;

import java.util.HashMap;
import java.util.Map;


public class List3_7 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String,Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 12611);
		prefs.put("熊本", 181);
		int tokyo =prefs.get("東京都");
		System.out.println("東京都の人口は" + tokyo);
		prefs.remove("京都府");
		prefs.put("熊本", 182);
		int kumamoto = prefs.get("熊本");
		System.out.println("熊本県の人口は" + kumamoto);
	}
}
