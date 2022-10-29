class SumOfNNums{
	public static void main(String args[]){
		int sum=0,i=1,n=15;
		do{
			sum=sum+i;
			i++;
		}while(i<=n);
			System.out.println("Sum of the first 15 numbers is : "+sum);
	}
}