import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] cheeses;
    static boolean[][] checkCheese;
    static int count, N, M;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        cheeses = new int[N][M];
        checkCheese = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                int a = Integer.parseInt(stringTokenizer.nextToken());
                cheeses[i][j] = a;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

            }
        }

    }

    private static void dfs(int x, int y) {
        checkCheese[x][y] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                if(!checkCheese[newX][newY]&&cheeses[newX][newY]==1){
                    dfs(newX, newY);
                }
            }
        }
    }
}
