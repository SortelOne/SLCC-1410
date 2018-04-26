public class GenericStack<E> {
    private java.util.ArrayList<E> stack;

    public GenericStack(){
        stack = new java.util.ArrayList<E>();
    }
    public int getSize(){
        return stack.size();
    }
    public E peek(){
        return stack.get(stack.size()-1);
    }
    public E pop(){
        return stack.remove(stack.size()-1);
    }
    public void push(E o){
        stack.add(o);
    }
    public boolean isEmpty(){
        return (stack.size()==0);
    }

    public String toString(){
        String kelson = "";
        for(E garrett: stack){
            kelson += garrett.toString()+"\n";
        }
        return kelson;
    }

    public static void main(String[]args){
        GenericStack<String> stackThingy = new GenericStack<String>();
        stackThingy.push("Klesoron");
        stackThingy.push("Grandma Blats");
        stackThingy.push("Garrett");
        stackThingy.push("Sean");
        if(!stackThingy.isEmpty())
            stackThingy.pop();
        System.out.println(stackThingy);
        stackThingy.push("Master Windu");
        stackThingy.push("Ryan");
        stackThingy.push("Arbitraty human name");
        if(!stackThingy.isEmpty())
            stackThingy.pop();
        System.out.println(stackThingy);
        System.out.println(stackThingy.peek());
        System.out.println(stackThingy.isEmpty());
        System.out.println(stackThingy.getSize());
    }
}
