class SwapWithoutTemp{
	public static void main(String args[]){
		int x=7,y=5;
		x=x+y; //x=12
		y=x-y; //y=7
		x=x-y; //x=5
		System.out.println("New x is : "+x);
		System.out.println("New y is : "+y);
	}
}