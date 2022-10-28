class InstanceArea{
		float triArea,recArea,sqArea;
	public void triArea(){
		float b=14.7f,h=9.6f;
		triArea=(b*h)/2;
		System.out.println("Area of triangle is : "+triArea);
	}
	public void recArea(){
		float l=15.0f,d=11.2f;
		recArea=l*d;
		System.out.println("Area of rectangle is : "+recArea);
	}
	public void sqArea(){
		float a=13.8f;
		sqArea=a*a;
		System.out.println("Area of square is : "+sqArea);
	}
	public static void main(String args[]){
			InstanceArea obj1 = new InstanceArea();
			obj1.triArea();
			obj1.recArea();
			obj1.sqArea();
	}	
}