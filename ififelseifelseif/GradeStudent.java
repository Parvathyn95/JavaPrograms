class GradeStudent{
	public static void main(String args[]){
		int marks=39;
		if(marks>=90 && marks<=100){
			System.out.println("Secured Grade A");
		}
		else if(marks>=80 && marks<=89){
			System.out.println("Secured Grade B");
	    }
		else if(marks>=70 && marks<=79){
			System.out.println("Secured Grade C");
		}
		else if(marks>=60 && marks<=69){
			System.out.println("Secured Grade D");
		}
		else if(marks>=50 && marks<=59){
			System.out.println("Secured Grade E");
		}
		else{
			System.out.println("Result Failed");
		}
	}
}