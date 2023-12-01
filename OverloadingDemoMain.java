
public class OverloadingDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10, n2 = 25;
		float a = 3.14f , b = 3.25f;
		int p =36,q =66,r=58;
		String x = "vinod", y= "gavade";
		
		OverloadingDemo old = new OverloadingDemo();
		old.Addition(n1, n2);
		old.Addition(a, b);
		old.Addition(p, q, r);
		old.Addition(x, y);
	}

}
