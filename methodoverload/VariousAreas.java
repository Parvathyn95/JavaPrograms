class VariousAreas{
	float rad,l,b,a;
	public double circArea(float rad){
		double circArea=(rad*rad*3.14);
		System.out.println("a.Circle");
		System.out.println("Radius of the circle is : "+rad);
		System.out.println("Area of the circle is : "+circArea);
		return circArea;
	}
	public double recArea(float l,float b){
		
		double recArea=(l*b);
		System.out.println("b.Rectangle");
		System.out.println("Length of the rectangle is : "+l);
		System.out.println("Breadth of the rectangle is : "+b);
		System.out.println("Area of the rectangle is : "+recArea);
		return recArea;
	}
	public double sqArea(float a){
		double sqArea=(a*a);
		System.out.println("c.Square");
		System.out.println("Side of the square is : "+a);
		System.out.println("Area of the square is : "+sqArea);
		return sqArea;
	}
	public static void main(String args[]){
		VariousAreas obj = new VariousAreas();
		obj.circArea(26.5f);
		obj.recArea(23.2f,18.6f);
		obj.sqArea(10.7f);
	}
}