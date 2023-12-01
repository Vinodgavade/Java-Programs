
public class OverloadingDemo {

	void Addition(int num1,int num2) {
		int ans = num1+num2;
		System.out.println("Addition of two integer :"+ans);
	}
	
	void Addition(float num1,float num2) {
		float ans = num1+num2;
		System.out.println("Addition of two float :"+ans);
	}
	
	void Addition(int num1,int num2,int num3) {
		int ans = num1+num2+num3;
		System.out.println("Addition of three integer :"+ans);
	}
	
	void Addition(String s1,String s2) {
		System.out.println(s1+ " "+s2);
	}
}
