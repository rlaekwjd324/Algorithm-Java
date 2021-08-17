import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, count;
    static char[][] round;
    static boolean[][] check;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static Queue<Pair> queue;

    private static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        round = new char[N][M];
        check = new boolean[N][M];
        queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String string = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                round[i][j] = string.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!check[i][j]) {
                    queue.add(new Pair(i, j));
                    check[i][j] = true;
                    count++;
                    bfs();
                }
            }
        }
        System.out.print(count);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (round[pair.x][pair.y] == '|') {
                for (int i = 0; i < 2; i++) {
                    int newX = pair.x + moveX[i];
                    int newY = pair.y + moveY[i];
                    if (newX >= 0 && newY >= 0 && newX < N && newY < M) {
                        if (!check[newX][newY] && round[newX][newY] == '|') {
                            queue.add(new Pair(newX, newY));
                            check[newX][newY] = true;
                        }
                    }
                }
            } else {
                for (int i = 2; i < 4; i++) {
                    int newX = pair.x + moveX[i];
                    int newY = pair.y + moveY[i];
                    if (newX >= 0 && newY >= 0 && newX < N && newY < M) {
                        if (!check[newX][newY] && round[newX][newY] == '-') {
                            queue.add(new Pair(newX, newY));
                            check[newX][newY] = true;
                        }
                    }
                }
            }
        }
    }
}
