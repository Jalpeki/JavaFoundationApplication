package chapter4;

public class List4_1Hero {

	private String name;
	private int hp, mp;

	public List4_1Hero() {
		this.name = "トヨダ";
		this.hp = 200;
	}

	public String toString() {
		return "勇者(名前 = " + this.name + "/HP=" + this.hp + "/MP=" + this.mp
				+ ")";
	}
}
