package priklad2;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.print(list);
        System.out.println("Removing first value");
        list.removeFirst();
        list.print(list);

        if (list.isEmpty())
            System.out.println("The list contains a value");
        else
            System.out.println("The list is empty");

        System.out.println("Obsahuje 4 ? : "+list.containsData(4));
        System.out.println("Obsahuje 3 ? : "+list.containsData(3));


    }
}