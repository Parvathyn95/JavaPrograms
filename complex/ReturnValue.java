class ReturnValue{
	public int add(int a,int b){
		int sum=a+b;
		return sum;
	}
	public static float diff(float a,float b){
		float diff;
		diff=a-b;
		return diff;
	}
	public static void main(String args[]){
		ReturnValue obj = new ReturnValue();
		int d=obj.add(10,25);
		System.out.println("Sum is : "+d);
		float e= ReturnValue.diff(26.3f,15.2f);
		System.out.println("Difference is : "+e);

	}
}
