class DiscountAvail{
    int a,b,c,d;
	public static int totamt(int a,int b,int c,int d){
		int total=a+b+c+d;
		return total;
	}
	public static double disavl(int total){
			double distotal=0;
			if(total>5000){
				distotal=total-(0.2*total);
				System.out.println("Eligible for discount");
				return distotal;
			}
			else{
				System.out.println("Not Eligible for discount");
				return total;
			}
	}
	public static void main(String args[]){
		//int t=DiscountAvail.totamt(500,250,380,2000);
		int t=DiscountAvail.totamt(500,250,2980,2000);
		System.out.println("Total Amount is : "+t);
		double d=DiscountAvail.disavl(t);
		System.out.println("Final Price is : "+d);
	}
}