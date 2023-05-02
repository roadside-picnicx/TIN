public class Uzel {

    private int data;
    private Uzel next;
    private Uzel prev;

    private Uzel rod;


    public Uzel(int data) {
        this.data = data;
        this.next = null;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Uzel getNext() {
        return next;
    }

    public void setNext(Uzel next) {
        this.next = next;
    }

    public boolean hasNext(){       // zistuje ci ma dalsiu
        if (next == null){
            return false;
        }
        return true;
    }

    public Uzel getPrev() {
        return prev;
    }

    public void setPrev(Uzel prev) {
        this.prev = prev;
    }

    public Uzel getRod() {
        return rod;
    }

    public void setRod(Uzel rod) {
        this.rod = rod;
    }



}

