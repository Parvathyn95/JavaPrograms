class OddOrEvenCount{
	public static void main(String args[]){
		int even=0,odd=0;
		for(int i=10;i<=20;i++){
			if(i%2==0){
				even++;
			}
			else{
				odd++;	
			}			
		}
		System.out.println("Even Count is : " +even);
		System.out.println("Odd Count is : " +odd);		
	}
}