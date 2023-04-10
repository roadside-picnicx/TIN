package priklad2;

public class List {
    private Node first;  //oznacuje prvy uzol


    public void addFirst(int data){
        if (first == null){                 //vytvori novy prvy uzol
            Node n = new Node(data);
            n.setData(data);
            first = n;
        }
        else {
            Node n = new Node(data);
            n.setData(data);
            n.setNext(first);
            first = n;
        }

    }

    public void removeFirst(){
        if (first == null)
            return;
        first = first.getNext(); //prepise head na nasledujucu first
    }

    public boolean isEmpty(){        //zistime ci list obsahuje hodnotu
        if(first != null)
            return true;
        return false;
    }

    public boolean containsData(int data) {     // zisti ci obsahuje konkretnu hodnotu
        Node node = first;
        if (node.getData() == data)
            return true;

        while (node.hasNext()) {
            if (node.getData() == data)
                return true;
            node = node.getNext();
        }
        return false;
    }
        public void print(List list){
        Node n = list.first;
        System.out.println("List :");
        int counter= 1;
        while (n != null){
            System.out.println("[Node number]: "+ counter + " [Data]: " +n.getData() + " ");
            n = n.getNext();

            counter++;
        }
    }
}
