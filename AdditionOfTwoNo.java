import java.util.Scanner;

public class AdditionOfTwoNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int No1, No2,Sum;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the first Number : ");
		No1=sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		No2 =sc.nextInt();
		
		Sum =No1+No2;
		
		System.out.println("Addition of "+No1+" + "+No2+" = "+Sum);
		
				
	}

}
