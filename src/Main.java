import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] array;
    static int[] moveX = {1, 0};
    static int[] moveY = {0, 1};
    static boolean[][] checkArray;
    static StringBuilder string = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        array = new int[N][N];
        checkArray = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        string.append("Hing");
        checkArray[0][0] = true;
        dfs(0, 0, array[0][0]);
        System.out.print(string);
    }

    private static void dfs(int x, int y, int dis) {
        if (x == N - 1 && y == N - 1 && dis == 0) {
            string = new StringBuilder();
            string.append("HaruHaru");
            return;
        }
        if (x >= N || y >= N) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newY >= 0 && newX < N && newY < N) {
                if (!checkArray[newX][newY]) {
                    if (dis > 0) {
                        checkArray[newX][newY] = true;
                        dfs(newX, newY, dis - 1);
                        checkArray[newX][newY] = false;
                    } else {
                        if (array[newX][newY] < N - x || array[newX][newY] < N - y) {
                            checkArray[newX][newY] = true;
                            dfs(newX, newY, array[newX][newY]);
                            checkArray[newX][newY] = false;
                        }
                    }
                }
            }
        }
    }
}