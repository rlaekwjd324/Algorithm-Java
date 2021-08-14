import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static int[][] nodeEdges;
    static boolean[][] checkNodes;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        nodeEdges = new int[N][M];
        checkNodes = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String string = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                nodeEdges[i][j] = string.charAt(j) - '0';
            }
        }
        bfs();
    }

    private static void bfs() {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(0, 0, 1));
        checkNodes[0][0] = true;
        while (!queue.isEmpty()) {
            Position p = queue.poll();
            if (p.x == N - 1 && p.y == M - 1) {
                System.out.print(p.d);
                break;
            }
            for (int i = 0; i < 4; i++) {
                int newX = p.x + moveX[i];
                int newY = p.y + moveY[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M && !checkNodes[newX][newY] && nodeEdges[newX][newY] == 1) {
                    queue.add(new Position(newX, newY, p.d + 1));
                    checkNodes[newX][newY] = true;
                }
            }
        }
    }

    static class Position {
        int x;
        int y;
        int d;

        Position(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
}
