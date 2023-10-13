import java.util.*;

// public class javaPractice {
//     public static void main(String[] args){
//         int[] array1 = {
//             1789, 2035, 1899, 1456, 2013, 
//             1458, 2458, 1254, 1472, 2365, 
//             1456, 2165, 1457, 2456};

//     String[] array2 = {
//                 "Java",
                
//                 "Python",
//                 "PHP",
//                 "C#",
//                 "C Programming",
//                 "C++"
//             };  
//            Arrays.sort(array1);
//            System.out.println("Sorted arrays is: "+ Arrays.toString(array1));
           
//            Arrays.sort(array2);
//            System.out.println("Sorted arrays is: "+ Arrays.toString(array2));
//     }
// }



// public class javaPractice {
//     public static void main(String[] args){

//         int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int sum =0;
//         for(int x: my_array){
//             sum +=x;

//         }
//         System.out.println(sum);

//     }
// }



// public class javaPractice {
//     public static void main(String[] args){

//         for(int i =1;i<=10;i++){
//             for (int j = 1; j<=10;j++){
//                 System.out.print(" - ");
//             }
//             System.out.println();
//         }

//     }
// }


// public class javaPractice {
//     public static void main(String[] args){

//         int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         float sum =0;
//         for(int x: my_array){
//             sum +=x;

//         }
//         System.out.println(sum/my_array.length);

//     }
// }


public class javaPractice {
    public static void main(String[] args){

        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
       for(int i = 0; i<my_array.length-1;i++){
        my_array[i] = my_array[i+1];
       }
        System.out.println(Arrays.toString(my_array));

    }
}
