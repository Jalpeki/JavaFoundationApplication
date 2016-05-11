package chapter4;

  class Sword {
	String name;
	Sword(String name){
		this.name = name;
	}
	
	class Hero1{
		String name;
		int hp,mp;
		
		Hero1(String name){
			this.name = "鉄";
			
		}
		
	}
}

public class List4_9 {
	public static void main(String[] args) {
		Hero1 h1 = new Hero1();
		Sword s = new Sword("はがねの剣");
		h1.setSword(s);
		System.out.println("装備：" + h1.getClass())
		System.out.println("clone()で複製します");
		Hero h2 = h1.clone();
		
	}
}
