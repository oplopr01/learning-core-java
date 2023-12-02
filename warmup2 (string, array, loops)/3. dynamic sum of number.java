
// sum till the given limit of user separatly odd numbers, and even numbers 


public static void main(String[] args) {
	
		Scanner ip = new Scanner(System.in);
		System.out.println("How many integers will be added:");
		int count =0;
		int sumAll=0;
		int sumOdd=0;
		int sumEven=0;
		int n = ip.nextInt();
		
		while(count<=n) {
			
			sumAll = sumAll + count;
			if(count%2==0) {
				sumEven = sumEven +count;
			}
			else {
				sumOdd = sumOdd+count;
		
			}
			count = count +1;
		}
	
		 System.out.print  ( "Sum of all : " + sumAll  );
		    System.out.print  ( "\n Sum of even: " + sumEven );
		    System.out.println( "\t Sum of odd : " + sumOdd  );
		
	}