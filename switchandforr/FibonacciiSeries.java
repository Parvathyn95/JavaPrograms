class FibonacciiSeries{
	public static void main(String args[]){
		int fir=0,sec=1,fib;
		System.out.print(fir);
		System.out.print(" ");
		System.out.print(sec);
		for(int i=1;i<=6;i++){
			fib=fir+sec;
			fir=sec;
			sec=fib;
			System.out.print(" ");
			System.out.print(fib);
		}
	}
}