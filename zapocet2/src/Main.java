import java.util.List;

public class Main {
    public static void main(String[] args) {
        MojList list = new MojList ();
        list.addLast(0);
        list.addLast(5);
        list.addLast(9);
        list.addLast(2);
        list.addLast(0);
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.print(list);
        list.reversePrint(list);
    }
}