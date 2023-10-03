//this

class Rectangle{
    int length;
    int breadth;
    int x =10;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
        
    }

    void display(){
        System.out.println("Length: " +this.length);
        System.out.println("Breadth: " +this.breadth);
    }
}

class Cuboid extends Rectangle{
    int height;
    int x =20;
    Cuboid(int l, int b, int h){
        super(l,b);
        height = h;
    }

    void display(){
        System.out.println("Super: "+super.x);//this is will print x from the super class(parent class) rectangle
        System.out.println("This: "+this.x);// this will print its own x i.e present in the cuboid class
        System.out.println("X: "+x);
    }
    
}
class thisVsSuper{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(10, 5);
       // r1.display();

        Cuboid c1 = new Cuboid(10, 20, 15);
        c1.display();
    }
}