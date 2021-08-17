import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, maxCount;
    static int[][] nodeEdges, nodeEdges2;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static Queue<Pair> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        nodeEdges = new int[N][M];
        queue = new LinkedList<>();
        maxCount = 0;
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                int a = Integer.parseInt(stringTokenizer.nextToken());
                nodeEdges[i][j] = a;
            }
        }
        nodeEdges2 = nodeEdges;
        installGuard(0);
        System.out.print(maxCount);
    }

    private static void installGuard(int countGuard) {
        if (countGuard == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (nodeEdges[i][j] == 0) {
                    nodeEdges[i][j] = 1;
                    installGuard(countGuard + 1);
                    nodeEdges[i][j] = 0;
                }
            }
        }
    }

    private static void bfs() {
        Queue<Pair> queue1 = new LinkedList<>();
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            if (M >= 0) System.arraycopy(nodeEdges[i], 0, array[i], 0, M);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (array[i][j] == 2) {
                    queue1.add(new Pair(i, j));
                }
            }
        }
        while (!queue1.isEmpty()) {
            Pair pair = queue1.poll();
            for (int i = 0; i < 4; i++) {
                int newX = pair.x + moveX[i];
                int newY = pair.y + moveY[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M && array[newX][newY] == 0) {
                    array[newX][newY] = 2;
                    queue1.add(new Pair(newX, newY));
                }
            }
        }
        safeCount(array);
    }

    private static void safeCount(int[][] array) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (array[i][j] == 0) {
                    count++;
                }
            }
        }
        maxCount = Math.max(maxCount, count);
    }

    private static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
