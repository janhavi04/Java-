/**
 * arrayPractice
 */
public class arrayPractice {

    public static void main(String[] args){
/*****************FIRST SET******************* */
        // int A[] = {3,9,7,8,12,6,15,5,4,10};
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
            // int max1 = A[0], max2 = A[0];

            // for(int i = 0; i<A.length; i++){
            //     if(A[i] >max1){
            //         max2 = max1;
            //         max1 = A[i];
                    
            //     }
            //     else if(A[i]> max2){
            //         max2 =A[i];
            //     }
                
            // }
            // System.out.println("Second largest element is "+ max2);




//***********Second SET********************** */



    //      int A[] = {5,9,6,10,12,7,3,5,4,2};
    //     int temp =A[0];
    //     int k = 5;
    

    //     for(int x:A)
    //             System.out.print(x+" ");
    //         System.out.println(" ");


    // //     // //   Rotating an array
    // //     // //   FOR LEFT SHIFT
    //     while(k>0){
    //         temp = A[0];
    //     for(int i =1; i<A.length;i++){ 
    //         A[i-1]= A[i];
            
    //     }
    //     A[A.length-1]=temp; 
    //     k--;
    // }
    //     for(int x:A)
    //             System.out.print(x+" ");
    //         System.out.println(" ");

        //FOR RIGHT SHIFT
        // int A[] = {5,9,6,10,12,7,3,5,4,2};
        //  int temp ;
        //  int k = 2;
     
         
        //     for(int x:A)
        //          System.out.print(x+" ");
        //      System.out.println(" ");
        // while(k>0){
        //     temp = A[A.length-1];
        // for(int i =A.length-1; i>0;i--){ 
        //     A[i] = A[i-1];

        //  }
        //   A[0] = temp;
        //  k--;
        // }

        //  for(int x:A)
        //        System.out.print(x+" ");
        // System.out.println(" ");
            
        //Inserting an element

        // int A[] = new int[10];
        
        // A[0] = 5;
        // A[1] = 9;
        // A[2] = 6;
        // A[3] = 10;
        // A[4] = 12;
        // A[5] = 7;

        // int n =6;
        // for(int i =0; i<n; i++){
        //     System.out.print(A[i]+ ",");

        // }
        // System.out.println(" ");

        // int x = 20;
        // int index = 2;

        // for(int i = n;i>index;i--){
        //     A[i] = A[i-1];
            
        // }


        // A[index] = x;

        //   for(int i =0; i<=n; i++){
        //     System.out.print(A[i]+ ",");

        // }

      //  DEleting an element

        int A[] = new int[10];
        
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        int n =6;

        for(int i =0; i<n; i++){
             System.out.print(A[i]+ " ");

         }
         System.out.println(" ");

         int index =1;

         for(int i =2;i<=5;i++){
            A[i-1] = A[i];
              System.out.print(A[i]+ " ");

         }
         System.out.println();

         for(int i =0; i<5;i++){
            System.out.print(A[i]+ " ");
         }


/*************SET THREE***************** */

            //int A[] = {8,6,10,9,2,15,44,52,25,17};
            //int B[] = new int[10];
            //Copying an Array
            // for(int x = 0;x<A.length; x++){
            //     B[x] = A[x];
            // }

            // for(int x :B){
            //     System.out.print(x + " ");
            // }

            //Reverse Copying an array

            // for(int i = A.length-1,j =0; i>=0; i--,j++){
              
            //             B[j]=A[i];
            // }
            // for(int x :B){
            //     System.out.print(x + " ");
            //  }
        //Increasing size of an Array

            // int A[] = {8,6,10,9,2};
            // int B[] = new int[2*A.length];
            //     System.out.println(A.length);

            // for(int i = 0 ; i<A.length;i++){
            //     B[i] = A[i];
            // }
            // A = B;
            // B = null;

            // // for(int x :B){
            // //     System.out.print(x + " ");
            // //   }
            // //   System.out.println(" ");

            //   System.out.println(A.length);

    }
}