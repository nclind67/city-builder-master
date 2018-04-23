import java.util.ArrayList;
import java.util.List;

public class CellMap {
    private Cell[][] map;

    public CellMap(){
        map = new Cell[10][10];
    }

    public void createMap(){
        for (int r = 0; r < map.length; r++){
            for (int c = 0; c < map[r].length; c++){
                map[r][c] = new Cell(r, c, 50, 50);
            }
        }
    }

    public Cell getCell(int x, int y){
        return map[x][y];
    }

    public void setCell(int x, int y, Cell c){
        map[x][y] = c;
    }

    public Cell[][] getMap() { return map; }
}
