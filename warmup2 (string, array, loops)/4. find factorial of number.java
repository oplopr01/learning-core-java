
public static void main(String[] args) {
	
		Scanner ip = new Scanner(System.in);
		System.out.println("How many integers will be added:");
		int n =ip.nextInt();
		long fact=1;
		if(n>=0) {
			while(n>0) {
				fact = fact*n;
				n=n-1;
				}
			System.out.println(fact);
		}
		else {
			System.out.println("N must be zero or Greater: ..");
		}
		

}