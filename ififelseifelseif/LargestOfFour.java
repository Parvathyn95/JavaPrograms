class LargestOfFour{
	public static void main(String args[]){
		int w=9,x=19,y=14,z=4;
		if(w>x && w>y && w>z){
			System.out.println("w is the largest");
		}
		else if(x>w && x>y && x>z){
			System.out.println("x is the largest");
		}
		else if(y>w && y>x && y>z){
			System.out.println("y is the largest");
		}
		else{
			System.out.println("z is the largest");
		}
	}
}