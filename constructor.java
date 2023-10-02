
class Cylinder{
    private double radius;
    private double height;

     public Cylinder() //Non parameterized Constructor
     {
        radius =1;
        height =1;
    }
    public Cylinder(int r)//Parameterized Constructor
    {
        radius = r;
        height =1;
    }
    public Cylinder(int r,int h)//Parameterized Constructor
    {
        radius =r;
        height =h;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(int r){
        if(r>=0)
        radius = r;
        else
        radius = 0;
    }

      public double getHeight(){
        return height;
    }

    public void setHeight(int h){
        if(height>0)
        height = h;
        else
        height = 0;
    }

    public void setDimensions(int r, int h){
        radius = r;
        height = h;
    }
   

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea(){
         return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){

        return lidArea()*height;

}
}
public class constructor
 {
    public static void main(String[] args){
       // Rectangle r = new Rectangle();


       Cylinder c = new Cylinder(10);
      c.setHeight(10);
      c.setRadius(7);
       c.setDimensions(10, 7);

       double lidArea = c.lidArea();
       double totalSurfaceArea = c.totalSurfaceArea();
       double volume = c.volume();

       System.out.println("Area of the cyclinder :" + String.format("%.2f", lidArea));
       System.out.println("Total Surface Area of the cyclinder :" + String.format("%.2f", totalSurfaceArea));
       System.out.println("Volume of the cyclinder :" + String.format("%.2f", volume));
       System.out.println("Height: "+ c.getHeight());
       System.out.println("Radius : "+ c.getRadius());

    }
    
}

