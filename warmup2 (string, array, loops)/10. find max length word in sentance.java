
// find max length string in a sentance
	static void finLongestString(String s) {
	String s2[] = s.split(" ");
		int max = s2[0].length();
		String ans =s2[0];
		for(String ele : s2) {
			if(max< ele.length()) {
				max=ele.length();
				ans = ele;
						}
		}
		System.out.println(ans);
	}
