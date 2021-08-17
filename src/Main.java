import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean[][] check;
    static int[][] array;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    private static class Pair {
        int x, y, count;

        Pair(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        check = new boolean[N][M];
        array = new int[N][M];
        for (int i = 0; i < N; i++) {
            String string = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                array[i][j] = string.charAt(j) - '0';
            }
        }
        bfs();
    }

    private static void bfs() {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0, 1));
        check[0][0] = true;
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (pair.x == N - 1 && pair.y == M - 1) {
                System.out.print(pair.count);
            }
            for (int i = 0; i < 4; i++) {
                int newX = pair.x + moveX[i];
                int newY = pair.y + moveY[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    if (!check[newX][newY] && array[newX][newY] == 1) {
                        queue.add(new Pair(newX, newY, pair.count + 1));
                        check[newX][newY] = true;
                    }
                }
            }
        }
    }
}
