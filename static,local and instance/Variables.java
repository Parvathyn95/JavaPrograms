class Variables{
	int x=80; 
	int z=150;//instance variable
	static int y=100; //static variable
  public void method1(){
    int a=10; //local variable 
    System.out.println(a);
    System.out.println(x);
	System.out.println(y);
	System.out.println(z);
}
  public static void method2(){
	int a=15; //local variable
    System.out.println(a);
	Variables meth = new Variables();
	System.out.println(meth.x);
	System.out.println(meth.z);
	System.out.println(y);
}
  public static void main(String args[]){
  //Variables.method1();
    Variables.method2();
  //classname obj=new classname();
    Variables obj=new Variables();
	obj.method1();
	
}
}