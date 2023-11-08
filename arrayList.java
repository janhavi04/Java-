// import java.util.*;



// class arrayList{
//     public static void main(String [] args){

//         ArrayList<Integer> al1 = new ArrayList<>();
//         ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
        
//         al1.add(10);
//         al1.add(0,5);
//         al1.addAll(1,al2);

        


//    for(int i = 0;i<al1.size();i++){
//     System.out.println(al1.get(i));
//    }
//    //using lambda expression
//    al1.forEach((x)->{
//    System.out.println(x);

//    });


// //using iterator

// Iterator <Integer> it = al1.iterator();


// while(it.hasNext()){
//     System.out.println(it.next());
// }


// //Using LIstIterator

// ListIterator <Integer> it1 = al1.listIterator();


// while(it.hasNext()){
//     System.out.println(it1.next());
// }



//     }
// }




import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * arrayList
 */
public class arrayList {

    //LIST
    List list = new ArrayList();
    list.add(20);
    System.out.print(list);

    
}