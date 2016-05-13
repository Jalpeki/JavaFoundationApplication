package chapter4;

public class List4_8 implements Cloneable {
	String name;
	int hp;
	Sword2 sword;

	public List4_8(String name) {
		this.name= name;
	}

	public List4_8 cione() {
		List4_8 result = new List4_8(name);
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
}


