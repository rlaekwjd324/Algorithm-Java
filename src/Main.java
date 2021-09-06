import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, r1, c1, r2, c2, cnt;
    static int[][] array;
    static int[] moveX = {-2, -2, 0, 0, 2, 2};
    static int[] moveY = {-1, 1, -2, 2, -1, 1};
    static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        array = new int[N][N];
        check = new boolean[N][N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        r1 = Integer.parseInt(stringTokenizer.nextToken());
        c1 = Integer.parseInt(stringTokenizer.nextToken());
        r2 = Integer.parseInt(stringTokenizer.nextToken());
        c2 = Integer.parseInt(stringTokenizer.nextToken());
        cnt = -1;
        bfs();
        System.out.println(cnt);
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r1, c1, 0});
        check[r1][c1] = true;
        while (!queue.isEmpty()) {
            int[] q = queue.poll();
            for (int i = 0; i < moveY.length; i++) {
                int x = q[0] + moveX[i];
                int y = q[1] + moveY[i];
                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (!check[x][y]) {
                        queue.add(new int[]{x, y, q[2] + 1});
                        check[x][y] = true;
                        if (x == r2 && y == c2) {
                            if (cnt == -1) {
                                cnt = q[2] + 1;
                            } else {
                                cnt = Math.min(cnt, q[2] + 1);
                            }
                        }
                    }
                }
            }
        }
    }
}
