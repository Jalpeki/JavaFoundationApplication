package chapter4;

import java.util.Date;

public class ChapTest4_1 implements Comparable<ChapTest4_1> {
	private String title;
	private Date publishDate;
	private String comment;

	public int hashCode() {
		int r = 1;
		r = 31 * r + publishDate.hashCode();
		r = 31 * r + title.hashCode();
		return r;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof ChapTest4_1)) {
			return false;
		}
		ChapTest4_1 b = (ChapTest4_1) o;
		if (!publishDate.equals(b.publishDate)) {
			return false;
		}
		if (!title.equals(b.title)) {
			return false;
		}
		return true;
	}

	public int compareTo(ChapTest4_1 o) {
		return this.publishDate.compareTo(o.publishDate);
	}
	public ChapTest4_1 clone(){
		ChapTest4_1 b = new ChapTest4_1();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date) this.publishDate.clone();
		return b;
	}
}
