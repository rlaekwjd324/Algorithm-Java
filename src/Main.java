import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, H, W, count;
    static char[][] array;
    static boolean[][] checkArray;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            H = Integer.parseInt(stringTokenizer.nextToken());
            W = Integer.parseInt(stringTokenizer.nextToken());
            array = new char[H][W];
            checkArray = new boolean[H][W];
            for (int j = 0; j < H; j++) {
                array[j] = bufferedReader.readLine().toCharArray();
            }
            count = 0;
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    if (array[j][k] == '#' && !checkArray[j][k]) {
                        checkArray[j][k] = true;
                        dfs(j, k);
                        count++;
                    }
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.print(stringBuilder);
    }

    private static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newY >= 0 && newX < H && newY < W) {
                if (!checkArray[newX][newY] && array[newX][newY] == '#') {
                    checkArray[newX][newY] = true;
                    dfs(newX, newY);
                }
            }
        }
    }
}
