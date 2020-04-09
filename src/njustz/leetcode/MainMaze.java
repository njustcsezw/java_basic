package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/9
 */
public class MainMaze {

    static int[][] maze;
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            n = scanner.nextInt();
            m = scanner.nextInt();
            maze = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    maze[i][j] = scanner.nextInt();
                }
            }

            /*for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(maze[i][j]+ " ");
                }
                System.out.println();
            }*/

            maze(0,0);
            show(0,0);
        }
    }

    static void show(int x, int y) {
        if(x == n-1 && y == m-1){
            System.out.println("("+x+","+y+")");
            return;
        }
        if(x+1<n){
            if(maze[x+1][y] != 1){
                System.out.println("("+x+","+y+")");
                show(x+1, y);
            }

        }

        if(y+1<m){
            if(maze[x][y+1] != 1){
                System.out.println("("+x+","+y+")");
                show(x,y+1);
            }
        }
    }

    static void maze(int x, int y){
        if(x == n-1 && y == m-1){
            return;
        }
        if(x+1<n){
            if(maze[x+1][y] != 1)
                maze(x+1, y);
        }

        if(y+1<m){
            if(maze[x][y+1] != 1){
                maze(x,y+1);
            }
        }

        if( x+1 == n && maze[x][y+1]==1){
            maze[x][y] = 1;
        }
        if(x+1 != n && y+1 != m){
            if(maze[x+1][y]==1 && maze[x][y+1]==1)
                maze[x][y]=1;
        }
    }
}
