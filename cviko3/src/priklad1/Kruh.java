package priklad1;

public class Kruh extends GrObjekt{

    int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Kruh(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void vykresli() {
        System.out.println("Kreslim kruh s rozmerom: " + this.getX() +", " + this.getY() +", " + this.getR());
    }
}
