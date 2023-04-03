import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static boolean searchPart(int[][] maze, int x, int y, List<Integer> path){

        if(maze[y][x] == 9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x] == 0){
            maze[y][x] = 2; // visited
            int dx = -1;
            int dy = 0;
            // if recrusion retirn true than if part execute
            if(searchPart(maze,x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 1;
            dy = 0;
            if(searchPart(maze,x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 0;
            dy = -1;
            if(searchPart(maze, x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 0;
            dy= 1;
            if (searchPart(maze, x + dx, y + dy, path)) {

                path.add(x);
                path.add(y);
                return true;
            }

        }
        return false; // any path not found
    }
}
