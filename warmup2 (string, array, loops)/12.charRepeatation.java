
// repeat char as number of time of next position digit
// exam-:   a2b2c3 --->aabbccc

static void charRepeataion(String s) {
	
	for(int i =0;i<s.length()-1;i=i+2) {
		char c = s.charAt(i);
		int num = s.charAt(i+1)-48;
		
		for(int j=0;j<num;j++) {
			System.out.print(c);
		}
		
	}
	
}