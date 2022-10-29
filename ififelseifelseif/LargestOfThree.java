class LargestOfThree{
	public static void main(String args[]){
		int x=12,y=5,z=15;
		if(x>y && x>z){
			System.out.println("x is the largest number");
		}
		else if(y>x && y>z){
			System.out.println("y is the largest number");
		}
		else{
			System.out.println("z is the largest number");
		}
	}
}