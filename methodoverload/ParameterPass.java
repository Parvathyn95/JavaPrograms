class ParameterPass{
	public static void add(int a,int b,int c){
		int sum=0;
		sum=a+b+c;
		System.out.println("Sum is : "+sum);
	}
	public static void main(String args[]){
		//ParameterPass.add(12,5,28);
		add(12,5,28);
	}
}