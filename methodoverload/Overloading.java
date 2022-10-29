class Overloading{
	private static void add(int a,int b){                      //access specifier doesnot matter
		int sum=a+b;
		System.out.println("Sum of 2 integers is : "+sum);
	}
	public static float add(float a,float b,float c){
		float sum=a+b+c;
		//System.out.println("Sum of 3 float numbers is : "+sum);
		return sum;
	}
	public static void add(float a,float b,int c){
		float sum=a+b+c;
		System.out.println("Sum of 2 float numbers and 1 integer is : "+sum);
	}
	public static void main(String args[]){
		Overloading.add(18,35);
		float f = Overloading.add(12.5f,26.7f,19.2f);
		System.out.println("Sum of 3 float numbers is : "+f);
		Overloading.add(23.7f,10.2f,32);	
	}
}