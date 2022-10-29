class PalinFlag{
	public static void main(String args[]){
		int num=121,rem,rev=0,temp=num;
		Boolean flag=false;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev){
			flag=true;
		}
		if(flag==true){
			System.out.println("Given number is a palindrome");
		}
		else{
			System.out.println("Given number is not a palindrome");
		}		
	}
}