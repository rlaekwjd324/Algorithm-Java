import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] array;
    static int[] moveX = {1, 0};
    static int[] moveY = {0, 1};
    static boolean[][] checkArray;
    static Queue<Pair> queue = new LinkedList<>();

    private static class Pair {
        int x, y, dis;

        Pair(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        array = new int[N][N];
        checkArray = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        checkArray[0][0] = true;
        queue.add(new Pair(0, 0, array[0][0]));
        bfs();
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int x = pair.x + pair.dis;
            int y = pair.y + pair.dis;

            if (x >= 0 && x < N && !checkArray[x][pair.y]) {
                if (array[x][pair.y] == -1) {
                    System.out.print("HaruHaru");
                    return;
                }
                checkArray[x][pair.y] = true;
                queue.add(new Pair(x, pair.y, array[x][pair.y]));
            }
            if (y >= 0 && y < N && !checkArray[pair.x][y]) {
                if (array[pair.x][y] == -1) {
                    System.out.print("HaruHaru");
                    return;
                }
                checkArray[pair.x][y] = true;
                queue.add(new Pair(pair.x, y, array[pair.x][y]));
            }
        }
        System.out.print("Hing");
    }
}