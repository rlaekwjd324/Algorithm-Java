import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C, wolf, sheep, tempWolf, tempSheep;
    static char[][] nodeEdges;
    static boolean[][] checkNodes;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        R = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());
        nodeEdges = new char[R][C];
        checkNodes = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            String string = bufferedReader.readLine();
            for (int j = 0; j < C; j++) {
                nodeEdges[i][j] = string.charAt(j);
                if (nodeEdges[i][j] == 'k') {
                    sheep++;
                }
                if (nodeEdges[i][j] == 'v') {
                    wolf++;
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!checkNodes[i][j]) {
                    tempSheep = 0;
                    tempWolf = 0;
                    dfs(i, j);
                    if (tempSheep > tempWolf) {
                        wolf -= tempWolf;
                    } else {
                        sheep -= tempSheep;
                    }
                }
            }
        }
        System.out.println(sheep + " " + wolf);
    }

    private static void dfs(int x, int y) {
        checkNodes[x][y] = true;
        if (nodeEdges[x][y] == 'k') {
            tempSheep++;
        }
        if (nodeEdges[x][y] == 'v') {
            tempWolf++;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newX < R && newY >= 0 && newY < C && !checkNodes[newX][newY] && nodeEdges[newX][newY] != '#') {
                dfs(newX, newY);
            }
        }
    }
}
