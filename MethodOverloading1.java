//Assignment Que
public class MethodOverloading1 {
	void Multiply(int num1,int num2) {
		int ans = num1*num2;
		System.out.println("Multiplication of two Integers :"+ans);
		
	}
	void Multiply(int num1,int num2, int num3) {
	int ans = num1*num2*num3;
	System.out.println("Multiplication of three Integers :"+ans);
		
	}
	void Multiply(float num1,float num2) {
	float ans = num1*num2;
	System.out.println("Multiplication of two Float No :"+ans);
	
}
	void Multiply(float num1,float num2,float num3) {
	float ans = num1*num2*num3;
	System.out.println("Multiplication of three Float No :"+ans);
	
}
}
