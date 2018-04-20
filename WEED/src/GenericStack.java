public class GenericStack<E> {
    private java.util.ArrayList<E> stack;

    public GenericStack(){
        stack = new java.util.ArrayList<E>();
    }
    public E getSize(int index){
        return stack.get(index);
    }
    public int peek(){
        return stack.size();
    }
    public E pop(){
        return stack.get(stack.size()-1);
    }
    public void push(E o){
        stack.add(o);
    }
    public boolean isEmpty(){
        return !(stack.size()==0);
    }

    public static void main(String[]args){
        
    }
}
