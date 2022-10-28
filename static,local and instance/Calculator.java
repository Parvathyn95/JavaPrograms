class Calculator{
  public static void addition(){
	int a=5,b=8,add;  
	add=a+b; 
	System.out.println("Sum of two numbers is : "+add);  
    }
  public static void subtraction(){
	int c=18,d=7,diff;
    diff=c-d;	
	System.out.println("Difference of two numbers is : "+diff);
    }  
  public static void multiplication(){
	int e=17,f=7,prod;
    prod=e*f;
    System.out.println("Product of two numbers is : "+prod);	  
    }
  public static void division(){
	float g=12.3f,h=6.4f,rem;
    rem=g/h;
    System.out.println("Remainder of two numbers is : "+rem);	
	  
    }
  public static void main(String args[]){	
	Calculator.addition();
	Calculator.subtraction();
	Calculator.multiplication();
	Calculator.division();
    }
}