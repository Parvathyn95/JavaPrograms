class AreaStatic{
		static float triArea,recArea,sqArea;
	public static void triArea(){
		float b=17.6f,h=13.2f;
		triArea=(b*h)/2;
		System.out.println("Area of triangle is : "+triArea);
	}
	public static void recArea(){
		float l=7.8f,d=4.6f;
		recArea=l*d;
		System.out.println("Area of rectangle is : "+recArea);
	}
	public static void sqArea(){
		float a=17.0f;
		sqArea=a*a;
		System.out.println("Area of square is : "+sqArea);
	}
	public static void main(String args[]){
			AreaStatic.triArea();
			AreaStatic.recArea();
			AreaStatic.sqArea();
	}
}