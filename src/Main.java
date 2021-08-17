import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] array;
    static boolean[][] check;
    static int N;

    private static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        array = new int[N][N];
        check = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        bfs();
    }

    private static void bfs() {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            check[pair.x][pair.y] = true;
            int moving = array[pair.x][pair.y];
            if (moving == -1) {
                System.out.print("HaruHaru");
                return;
            }
            int x = pair.x + moving;
            int y = pair.y + moving;
            if (x >= 0 && x < N && !check[x][pair.y]) {
                queue.add(new Pair(x, pair.y));
                check[x][pair.y] = true;
            }
            if (y >= 0 && y < N && !check[pair.x][y]) {
                queue.add(new Pair(pair.x, y));
                check[pair.x][y] = true;
            }
        }
        System.out.print("Hing");
    }
}
