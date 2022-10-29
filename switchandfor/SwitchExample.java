class SwitchExample{
	public static void main(String args[]){
		char vowel='j';
		switch(vowel){
			case 'a':
			System.out.println("It's a vowel");
			break;
			case 'e':
			System.out.println("It's a vowel");
			break;
			case 'i':
			System.out.println("It's a vowel");
			break;
			case 'o':
			System.out.println("It's a vowel");
			break;
			case 'u':
			System.out.println("It's a vowel");
			break;
	/*		case 'A':
			System.out.println("It's a vowel");
			break;
			case 'E':
			System.out.println("It's a vowel");
			break;
			case 'I':                                      // If we try to check an uppercase vowel as well to print it correct,add these
			System.out.println("It's a vowel");            //5 more cases as switch statements are case-sensitive.
			break;
			case 'O':
			System.out.println("It's a vowel");
			break;
			case 'U':
			System.out.println("It's a vowel");
			break;*/
			default:
			System.out.println("It's a consonant");
			break;
		}	
	}
}