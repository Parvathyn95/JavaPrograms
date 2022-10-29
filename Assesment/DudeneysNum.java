class DudeneysNum{
	public static void main(String args[]){
		int num=512,rem,sum=0,temp=num;
		do{
			rem=num%10;
			sum=sum+rem;
			num=num/10;	
		}while(num!=0);
		if(temp==sum*sum*sum){
			System.out.println("Given number is a Dudeneys Number");
		}
		else{
			System.out.println("Given number is not a Dudeneys Number");
		}
	}
}