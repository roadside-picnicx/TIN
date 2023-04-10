package priklad3;

public class List {
    private Node first;
    private Node last;

    public void addFirst(int data){     //pridanie na zaciatok
        Node n = new Node(data);
        if (first == null){
            last = n;
        }
        n.setData(data);
        n.setNext(first);
        n.setPrev(null);
        first = n;


    }
    public void addLast(int data){      //pridanie na koniec
        if (first == null){
            first = new Node(data);
            last = first;
            return;
        }
        Node n = last;
        Node newNode = new Node(data);
        n.setNext(newNode);
        newNode.setPrev(n);
        last= newNode;

    }

    public void removeFirst(){
        if (first == null)
            return;
        first = first.getNext(); //prepise first na nasledujucu first
    }

    public void removeLast() {
        if (first == null)
            return;
        Node n = last;
        n.getPrev().setNext(null);
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
