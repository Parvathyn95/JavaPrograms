class OverloadArea{
	public static double area(int a){
		double area=(3.14*a*a)/2;
		System.out.println("Area of the circle is : "+area);
		return 0;
	}
	public void area(int a,int b){
		float area=a*b;
		System.out.println("Area of the rectangle is : "+area);
	}
	public static void area(float a){
		float area= a*a;
		System.out.println("Area of the square is : "+area);
	}
	public static void main(String args[]){
		OverloadArea.area(13);
		OverloadArea obj = new OverloadArea();
		obj.area(14,19);
		OverloadArea.area(16.7f);
	}
}