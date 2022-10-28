class StaticFact{
	public static void fact(){
		int fact=1,num=6;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("The factorial of " + num + " is : "+fact);
	}
	public static void main(String args[]){
		StaticFact.fact();

	}
}