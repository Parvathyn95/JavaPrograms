class ParameterRevPalin{
	public static void reverse(int num){
		int rem,rev=0,temp=num;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of the number is : "+rev);
	}
	public static void palin(Boolean flag){
		int rem,rev=0,temp=num;
		if(temp==rev){
			flag=true;
		}
		if(flag==true){
			System.out.println("Given number is a Palindrome");
		}
		else{
			System.out.println("Given number is not a Palindrome");
		
		}
	}
	public static void main(String args[]){
		  ParameterRevPalin.reverse(16394);	
		  ParameterRev.palin(false);
	}
}
