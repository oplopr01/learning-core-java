package GPSlocation;

 class GPSlocation {
    double latittude;
    double longitude;
    String direction;
    GPSlocation(double latittude,double longitude, String direction){
        this.latittude=latittude;
        this.longitude=longitude;
        this.direction=direction;
    }
    void updatelongitude(double longitude){
        this.longitude=longitude;
    }    
    void updatelatittude(double latittude){
        this.latittude=latittude;
    }
    void updatedirection(String direction){
        this.direction=direction;
    }
    void display(){
        System.out.println("value of latittude: " + latittude);
        System.out.println("value of longitude: " + longitude);
        System.out.println("value of direction: " + direction);
    }
}

 class mainGPSlocation {
    public static void main(String[] args) {
        GPSlocation coordinate1= new GPSlocation(4454.25,5555.444,"north");
        coordinate1.display();
        System.out.println("after updating value via update function....");
        coordinate1.updatelongitude(666.65);
        coordinate1.updatelatittude(776.65);
        coordinate1.updatedirection("south-east");
        coordinate1.display();

        GPSlocation coordinate2= new GPSlocation(10, 12, "south");
        System.out.println("\n");
        System.out.println("Values for coordinate2....");
        coordinate2.display();

        


    }
    
}