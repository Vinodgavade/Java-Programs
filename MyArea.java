
public class MyArea {
	float area_circle,area_rect,r,l,b;
	
	void get_circdim(float r1)//mutator method or setter method
	{
		r=r1;
		
	}
	
	void get_rectdim(float l1, float b1)
	{
		l=l1;
		b=b1;
		
	}
	
	void Cir_Area() 
	{
		float pi=3.14f;
		area_circle = pi*(r*r);
		System.out.println("Area of circle = "+area_circle);
		
	}
	
	void Rect_Area()
	{
		area_rect =l*b;
		System.out.println("Area of Rectangle = "+area_rect);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArea ma = new MyArea();
		ma.get_circdim(5);
		ma.get_rectdim(4, 6);
		ma.Cir_Area();
		ma.Rect_Area();
	}

}
