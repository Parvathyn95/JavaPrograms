class ArmStrongPrac{
	public static void main(String args[]){
		int n=672,rem,cube,sum=0,temp=n;
		while(n!=0){
			rem=n%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			n=n/10;		
		}
		if(temp==sum){
			System.out.println("Given number is an armstrong number");	
		}
		else{
			System.out.println("Given number is not an armstrong number");
		}
	}
}