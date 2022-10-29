class PrimeNoOrNot{
	public static void main(String args[]){
		int num=17;
		Boolean flag=false;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag=true;
				break;
			}			
		}
		if(flag==true){
			System.out.println("Given number is not a prime number");
		}
		else{
			System.out.println("Given number is a prime number");
		}
	}
}