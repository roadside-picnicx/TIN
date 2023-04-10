package priklad6;



public class Main {
    public static void main(String[] args) {
        Board b1 = new Board();
        System.out.println("Zaciatok: "+ b1);
        b1.move(Board.LEFT);
        System.out.println("Posun dolava: "+b1);
        b1.move(Board.UP);
        System.out.println("Posun hore: " + b1);

    }
}
