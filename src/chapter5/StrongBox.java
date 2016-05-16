package chapter5;


public class StrongBox<E> {
	private E item;
	private KeyType keyType;
	private long count;

	public StrongBox(KeyType key) {
		this.keyType = key;
	}

	public void put(E i) {
		this.item = i;
	}

	public E get(){
		this.count++;
		switch(this.keyType){
			case PADLOCK:
			if(count < 1024)
				return null;
			break;
			}
		return this.item;
	}
}
