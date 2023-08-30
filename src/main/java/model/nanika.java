package model;

public class nanika {
	private int count;
	
	public nanika() {}
	public nanika(int count) {
		this.count = count;
		this.count++;
		if(this.count%2 == 0) {
			this.count = 2;
		}else this.count =1;
	}
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
