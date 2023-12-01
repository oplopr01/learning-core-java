
// Java program to add all user input custom numbers


public static void main(String[] args) {
	
		Scanner ip = new Scanner(System.in);
		System.out.println("How many integers will be added:");
		int n = ip.nextInt();
		int count =0;
		int num;
		for(int i =1;i<=n;i++) {
			System.out.println("Enter an integer: ");
			num = ip.nextInt();
			count = count + num;
		}
		System.out.println(count);
		
		
	}