import java.util.Scanner;
import java.lang.Math;
class PromptArea{
	public static void main(String args[]){
		int choice;
		float r=5.7f,l=16.9f,b=12.3f,a=18.7f;
		double area=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Circle Area");
		System.out.println("2 - Rectangle Area");
		System.out.println("3 - Square Area");
		System.out.println("Enter your choice : ");
		choice=sc.nextInt();
		switch(choice){
			case 1:
				area = (Math.PI*(r*r));
				System.out.println("Area of the circle is : "+area);
				break;
			case 2:
				area = l*b;
				System.out.println("Area of the rectangle is : "+area);
				break;
			case 3:
				area = a*a;
				System.out.println("Area of the rectangle is : "+area);
				break;
			default:
			 System.out.println("Area of choice unavailable");	
		}
	
	}
}