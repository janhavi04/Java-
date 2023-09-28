/**
 * twoDArray
 */
public class twoDArray {

    public static void main(String[] args){

        //int A[][] = new int [5][5];

        //int B[][] = {{1,2,3},{2,4,6},{1,3,5}};

        // int C[][];
        // C =new int[5][5];

        // int [][]D= new int[5][5];

        // int [] E, F[]; // E is 1D but F is 2D array

        // E = new int [5];
        // F = new int [5] [5];    

        // int [] G,H,I,J; //Multiple single dimensional array
        
        // for(int i = 0; i <B.length; i++){
        //     for(int j = 0; j<B[0].length; j++){
        //         System.out.print(B[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        // //for each loop

        // for(int x[]:B){
        //     for(int y : x){
        //         System.out.print(y + "  ");
        //     }
        // }


        //JAGGED ARRAY

        // int A[][];
        // A = new int[3][];

        // A[0] = new int[5];
        // A[1] = new int [2];
        // A[2] = new int [3];

        // for(int x[] : A){
        //     for( int y : x){
        //         System.out.print(y + " ");
        //     }
        //     System.out.println("");
        // }



        /************STUDENT CHALLENGE*****************/

        //ADDING 2 MATRICES
            // int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
            // int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
            // int C[][] = new int [3][3];
            
            // for(int i =0; i<3; i++){
            //     for (int j =0; j<3;j++){
            //         C[i][j] = A[i][j] + B[i][j];
            //     }
            // }
    
            // for(int x[] : C){
            //     for (int y : x){
            //         System.out.print(y + " ");
            //     }
            //     System.out.println("");
            // }
        //MULTIPLYING 2 MATRICES

        //   int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        //   int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        //   int C[][] = new int [3][3];
            
        //     for(int i =0; i<3; i++){
        //         for (int j =0; j<3;j++){
        //             for(int k = 0; k<3;k++){
        //             C[i][j] = C[i][j]+A[i][k]* B[k][j];
        //             }
        //          }
        //     }
    
        //     for(int x[] : C){
        //         for (int y : x){
        //             System.out.print(y + " ");
        //         }
        //         System.out.println("");
        //     }
        //SORTING ARRAY OF STRINGS
            
        String arr[] = {"Java", "Python", "Pascal", "CPP","Basic","ADA"};

        java.util.Arrays.sort(arr);


        for(String x :arr){
            System.out.println(x + " ");
        }
    
    
    
    }
}