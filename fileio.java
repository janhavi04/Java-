import java.io.*;

public class fileio {

    public static void main(String[] args) throws Exception
    {
        
        // try(FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.txt");)
        // {
        
        // String str="Learn Java Programming.";
        
        // byte b[]=str.getBytes();
        
        // /*
        // //fos.write(str.getBytes());
        // for(byte x:b)
        //     fos.write(x);*/
        // //fos.write(b, 6, str.length()-6);
        
        // fos.write(b);
        
        // //fos.close();
        
        // }
        // /*catch(FileNotFoundException e)
        // {
        //     System.out.println(e);
        // }
        // catch(IOException e)
        // {
        //     System.out.println(e);
        // }*/


            //Reading from a file
         try(FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");)
        {
            // byte[] b =new byte[fis.available()];

            //  fis.read(b);
            //  String str = new String(b);
            //  System.out.println(str);

            int x;
            do{
                x = fis.read();
                if(x!=-1)
                System.out.print((char)x);
            }while(x!=-1);

        }
        
       
    }
    
}