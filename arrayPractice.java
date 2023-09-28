/**
 * arrayPractice
 */
public class arrayPractice {

    public static void main(String[] args){

        int A[] = {3,9,7,8,12,6,15,5,4,10};
        //int sum = 0;
        //int key =115;
        //int max = A[0];

        //for(int i =0; i<A.length;i++){
           // sum += A[i];//SUm of all elements
           //if(key == A[i]){ //Searching an element
           // System.out.println("Element found at  "+ (i+1) + " position");
            //System.exit(0); // for exiting from the program
           // }
           
      //  }
        //System.out.println("Not Found");     
        
        //Finding maximum element
        // for(int i =0; i<A.length; i++){
        //     if(A[i]>max){
        //         max = A[i];
        //     }

        // }
        // System.out.println("Maximum Element is " + max);

        //Finding second maximum element
            int max1 = A[0], max2 = A[0];

            for(int i = 0; i<A.length; i++){
                if(A[i] >max1){
                    max2 = max1;
                    max1 = A[i];
                    
                }
                else if(A[i]> max2){
                    max2 =A[i];
                }
                
            }
            System.out.println("Second largest element is "+ max2);

    }
}