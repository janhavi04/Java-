
class swap{

    public static void main(String args[]){
        int a=9,b=12;
        
        int c;
        c = a<<4;
        c = c|b;

        System.out.println((c&0b11110000)>>4);
         System.out.println(c&0b11110000);
    
    }
    
    
    
    }