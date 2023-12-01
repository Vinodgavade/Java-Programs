
public class SimpleInterest {
	float p,ny,ri,si;
	void getdata(float p1, float n1, float r1 )
	{
		p=p1;
		ny=n1;
		ri=r1;
	}
	
	void calcSimple()
	{
		si=(p*ny*ri)/100;
	}
	
	void displayInfo()
	{
		System.out.println("Simple interest = "+si);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest smi=new SimpleInterest();
		smi.getdata(82000, 4, 7.2f);
		smi.calcSimple();
		smi.displayInfo();
	}

}
