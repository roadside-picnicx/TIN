
public class MojList {
        private Uzel first;
        private Uzel last;

        private Uzel rodic = new Uzel(0);


        public void addLast(int data){      //pridanie na koniec
            if (first == null){
                first = new Uzel(data);
                last = first;
                return;
            }
            Uzel n = last;
            Uzel newNode = new Uzel(data);
            n.setNext(newNode);
            newNode.setPrev(n);
            n.setRod(rodic);
            last= newNode;

        }

        public void print(MojList list){
            Uzel n = list.first;
            System.out.println("Rodic je:" + list.rodic.getData());
            System.out.println("List :");
            int counter= 1;
            while (n != null){
                System.out.println("[Node number]: "+ counter + " [Data]: " +n.getData() + " ");
                n = n.getNext();

                counter++;
            }
        }

    public void reversePrint(MojList list){
        Uzel n = list.last;
        System.out.println("rodic je:" + list.rodic.getData());
        System.out.println("List :");
        int counter= 1;
        while (n != null){
            System.out.println("[Node number]: "+ counter + " [Data]: " +n.getData() + " ");
            n = n.getPrev();

            counter++;
        }
    }


}


