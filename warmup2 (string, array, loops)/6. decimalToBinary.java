
//          that's how we change binary to decimal

// 12 -->    1       1       0       0          i  am applying same in my program
//         (8*1) + (4*1) + (2*0) + (1*0) 

static void binaryToDecimal(int n){
    int decimalNum =0;
    int reminder =0;
    int i =1;
    while(n!=0){
        rem = n%10;
        sum =  sum + (i*rem);
        n= n/10; 
        i= i*2;
    }
    System.out.println(sum);
}