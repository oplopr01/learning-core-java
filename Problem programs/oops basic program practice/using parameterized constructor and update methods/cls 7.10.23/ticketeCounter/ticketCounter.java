package ticketeCounter;

 class ticketCounter {
    int availableTeckets;
    ticketCounter(int availableTeckets){
        this.availableTeckets=availableTeckets;
    }
    
    void buyTicket(int n){
        if(availableTeckets>n){
            System.out.println("you have booked "+availableTeckets);
            availableTeckets-=n;
        }
        else{
            System.out.println("sorry to inform you that you are trying to book "+n+" teckets but only"+availableTeckets+" left here");
        }
    }
    void cancelTicket(int n){
        if(availableTeckets>=n){
            System.out.println("your tickete canceled");
            availableTeckets+=n;
        }
    }
    void viewTecket(){
        System.out.println("total tickete left: "+availableTeckets);
    }

}

class mainTicketeCounter{
    public static void main(String[] args) {
        ticketCounter movie1= new ticketCounter(50);
        movie1.viewTecket();
        movie1.buyTicket(25);
        movie1.viewTecket();
        movie1.cancelTicket(5);
        movie1.viewTecket();
    }
}