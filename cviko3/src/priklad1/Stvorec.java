package priklad1;

public class Stvorec extends GrObjekt{

    private int sirka;

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public Stvorec(int x, int y, int sirka) { // konstruktor
        super(x, y);
        this.sirka = sirka;
    }

    @Override
    public void vykresli() {
        System.out.println("Kreslim stvorec s rozmermi: " + this.getX()  +", "+ this.getY() +", " + this.getSirka());
    }
}
