class DummyStatic{
	static int instancevar=15;
	public void add1(){
		int localvar=10;
		System.out.println(localvar);
		System.out.println(instancevar);
	}
	public static void add(){
		//System.out.println(localvar);
		System.out.println(instancevar);
	}
	public static void main(String args[]){
		DummyStatic.add();
		DummyStatic obj = new DummyStatic();
		obj.add1();
	}
}