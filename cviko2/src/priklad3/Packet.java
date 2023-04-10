package priklad3;

public class Packet {

        private String name;
        private Packet next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Packet getNext() {
        return next;
    }

    public void setNext(Packet next) {
        this.next = next;
    }
}
