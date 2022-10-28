class SwapWithTemp{
	public static void main(String args[]){
		int x=10,y=19,temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("New x is : "+x);
		System.out.println("New y is : "+y);	
	}
}