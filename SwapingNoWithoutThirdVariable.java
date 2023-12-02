
public class SwapingNoWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x=2,y=3;
			System.out.println("Before Swap x= "+x+" and y= "+y);
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("After Swap x= "+x+" and y= "+y);
	}

}
