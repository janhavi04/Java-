// class generics<T>
// {
//     T data[] = (T[]) new Object[3];
//     public static void main(String [] args){
//     //     Object obj = new String("Hello");

//     //    // obj = new Integer(10);

//     //     String str = (String)obj;
//     //     System.out.println(str);


//         //Array of object

//         // Object obj[] = new Object[3];
//         // String s[] = new String[];
      

//         // obj[0] = "HI";
//         // obj[1] = "Welcome";
//         // obj[2] =new Integer(10);


//         // String str;
//         // for(int i =0; i<3; i++){
//         //     str = (String)obj[i];
//         //     System.out.println(str);
//         // }

//         generics<String> gd = new generics<>();
//         gd.data[0] = "hi";
//         gd.data[1] = "hello";
//         gd.data[2] = "12";

//         String str = gd.data[0];


//     }
// }

/**
 * generics
 */
// class Data <T> // generic class
//  {
//     private T obj;
//     public void setData(T v){
//         obj =v ;
//     }

//     public T getData(){
//         return obj;
//     }

//  }
//Class for array:
@SuppressWarnings("unchecked")
class A{}
class B extends  A{}
class C extends B{}
class MyArray<T>

{
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v){
        A[length++] = v;
    }
    public void display(){
        for(int i =0; i<length;i++){
            System.out.println(A[i]);
        }
    }
    }
public class generics
{
    // generic methods
    static void fun(MyArray<? super C> obj){
        obj.display();
        
    }

    public static void main(String [] args){
        // Data <Integer> d = new Data<>();
        // d.setData(10);

        // System.out.println(d.getData());

        // MyArray ma = new MyArray<>();
        // ma.append(10);
        // ma.append(25);
        // ma.append(45);
        // ma.display();

        // show(new String[] {"Hi","BYE","Go"});
        // show(10,20,30,30);
        
         MyArray <B> ma1 = new MyArray<>();
        
         MyArray <C> ma2 = new MyArray<>();
        

         fun(ma1);
         fun(ma2);

    }
}