
public class ObjectPass {
	private int num1;
	public ObjectPass(int n) {
		num1 = n;
	}

	public static void add(ObjectPass obj1, ObjectPass obj2) {
		int sum = obj1.num1+obj2.num1;
		System.out.println("Addition :"+sum);
	}
	public static void swap(ObjectPass obj1, ObjectPass obj2) {
		int temp,num1;
		System.out.println("Before Swap \n a="+obj1.num1+ "\t b="+obj2.num1);
		temp=obj1.num1;
		obj1.num1=obj2.num1;
		obj2.num1=temp;
		System.out.println("After Swap \n a="+obj1.num1+ "\t b="+obj2.num1);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 20,n2= 40;
		ObjectPass obj1 = new ObjectPass(n1);
		ObjectPass obj2 = new ObjectPass(n2);
		
		ObjectPass.add(obj1,obj2);
		ObjectPass.swap(obj1,obj2);
	}

}
