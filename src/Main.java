import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K, count, max;
    static boolean[][] array;
    static boolean[][] check;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static Queue<Pair> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        K = Integer.parseInt(stringTokenizer.nextToken());
        array = new boolean[N][M];
        check = new boolean[N][M];
        queue = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            array[a - 1][b - 1] = true;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!check[i][j] && array[i][j]) {
                    count = 0;
                    queue.add(new Pair(i, j));
                    check[i][j] = true;
                    bfs();
                    max = Math.max(count, max);
                }
            }
        }
        System.out.print(max);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            count++;
            for (int i = 0; i < 4; i++) {
                int newX = pair.x + moveX[i];
                int newY = pair.y + moveY[i];
                if (newX >= 0 && newY >= 0 && newX < N && newY < M) {
                    if (!check[newX][newY] && array[newX][newY]) {
                        queue.add(new Pair(newX, newY));
                        check[newX][newY] = true;
                    }
                }
            }
        }
    }

    private static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
