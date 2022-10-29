class RevNPalin{
	public static void main(String args[]){
		int n=1221,rev=0,rem;
		int temp=n;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;		
		}
		System.out.println("Reverse of +temp is : " +rev);
			if(temp==rev){
				System.out.println("The given number is a palindrome");
			}
			else{
				System.out.println("The given number is not a palindrome");
			}
	}
}