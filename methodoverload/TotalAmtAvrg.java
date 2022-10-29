class TotalAmtAvrg{
	float av1,av2;
	public TotalAmtAvrg(){
	
	}
	public TotalAmtAvrg(float av1,float av2){
		this.av1=av1;
		this.av2=av2;
	}
	public float totalAmount(){
		float totalAmount=av1+av2;
		System.out.println("Total amount of the average of 3 integer and 3 float values are : "+totalAmount);
		return 0;
		
	}

	public float avrg(int a,int b,int c){
		return(a+b+c)/3;
	}
	public float avrg(float a,float b,float c){
		return(a+b+c)/3;
	}
	public static void main(String args[]){
		TotalAmtAvrg obj = new TotalAmtAvrg();
		float v1 = obj.avrg(10,20,30);
		float v2 = obj.avrg(10.5f,20.5f,20.5f);
		System.out.println("Average of 3 integer values is : "+obj.avrg(10,20,30));
		System.out.println("Average of 3 float values is : "+obj.avrg(10.5f,20.5f,20.5f));
		TotalAmtAvrg obj1 = new TotalAmtAvrg(v1,v2);
		obj1.totalAmount();
		
	}
}