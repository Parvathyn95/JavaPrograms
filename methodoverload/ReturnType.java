class ReturnType{
	static int a=19,b=7;
	public static int add(){
		int sum=a+b;
		return sum;
	}
	public static int sub(){
		int sub=a-b;
		return sub;
	}
	public static void main(String args[]){
		int d=ReturnType.add();
		int e=ReturnType.sub();
		System.out.println("Sum is : "+d);
		System.out.println("Diff is : "+e);
		
	}
}