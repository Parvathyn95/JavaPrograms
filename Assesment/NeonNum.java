class NeonNum{
	public static void main(String args[]){
		int num=9,sq,sum=0,rem,temp=num;
		sq=num*num;
		while(sq>0){
			rem=sq%10;
			sum=sum+rem;
			sq=sq/10;		
		}	
		if(temp==sum){
			System.out.println("Given Number is a Neon Number");
		}
		else{
			System.out.println("Given Number is not a Neon Number");
		}
	}
}