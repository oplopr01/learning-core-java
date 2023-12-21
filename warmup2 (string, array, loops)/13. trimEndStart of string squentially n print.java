


	  // remove end char then starting char sequencialy and print strings
// jspiders --> jspiders --> jspider --> spider --> spide -> pide --> pid -> id -> i
	  static void trimEndStartSwquentialy(String s) {
		  int l=0;
		  int r=s.length()-1;
		  System.out.println(s);
		  for(int i=0;i<=s.length();i++) {
			  if(i%2==0) {
				  r--;
			  }
			  else {
				  l++;
			  }
			  
			  String temp ="";
			  for(int j =i; j<=r;j++) {
				  temp = temp + s.charAt(j);
			  }
			  System.out.println(temp);
		  }
	  }