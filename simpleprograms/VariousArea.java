class VariousArea{
  public static void sqArea(){
    float a=5.6f,sqarea;
	sqarea=a*a;
	System.out.println("Area of Square is : "+sqarea);
    }
  public static void recArea(){
    float b=7.8f,c=6.5f,recarea;
	recarea=b*c;
    System.out.println("Area of Rectangle is : "+recarea);
    }
  public static void triArea(){
    float d=13.7f,e=8.4f,triarea;
	triarea=(d*e)/2;
	System.out.println("Area of Triangle is : "+triarea);
	}
  public static void main(String args[]){
    VariousArea.sqArea();
    VariousArea.recArea();
	VariousArea.triArea();
  }
}