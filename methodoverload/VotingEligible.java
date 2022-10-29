class VotingEligible{
	static int age=35;
	//static int age=16;
	static Boolean flag=false;	
	public static Boolean eligible(){
		System.out.println("Age is : "+age);
		if(age>=18){
			flag=true;
		}
		if(flag==true){
			System.out.println("Eligible to vote");
			return flag;
		}
		else{
			System.out.println("Not Eligible to Vote");
			return flag;
		}
	}
	
	public static void main(String args[]){
		Boolean a=VotingEligible.eligible();
		System.out.println(a);
	}
}