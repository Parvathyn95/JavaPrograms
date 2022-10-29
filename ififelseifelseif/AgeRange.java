class AgeRange{
	public static void main(String args[]){
		int age=65;
		System.out.println("Age is : "+age);
		if(age>=0 && age<=1){
			System.out.println("New Born Baby");
		}
		else if(age>=2 && age<=10){
			System.out.println("Children");
		}
		else if(age>=11 && age<=18){
			System.out.println("Teenager");
		}
		else if(age>=19 && age<=50){
			System.out.println("Adult");
		}
		else{
			System.out.println("Senior Citizen");
		}
	}
}