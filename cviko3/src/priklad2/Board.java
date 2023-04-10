package priklad2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Board implements Comparable<Board> {
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


    public boolean equals(Board o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Arrays.deepEquals(this.data, o.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(posX, posY);
        result = 31 * result + Arrays.deepHashCode(data);
        return result;
    }


    @Override
    public int compareTo(Board o) {
        for (int y = 0; y< this.data.length; ++y );
            for (int x =0; x < this.data.length; ++x);
               if (this.data[posX][posX] > o.data[posX][posX]){
                    return 1;
                }
                if (this.data[posX][posX] < o.data[posX][posX]){
                    return -1;
              }
        return 0;
    }

}
