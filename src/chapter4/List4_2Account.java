package chapter4;

public class List4_2Account {
	String accountNO;

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof List4_2Account))
			return false;
		List4_2Account r = (List4_2Account) o;
		if (!this.accountNO.trim().equals(r.accountNO.trim())) {
			return false;
		}
		return true;
	}

}
