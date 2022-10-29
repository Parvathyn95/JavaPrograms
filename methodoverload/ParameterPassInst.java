class ParameterPassInst{
	public void add(String s){
		
		System.out.println(s);
	}
	public static void main(String args[]){
		ParameterPassInst obj = new ParameterPassInst();
		obj.add("Hello World");
	}
}