public class GamePieces<E> {
    private java.util.ArrayList<E> pieces;

    public GamePieces(){
        pieces = new java.util.ArrayList<E>();
    }
    public E getPieces(int index){
        return pieces.get(index);
    }
    public int numOfPieces(){
        return pieces.size();
    }
    public void addPiece(E o){
        pieces.add(o);
    }
    public boolean hasPieces(){
        return !(pieces.size()==0);
    }

    public static void main(String[]args){
        GamePieces<String> monsters = new GamePieces<String>();
        System.out.println(monsters.hasPieces());
        monsters.addPiece("Banana Handler");
        monsters.addPiece("Werewolf");
        System.out.println(monsters.hasPieces());
        System.out.println(monsters.getPieces(1));
    }
}
