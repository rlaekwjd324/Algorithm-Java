import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] array;
    static boolean[][] checkArray;
    static int[] moveX = {1, -1, 0, 0, 1, -1, 1, -1};
    static int[] moveY = {0, 0, 1, -1, 1, -1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        array = new int[N][M];
        checkArray = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!checkArray[i][j] && array[i][j] == 1) {
                    checkArray[i][j] = true;
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.print(count);
    }

    private static void dfs(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newY >= 0 && newX < N && newY < M) {
                if (!checkArray[newX][newY] && array[newX][newY] == 1) {
                    checkArray[newX][newY] = true;
                    dfs(newX, newY);
                }
            }
        }
    }
}
