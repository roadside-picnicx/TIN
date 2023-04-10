package priklad2;


import java.util.HashSet;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Board b1 = new Board();
        //System.out.println("Zaciatok: "+ b1);
        b1.move(Board.UP);
        System.out.println(b1);

        Board b2 = new Board();
        b2.move(Board.UP);        // toto zmenit a bude alebo nebude sa to rovnat
        System.out.println(b2);

        TreeSet<Board> mnozina = new TreeSet<>();
        mnozina.add(b1);
        mnozina.add(b2);

        System.out.println("Tree set");
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b1));
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));

        System.out.println(mnozina.size());


        HashSet<Board> mnozina2 = new HashSet<>();
        mnozina2.add(b1);
        mnozina2.add(b2);

        System.out.println("Hash set");
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b1));
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));

        System.out.println(mnozina2.size());
    }

}

