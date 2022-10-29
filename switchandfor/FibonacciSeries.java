class FibonacciSeries{
		public static void main(String args[]){
				int fir=0,sec=1,fib,n=6;
				System.out.print(fir);
				System.out.print(" ");
				System.out.print(sec);
				for(int i=2;i<n;i++){
					fib=fir+sec;
					fir=sec;
					sec=fib;
					System.out.print(" ");
					System.out.print(fib);					
				}		
		}
}

































