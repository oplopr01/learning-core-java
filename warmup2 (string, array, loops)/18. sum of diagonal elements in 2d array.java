


// sum of diagonal elements of 2d array
	static void diagonalSum() {
		Scanner ip = new Scanner(System.in);
		System.out.println("put length of row and cols: ");
		int row=ip.nextInt();
		int col=ip.nextInt();
		int arr[][]=new int[row][col];
		
		System.out.println("enetr values in : " + row + " and "+ col+"format");
		for(int i =0; i< row;i++) {
			for(int j =0; j<col; j++) {
				
				arr[i][j]= ip.nextInt();
			}
		}
		
		int rightDiagonal =0;
		int leftDiagonal =0;
		
		for(int i =0; i<arr.length;i++) {
		
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
				if(i==j) {
					leftDiagonal = leftDiagonal + arr[i][j];
				}
				
				if(i+j == row-1) {
					rightDiagonal = rightDiagonal + arr[i][j];
				}
				
			}
			System.out.println();
		}
		System.out.println("rightDiagonal: "+ rightDiagonal);
		System.out.println("leftDiagonal: "+ leftDiagonal);
		
	}
