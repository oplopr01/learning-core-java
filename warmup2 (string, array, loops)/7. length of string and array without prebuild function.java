
    // length of string without length method
	 void checkLength(String s1) {
		int i=0;
		
		try {

			while(true) {
				 System.out.println(s1.charAt(i));
				 i++;
			}	}
		catch(Exception e){
			System.out.println(i);
		}
				}


    // length of array without length keyword

     void checkLength(int arr[]) {
		int i=0;
		
		try {

			while(true) {
				 int a =arr[i];
				 i++;
			}	}
		catch(Exception e){
			System.out.println(i);
		}
				}