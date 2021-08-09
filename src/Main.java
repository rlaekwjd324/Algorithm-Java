import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] landArray;
    static boolean[][] checkArray;
    static int landCount;
    static int w;
    static int h;
    static int[] moveX = {1, -1, 0, 0, 1, -1, 1, -1};
    static int[] moveY = {0, 0, 1, -1, 1, -1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        w = Integer.parseInt(stringTokenizer.nextToken());
        h = Integer.parseInt(stringTokenizer.nextToken());
        while (w != 0 || h != 0) {
            landArray = new int[h][w];
            checkArray = new boolean[h][w];
            landCount = 0;
            for (int i = 0; i < h; i++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for (int j = 0; j < w; j++) {
                    landArray[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!checkArray[i][j] && landArray[i][j] == 1) {
                        landCount++;
                        dfs(i, j);
                    }
                }
            }
            stringBuilder.append(landCount).append("\n");
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            w = Integer.parseInt(stringTokenizer.nextToken());
            h = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.print(stringBuilder);
    }

    private static void dfs(int x, int y) {
        checkArray[x][y] = true;
        for (int i = 0; i < moveX.length; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newY >= 0 && newX < h && newY < w && !checkArray[newX][newY] && landArray[newX][newY] == 1) {
                dfs(newX, newY);
            }
        }
    }
}
