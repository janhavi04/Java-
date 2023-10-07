// //Wrapper class

// class langPackage{
//     public static void main(String [] arg){
    
//       Integer i = Integer.valueOf(10);
//       Integer b =10;


//       Byte c = 14;
//       Byte d = Byte.valueOf("15");

//       System.out.println(d);
//       byte bb =15;
//       Byte e = Byte.valueOf(bb);

//       Short f = Short.valueOf("123");

//       Float g =12.3f;
//      //Float h = Float.valueOf("123.5");

//       Double l = 1452.23;
//       Double j = Double.valueOf(152.2);

//       Character k = Character.valueOf('A');
//       Boolean m = Boolean.valueOf("false");


//       Float h = Float.valueOf("123.5");
//        float x = h.floatValue();// Unboxing: from an object we are getting a primitive
//       float y = h; //Autounboxing


//       int m1 =10;
//         Integer n1 = m1; //Boxing : Converting a primitive in an object

//         int p1 = n1.intValue(); //Unboxing: getting a primitve from an object




//         //A primitve is assigned to an object autoboxing

//         int b0 =15; //primitive
//         Integer b1 = b0; //assigning it to an object
//         System.out.println("Object value is "+b1);

//        // Object is assigned to a primitive is auto unboxing
//         Integer a0 = Integer.valueOf(10); //object
//         int a1 = a0; //assigning to a primitive
//         System.out.println("Primitve value of a1:" + a1);


//     }
// }




// class langPackage{
//    public static void main(String [] arg){
    
//     // float a =12.5f;
//     // Float b = (float)Math.sqrt(-1);

//     // System.out.println(Float.NaN!=Float.NaN);

//     Character a = '2';
//     System.out.println(Character.isDigit(a));

  



//    }}


   //StringBuffer StringBuilder

//    class langPackage{
//    public static void main(String [] arg){

    // String s1 = new String("Hello");

    // StringBuffer s2 = new StringBuffer("Hello");

    // StringBuilder s3 = new StringBuilder("Hello");


    // s1.concat(" World");
    // s2.append(" World");
    // s3.append(" World");

    // System.out.println(s1);
    // System.out.println(s2);
    // System.out.println(s3);


    //ENUM

    enum dept{
        CS("John", "Block A"),IT("Smith" , "Block B"),CIVIL("Roy","Block C"),ETC("Ray", "Block D");

        String head;
        String location;

        private dept(String head, String location){
           this.head = head;
           this.location=location;
        }

        public String getheadName(){
            return head;
        }
        public String getLocation(){
            return location;
        }

        // public void display(){

        //     System.out.println(this.name() + " "+this.ordinal());

        // }
    }
    class langPackage{
   public static void main(String [] arg){
    dept d = dept.CS;
    System.out.println(d.getheadName());
    System.out.println(d.getLocation());

    // dept list[] = dept.values();
    // for(dept x : list)
    //     System.out.print(x);
    // System.out.println(dept.valueOf("IT"));

    // switch(d){

    //     case CS:
    //         System.out.println("Head: John \nBlock :A");
    //         break;

        
    //     case IT:
    //         System.out.println("Head: Smith \n Block :B");
    //         break;
        
    //     case CIVIL:
    //         System.out.println("Head: Roy \n Block :C");
    //         break;
        
    //     case ETC:
    //         System.out.println("Head: Ryan \nBlock :D");
    //         break;
    // }

   }
}
