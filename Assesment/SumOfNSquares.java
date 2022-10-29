class SumOfNSquares{
	public static void main(String args[]){
		int i=1,sum=0,squ,n=10;
		while(i<=n){
			squ=i*i;
			sum=sum+squ;
			i++;
		}
		System.out.println("Sum of squares from 1 to 10 is : " +sum);	
	}
}