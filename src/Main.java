import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[][] checkRgb;
    static boolean[][] checkRb;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static int N;
    static char rgbColor;
    static char rbColor;
    static char[][] rgbArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        int rgbCount = 0;
        int rbCount = 0;
        rgbArray = new char[N][N];
        checkRgb = new boolean[N][N];
        checkRb = new boolean[N][N];
//        1. 정보 저장
        for (int i = 0; i < N; i++) {
            String rgbString = bufferedReader.readLine();
            for (int j = 0; j < N; j++) {
                rgbArray[i][j] = rgbString.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!checkRgb[i][j]) {
                    rgbCount++;
                    rgbColor = rgbArray[i][j];
                    dfsRgb(i, j);
                }
                if (!checkRb[i][j]) {
                    rbCount++;
                    if (rgbArray[i][j] == 'B') {
                        rbColor = 'B';
                    } else {
                        rbColor = 'R';
                    }
                    dfsRb(i, j);
                }
            }
        }
        System.out.print(rgbCount + " " + rbCount);
    }

    private static void dfsRgb(int x, int y) {
//        2. 방문한 자리 표시
        checkRgb[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
//            3. 다음 조건에 맞는 곳 방문
            if (newX >= 0 && newX < N && newY >= 0 && newY < N && !checkRgb[newX][newY] && rgbArray[newX][newY] == rgbColor) {
                rgbColor = rgbArray[newX][newY];
                dfsRgb(newX, newY);
            }
        }
    }

    private static void dfsRb(int x, int y) {
//        2. 방문한 자리 표시
        checkRb[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
//            3. 다음 조건에 맞는 곳 방문
            if (newX >= 0 && newX < N && newY >= 0 && newY < N && !checkRb[newX][newY]) {
                char color;
                if (rgbArray[newX][newY] == 'B') {
                    color = 'B';
                } else {
                    color = 'R';
                }
                if (color == rbColor) {
                    dfsRb(newX, newY);
                }
            }
        }
    }
}
