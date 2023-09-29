/**
 * PatternQue
 */
public class PatternQue {

    public static void main(String[] args){

        // System.out.println("Printing column value");
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println("");
        // }
        // System.out.println("");
        
        
        // System.out.println("Printing row value");
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println("");
        // }
        //     System.out.println("");


        // System.out.println("Printing i+j");
        //  for(int i = 1;i<=5;i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print(i+j + " ");
        //     }
        //     System.out.println("");
        // }
        // System.out.println("");

        


        // System.out.println("Printing numbers from 1 to 25");
        //  int count = 0;
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.format("%02d " , ++count);
        //     }
        //     System.out.println("");
        // }
          //   System.out.println("");


           
           // System.out.println("Next pattern:");
            //1
            //1 2 
            //1 2 3
            //1 2 3 4
            //1 2 3 4 5
          
    //     for(int i = 1; i<=5 ; i++){
    //         for (int j = 1; j<=i;j++){
    //             System.out.print(j + " ");

    //         }
    //         System.out.println("");
    //     }
    //    System.out.println("");

            //1
            //2 3 
            //4 5 6 
            //7 8 9 10
            //11 12 13 14 15
          
        //     int count = 0;
        //      for(int i = 1; i<=5 ; i++){
                
        //     for (int j = 1; j<=i ;j++){
        //         count++;
        //         System.out.format("%02d " ,count);

        //     }
        //     System.out.println("");
        // }

            //  System.out.println("Printing *");
            //  for(int i = 1; i<=5 ; i++){
                
            // for (int j = 1; j<=i ;j++){
                
            //     System.out.print("*" + " ");
            // }
            //     System.out.println("");
            // }


                //1 2 3 4 5
                //1 2 3 4 
                //1 2 3 
                //1 2 
                //1



            //     int count = 0;
            //  for(int i = 1; i<=5 ; i++){
                
            // for (int j = 1; j<=5-i+1 ;j++){
            //     count ++;
            //     System.out.format("%02d " , count);
            // }
            //     System.out.println("");
            // }



            // for(int i = 1; i<=5 ; i++)
            // {
            //     for (int j = 1; j<=5 ;j++){
               
            //     if(i<=j)
            //         System.out.print(("* "));
            //     else    
            //         System.out.print("  ");
            // }
            //     System.out.println("");
            // }



            // for(int i = 1; i<=5 ; i++)
            // {
            //     for (int j = 1; j<=5 ;j++){
               
            //     if(i+j >5)
            //         System.out.print(("* "));
            //     else    
            //         System.out.print("  ");
            // }
            //     System.out.println("");
            // }



            //  for(int i = 1; i<=4 ; i++)
            // {
            //     System.out.print(" ");

            //     for (int j = 1; j<=4 ;j++){
               
            //     if(i<=j)
            //         System.out.print(("*"+ " "));
            //     else    
            //         System.out.print("  ");

            //     }

            //     for(int k = 1; k<=3; k++){
            //         if(i+k<5){
            //             System.out.print("* ");
            //         }
            //         else    
            //             System.out.print(" ");
            //     }
            //     System.out.println("");
            // }            
            
            

            //Hollow Rectangle

            
        // for(int i =1;i<=3;i++){
        //     for(int j = 1 ; j<=4 ; j++){
        //         if(i == 1 || i == 3 || j == 1 ||  j == 4){
        //             System.out.print("*");
        //         }
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println("");
       // }

        //Number Triangular

        // for(int i =1 ; i<=4 ; i++){
        //     for(int k = 1 ; k<=(4-i); k++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1; j<=i ; j++){
        //         System.out.print(i + " ");


        //     }
        //     System.out.println("");
        // }
       
        //NUmber Increasing Pyramid
        // for(int i =1 ; i<=4 ; i++){
          
        //     for(int j =1; j<=i ; j++){
        //         System.out.print(j + " ");


        //     }
        //     System.out.println("");
        // }


        //Number Increasing Reverse Pyramid 

        // int count = 0;
        // for(int i =1 ; i<=4 ; i++){
            
        //     for(int j =1; j<=4-count ; j++){
                
        //         System.out.print(j+" ");


        //     }
        //     count++;
        //     System.out.println("");
        // }

        //Number Changing Pyramid
        //     int count =0;
        //   for(int i =1 ; i<=4 ; i++){
          
        //     for(int j =1; j<=i ; j++){
        //         count++;
        //         System.out.print(count + " ");


        //     }
        //     System.out.println("");
        // }


        //Zero-One Triangle
        
        //  for(int i =1 ; i<=4 ; i++){
          
        //     for(int j =1; j<=i ; j++){
        //         if((i+j )%  2 == 0)
        //         System.out.print(1+ " ");
        //         else 
        //         System.out.print(0+" ");
        //     }

        //     System.out.println("");
        
        // }

    
    
    //Rhombus Pattern
    // int n = 6;
    // for(int i =n ; i>=1; i--){
    //     for(int k = 1; k<=(n-i); k++){
    //         System.out.print(" ");
    //     }
    //     for(int j =1; j<=n; j++){
    //         System.out.print("*"+" ");
    //     }
    //     System.out.println("");
    // }

    //Diamond Pattern
        // int  n =6;
        // for(int i =1; i<=n;i++){
        //     for(int k =1; k<=(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println("");
        // }

        // for(int i =n-1; i>=1;i--){
        //     for(int k =1; k<=(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println("");
        // }
        

        //K Pattern
        //     int n =6;
        // for(int i = 1 ; i<=n; i++){
        //     for(int j =n ; j>=i;j--){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println("");
        // }
        // for(int i = 2 ; i<=n; i++){
        //     for(int j =1 ; j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println("");
        // }


        //Mirror Image Triangle Pattern

        // int n= 6;
        //  for(int i =n ; i>=1; i--){
        //     for(int k = 1; k<=(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println("");
        // }
        // for(int i =2 ; i<=n; i++){
        //     for(int k = 1; k<=(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println("");
        // }
        
       
         //  Palindrome Triangular
    //    int n = 6;
    //         //outer loop for no. of rows
    //         for(int i =1; i<=n; i++){
    //             //for spaces
    //             for(int k = 1 ; k<= 2*(n-i);k++){
    //                 System.out.print(" ");

    //             }
    //             //innner loop part one
    //             for(int j =i ; j>=1 ; j--){
    //                 System.out.print(j+" ");
    //             }
    //             //inner loop part 2
    //             for(int j = 2; j<= i;j++){
    //                 System.out.print(j+ " ");
    //             }

    //           System.out.println(""); 
    //     }

       
        //Reverse left triangle
       
        // int  n =6;
        // for(int i =n; i>=1;i--){
        //       for(int k =1; k<=(n-i);k++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j =1; j<=i; j++){
        //         System.out.print("*");
        //     }
          
        //     System.out.println("");
        // }

        //Reverse Number Triangle Pattern

        int n =4;
        
        for(int i = 1; i<=n;i++){
            for(int k =1; k<i;k++){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print(j+ " ");    
            }
            System.out.println( "");
           
            
        }
        
 //Hollow Reverse Triangle
        
        // int n =6;

        // for(int i =n ; i>=1; i--){
        //             for(int k = 1; k<=(n-i); k++){
        //                 System.out.print(" ");
        //             }
        //             for(int j = 1; j<=i; j++){
        //                 System.out.print("*" + " ");
        //             }
        //             System.out.println("");
        //         }
                
       

}


}


    