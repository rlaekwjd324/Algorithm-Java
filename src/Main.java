import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, max = 0;
    static int[][] array;
    static boolean[][] check;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] moveX = {1, -1, 0, 0, 1, -1, 1, -1};
    static int[] moveY = {0, 0, 1, -1, 1, -1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        array = new int[N][M];
        check = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (array[i][j] == 1) {
                    queue.add(new int[]{i, j, 0});
                    check[i][j] = true;
                }
            }
        }
        bfs();
        System.out.println(max);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            int[] q = queue.poll();
            for (int i = 0; i < 8; i++) {
                int x = q[0] + moveX[i];
                int y = q[1] + moveY[i];
                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (!check[x][y] && array[x][y] == 0) {
                        check[x][y] = true;
                        queue.add(new int[]{x, y, q[2] + 1});
                        max = Math.max(max, q[2] + 1);
                    }
                }
            }
        }
    }
}
