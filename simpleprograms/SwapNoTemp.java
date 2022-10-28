class SwapNoTemp{
	public static void main(String args[]){
		int a=13,b=12;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("New a is : "+a);
		System.out.println("New b is : "+b);
	}
}