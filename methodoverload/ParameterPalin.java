class ParameterRevPalin{
	public static void reverse(int num){
		int rem,rev=0,temp=num;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		checkPalindrome(rev,temp);
		System.out.println("Reverse of the number is : "+rev);
	}
	public static void checkPalindrome(int rev,int temp){
		
		if(temp==rev){
			System.out.println("Given number "+temp+" is a Palindrome");
		}
		else{
			System.out.println("Given number "+temp+" is not a Palindrome");
		
		}
	}
	public static void main(String args[]){
		  ParameterRevPalin.reverse(16394);	
	}
}
