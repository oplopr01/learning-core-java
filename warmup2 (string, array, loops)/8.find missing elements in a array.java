//missing element in array under Nth value
	
	static void missElem(int ar[], int n) {
		for(int i =1; i<n;i++) {
			boolean flag = true;
			for (int j = 0; j < ar.length; j++) {
				if(ar[j] == i) {
					flag = false;
					break;
				}
				
			}
			if(flag == true) {
				
				System.out.println(i);
			}
			
		}
	}