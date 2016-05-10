package chapter3;

import java.util.ArrayList;

public class List3_1 {
	public static void main(String[] args) {
		ArrayList<Integer> point = new ArrayList<>();
		point.add(10);
		point.add(80);
		point.add(75);
		for(int i :point){
			System.out.println(i);
		}
	}

}
