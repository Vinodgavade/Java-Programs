
public class MethodOverloading1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 20, n2 =62;
		int m1 = 51 , m2 = 51 , m3 = 15;
		float a1 = 32.21f ,a2 = 654.561f;
		float b1= 65.2f , b2 = 54.21f , b3= 54.21f;
		MethodOverloading1 md = new MethodOverloading1();
		md.Multiply(n1, n2);
		md.Multiply(m1, m2, m3);
		md.Multiply(a1, a2);
		md.Multiply(b1, b2, b3);

	}

}
