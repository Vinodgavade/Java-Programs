
public class ArrayExample {
	
	private int arr[]= {1,2,3,4,5,6,55,55,32,2145,65115,214551};
	private int arr2[]= {1,11,111,1111,11111,111111,1111111,11111111,111111111,1111111111};
	private int arr1[]= new int [10];
	int sum =0,odd_count,even_count;
	
	public void displayArray() {
		for (int i=0;i<6;i++) {
			System.out.println(arr[i]);
		}
	}
	public void add() {
		for(int i =0;i<6;i++) {
			sum =sum+arr[i];
		}
		System.out.println("Addition :"+sum);
	}
	public void oddevenCount() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				 odd_count++;
			}else {
				even_count++;
				}	
		}
		System.out.println("Odd Count :"+odd_count+ "\nEven Count : "+even_count);
	}
	
	public void display() { 
		for(int num:arr2) {    // for each loop
			 sum = sum + num;
			System.out.println(num);
		}System.out.println("Addition of Array :"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExample ae = new ArrayExample();
		ae.displayArray();
		ae.add();
		ae.oddevenCount();
		ae.display();

	}
	

}
