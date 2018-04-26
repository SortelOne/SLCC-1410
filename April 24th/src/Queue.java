import java.util.ArrayList;

public class Queue<E> {
    private java.util.ArrayList<E> myList;

    public Queue(){
        myList = new java.util.ArrayList<E>();
    }

    public int getSize(){
        return myList.size();
    }

    //make different somehow \|/
    public E peek(){
        return myList.get(0);
    }

    public E dequeue(){
        return myList.remove(0);
    }

    public void enqueue(E o){
        myList.add(o);
    }

    public boolean isEmpty(){
        return (myList.size()==0);
    }

    public String toString(){
        String ryan = "";
        for(E sean: myList){
            ryan += sean.toString()+"\n";
        }
        return ryan;
    }
    
    public static void main(String[]args){
        Queue<String> stackThingy = new Queue<String>();
        stackThingy.enqueue("Nintendo Switch Games:");
        stackThingy.enqueue("Super Mario Odyssey");
        stackThingy.enqueue("LOZ: Breath of the Wild");
        stackThingy.enqueue("Mario Kart 8 Deluxe");
        if(!stackThingy.isEmpty())
            stackThingy.dequeue();
        System.out.println(stackThingy);
        stackThingy.enqueue("Octopath: Traveler");
        stackThingy.enqueue("Skyrim");
        if(!stackThingy.isEmpty())
            stackThingy.dequeue();
        System.out.println(stackThingy);
        System.out.println(stackThingy.peek());
        System.out.println(stackThingy.isEmpty());
        System.out.println(stackThingy.getSize());
    }
}
