package chapter3;

import java.util.ArrayList;
import java.util.List;


public class ChapTest3_2 {
	public static void main(String[] args) {
		Hero2 h =new Hero2("斉藤");
		Hero2 hh = new Hero2("鈴木");

		List<Hero2> names = new ArrayList<Hero2>();
		names.add(h);
		names.add(hh);
		for (Hero2 hn : names) {
			System.out.println(hn.getName());
			}
		}
	}



class Hero2{
	private String name;
	public Hero2(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
