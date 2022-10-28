class DiffOprtrs{
	int a=30,b=15;
	public void add(){
		int sum=a+b;
		System.out.println("Sum of a and b="+sum);
	}
	public void diff(){
		int diff=a-b;
		System.out.println("Difference of a and b="+diff);
	}
	public void prod(){
		float prod=a*b;
		System.out.println("Product of a and b="+prod);
	}
	public void div(){
		float div=a/b;
		System.out.println("Division of a and b="+div);
	}
  public static void main(String args[]){
		DiffOprtrs obj = new DiffOprtrs();
		obj.add();
		obj.diff();
		obj.prod();
		obj.div();
}
}