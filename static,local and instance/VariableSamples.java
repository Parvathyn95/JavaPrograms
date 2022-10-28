
class VariableSamples{
    int sum, diff;
	static int sum1, diff1;
  public void addition(){
    int a=15,b=17;
	sum=a+b;
	sum1=a+b;
	System.out.println("Sum of a and b is : "+sum);
	System.out.println("Sum of a and b is : "+sum1);
  }
  public static void subtraction(){
	int a=87,b=59;
	//diff=a-b;
	diff1=a-b;
	//System.out.println("Diff of a and b is : "+diff);
	System.out.println("Diff of a and b is : "+diff1);
  }
  public static void main(String args[]){
    VariableSamples obj1=new VariableSamples();
	obj1.addition(); 
	//VariableSamples obj2=new VariableSamples();
	//obj2.subtraction();
	VariableSamples.subtraction();
  }
}