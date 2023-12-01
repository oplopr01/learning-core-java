
class graph{
    double x;
    double y;

    graph(double x, double y){
        this.x=x;
        this.y=y;
    }
   void updateX(double x){
        this.x=x;
    }
    void display(){
          System.out.println("the distence from x axis: "+x);
        System.out.println("the distence from y axis: "+ y);
    }

}
