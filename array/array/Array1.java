package array;
import java.util.*;



public class Array1 {
	
	private int dSize;

	private int[] arr;
	

	Array1(){
		
		System.out.print("please enter desired size: ");
		Scanner scan = new Scanner(System.in);
		this.dSize = scan.nextInt();
		scan.close();
		
		System.out.println(this.dSize);
		
		this.addNums(this.dSize);
		
	}
	
	public void addNums(int size) {
		System.out.println("creating array of size " + this.dSize);
		
		this.arr = new int[this.dSize];
		
		for (int i = 0; i < this.dSize; i++) {
			this.arr[i] = i;
			System.out.println(arr[i]);
		}
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < this.arr.length; i++) {
			s += arr[i];
			
		}
	}

	public static void main(String[] args) {
		Array1 r1 = new Array1();

	}

}
