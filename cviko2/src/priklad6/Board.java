package priklad6;

import java.lang.reflect.Array;

public class Board {
    private int [] [] data = {{7,2,4},{5,0,6},{8,3,1}}; // matica podla zadania
    private int posX = 1;
    private int posY = 1;
    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    public void move (int direction){
        switch (direction){
            case DOWN:
                if(posY >= 2)     // ked sa posunie o viac nez 2 tak je neplatny tah
                    break;
                data[posY][posX] = data[posY +1][posX];
                data[posY +1][posX] = 0;        //nastavi to policko na ktorom som na 0, namiesto 5ky bude 0 napriklad
                posY ++;
                break;
            case UP:
                if(posY <= 0)       // ked sa posunie o viac nez 0 tak je neplatny tah lebo nemoze ist viac hore
                    break;
                data[posY][posX] = data[posY -1][posX];
                data[posY -1][posX] = 0;
                posY --;
                break;
            case LEFT:
                if(posX <= 0)       // ked sa posunie o viac nez 0 tak je neplatny tah lebo nemozem ist viac dolava
                    break;
                data[posY][posX] = data[posY][posX - 1];
                data[posY][posX - 1] = 0;
                posX --;
                break;
            case RIGHT:
                if(posX >= 2)       // ked sa posunie o viac nez 2 tak je neplatny tah
                    break;
                data[posY][posX] = data[posY][posX + 1];
                data[posY][posX + 1] = 0;
                posX ++;
                break;
        }

    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                out += this.data[i][j] + " ";
            }
            out += "\n";
        }

        return "" + "\n" + out;
    }
}
