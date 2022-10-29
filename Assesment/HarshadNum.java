class HarshadNum{
	public static void main(String args[]){
		int num=864,sum=0,rem,temp=num;
		while(num>0){
			rem=num%10;     //864%10 86%10 8%10
			sum=sum+rem;    // 0+4    4+6   10+8
			num=num/10;     // 864/10 86/10 8/10
		}
		if(temp%sum==0){
			System.out.println("Given number is a Harshad Number");
		}
		else{
			System.out.println("Given number is not a Harshad Number");
		}
	}
}



