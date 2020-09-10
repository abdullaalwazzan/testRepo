package counterB;

public class Counter {
	
	private int count;
	
	private int limit;
	
	public Counter(int limit) {
		this.count = 0;
		this.limit = limit;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int getLimit() {
		return this.limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void count() {
		if(this.count == this.limit) {
			System.out.println("cannot count, limit has been reached");
		}
		else {
			this.count++;
		}
		
	}
	
	public static void main(String[] args) {
		
		Counter c1 = new Counter(2);
		System.out.println(c1.getCount());
		System.out.println(c1.getLimit());
		
		c1.count();
		System.out.println(c1.getCount());
		
		c1.count();
		System.out.println(c1.getCount());
		
		c1.count();
		System.out.println(c1.getCount());
	}

}
