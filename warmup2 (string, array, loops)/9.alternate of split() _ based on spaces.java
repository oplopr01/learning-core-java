
// code to work done smilar to string method

static void customSplit(String s) {
		//LOGIC is first find number of spaces bcoz spaceCount+1 will be size of our array
//		to create string by iterating each char of sentance if we fount any space in sentance
		// then push that created string into array then again create string and push if we get space
		int space =0;
		// finding number of spaces in string bcoz lenth of array = space+1
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				space++;
			}
		}
		
		String arr[]= new String[space+1];
		String s2 = "";
		int k=0;
//		 s= s+" ";   // ---------(1)  comment out this point 1 or below point2 after else block
		for(int i=0;i<s.length();i++) {
			// if we get space in sentance then push string  created by below else block
			if(s.charAt(i)==' ') {
				arr[k] = s2;
				k++;
				s2="";
			}
			else {
				s2 = s2+s.charAt(i);
			}
			arr[k] = s2;   // -----(2)
		// yha 509 extra line is liye kyoki, last wala string banega to but arr me push nhi hoga
		}
		// iterating through new string array
		for(String ele : arr) {
			System.out.println(ele);
		}
	
	
	}