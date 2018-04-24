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
        GenericStack<String> stackThingy = new GenericStack<String>();
        System.out.println(stackThingy.isEmpty());
        stackThingy.push("Klesoron");
        stackThingy.push("Grandma Blats");
        stackThingy.push("Garrett");
        stackThingy.push("Sean");
        stackThingy.push("Master Windu");
        stackThingy.push("Ryan");
        stackThingy.push("Arbitraty human name");
        stackThingy.pop();
        System.out.println(stackThingy.peek());
        System.out.println(stackThingy.isEmpty());
        System.out.println(stackThingy.getSize(1));
    }
}
