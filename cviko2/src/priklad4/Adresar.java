package priklad4;

public class Adresar {
    private String name;                 //nazov a podadresare (vlavo a vpravo lebo to je ez)
    private Adresar podadresarLeft;
    private Adresar podadresarRight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresar getPodadresarLeft() {
        return podadresarLeft;
    }

    public void setPodadresarLeft(Adresar podadresarLeft) {
        this.podadresarLeft = podadresarLeft;
    }

    public Adresar getPodadresarRight() {
        return podadresarRight;
    }

    public void setPodadresarRight(Adresar podadresarRight) {
        this.podadresarRight = podadresarRight;
    }

}
