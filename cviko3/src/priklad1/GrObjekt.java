package priklad1;

public abstract class GrObjekt {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public GrObjekt(int x, int y){  // konstruktor
        super();
        this.x =x;
        this.y=y;
    }

    abstract void vykresli();

}
