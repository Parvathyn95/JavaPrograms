class DepositWithdraw{
	static int m=200;
		public static void currentBalnc(){
		System.out.println("Current Balance Deposit : "+m);
		}
	static int d=200;
		public void deposit(){
		System.out.println("Amount Deposited : "+d);
		}
	static int md;
		public static void currentBalncAftDepo(){
		md=m+d;
		System.out.println("Current Balance After Deposit : "+md);
		}
	static int w=700,mb;
	//static int w=200,mb;
	public void amtWithdrw(){
		mb=(md-w);
		if(md>=w){
			System.out.println("Withdrawal Amount : "+w);
			System.out.println("Current Balance After Withdrawal : "+mb);
		}
		else{
			System.out.println("Entered Amount Rs : "+w+" Is Not Available At The Moment, Please Contact Bank");
		}
	}
	public static void main(String args[]){
		DepositWithdraw.currentBalnc();
		DepositWithdraw obj = new DepositWithdraw();
		obj.deposit();
		DepositWithdraw.currentBalncAftDepo();
		obj.amtWithdrw();
	}
}