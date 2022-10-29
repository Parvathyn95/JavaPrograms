class ArmstrongNum{
	public static void main(String args[]){
		int n=326,rev=0,rem,temp=n,cube,sum=0;
		while(n!=0){
			rem=n%10;            //153%10=3  //15%10=5 //1%10=1
			cube=rem*rem*rem;    //3*3*3     //5*5*5  //1*1*1
			sum=sum+cube;        //0+27		//27+125 //27+125+1
			n=n/10;              //153/10	//15/10	//1/10
		}
	if(temp==sum){
		System.out.println("Given Number is an Armstrong Number");
	}
	else{
		System.out.println("Given Number is not an Armstrong Number");
	}
	}
}