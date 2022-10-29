class DummyInstance{
	float a=12.5f;
	public void add1(){
		int b=10;
		float sum;
		sum=a+b;
		System.out.println("Sum is : "+sum);
	}
	public static void main(String args[]){
		DummyInstance obj = new DummyInstance();
		obj.add1();
	}
}