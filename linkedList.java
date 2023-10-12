import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class linkedList{
    public static void main(String[] args){
        
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);

        al1.addFirst(3);
        al1.addLast(23);
        al1.peek();
        
        
        for(int i = 0;i<al1.size();i++){
    System.out.println(al1.get(i));
   }
   //using lambda expression
   al1.forEach((x)->{
   System.out.println(x);

   });


    }
}