package bankBalance;

 class Bankbalance {
    double totalbalance;
    double balancecount;
    Bankbalance(double totalbalance, double balancecount){
        this.totalbalance=totalbalance;
        this.balancecount=balancecount;
    }

    void deposit(double n){
        // balancecount=n;
        totalbalance=totalbalance+n;
        
    }
    void withdraw(int n){
        if(totalbalance>n){
            totalbalance=totalbalance-n;

        }
        else{
            System.out.println("you do not have sufficient balance");
        }
    }
    void viewbalance(){
        System.out.println("your total balance is: "+totalbalance);
    }

}
class mainBankbalance{
    public static void main(String[] args) {
        Bankbalance user1= new Bankbalance(4500,0);
        user1.viewbalance();
        user1.withdraw(200);
        user1.viewbalance();
    }
}