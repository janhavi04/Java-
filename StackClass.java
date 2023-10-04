//Exception when Stack is Full
class StackOverflow extends Exception{

    public String toString(){
       return "Stack is Full";
    }
}
//Exception when Stack is Empty
class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}
class Stack{

    private int size;
    private int top = -1;
    private int S[];

    public Stack(int sz)//COnstructor
    {
        size =sz;
        S = new int[sz];
    }
    public void Push(int x)throws Exception
    {
        if(top == size-1)
            throw new StackOverflow();
        top++;

    }

    public int Pop()throws Exception
    {
       int x = -1;
       if(top ==-1)
        throw new StackUnderflow();
        x =S[top];
        top--;
        return x;

    }
}

public class StackClass {

     static public void main(String[] args) throws Exception{
        Stack st = new Stack(5);
        try
        {
            st.Push(12);
            st.Push(12);
            st.Push(12);
             st.Pop();
        st.Pop();
        st.Pop();
            st.Push(12);
            st.Push(12);
            st.Push(12);
        st.Pop();
        st.Pop();
        st.Pop();
        st.Pop();

                

        }

        catch(StackUnderflow s){
            System.out.println(s);
        }
        catch(StackOverflow s){
            System.out.println(s);
        }

    }
}