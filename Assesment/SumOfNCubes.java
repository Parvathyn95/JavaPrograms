class SumOfNCubes{
	public static void main(String args[]){
		int i=1,cub,sum=0,n=15;
		do{
			cub=i*i*i;
			sum=sum+cub;
			i++;		
		}while(i<=n);
		System.out.println("Sum of the cubes of first 15 numbers is : " +sum);
	}
}