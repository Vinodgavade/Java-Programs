//uasing to string
public class OddOrEven {
	int num=9,a ;
	
	
	
	public String toString() 
	{
			if(a==0) {
				 return "Even Number";
			}else {
				return "Odd Number";
				}	
	}
	
	public void evenodd() {
		if (num%2 ==0)
			a=0;
		else
			a=1;
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddOrEven oe = new OddOrEven();
		oe.evenodd();
		System.out.println(oe);

	}

}
