import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] nodeEdges;
    static boolean[][] checkNodes;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static int sheep, wolf, R, C, wolfCnt, sheepCnt;

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
                if (nodeEdges[i][j] == 'o') {
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
                    sheepCnt = 0;
                    wolfCnt = 0;
                    dfs(i, j);
                    if (sheepCnt > wolfCnt) {
                        wolf -= wolfCnt;
                    } else {
                        sheep -= sheepCnt;
                    }
                }
            }
        }
        System.out.print(sheep + " " + wolf);
    }

    private static void dfs(int x, int y) {
        checkNodes[x][y] = true;
        if (nodeEdges[x][y] == 'o') {
            sheepCnt++;
        }
        if (nodeEdges[x][y] == 'v') {
            wolfCnt++;
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