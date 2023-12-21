
// sum of numbers present in a sentance
	static void sumOfNumPresentInSentance(String s) {
	
		String arr[] = s.split(" ");
		int n = 0;
		int sum = 0;
		for (String ele : arr) {
			if (ele.charAt(0) > '0' && ele.charAt(0) < '9') {
				 n= Integer.parseInt(ele);                                                                                                       n = Integer.parseInt(ele);
				sum = sum + n;
			}
		}
		System.out.println(sum);
	}