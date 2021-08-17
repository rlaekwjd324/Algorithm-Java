import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, V;
    static String bfs = "", dfs = "";
    static boolean[][] array;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        V = Integer.parseInt(stringTokenizer.nextToken());
        array = new boolean[N][N];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            array[a - 1][b - 1] = true;
            array[b - 1][a - 1] = true;
        }
        check = new boolean[N];
        bfs();
        check = new boolean[N];
        dfs(V - 1);
        System.out.println(dfs);
        System.out.print(bfs);
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V - 1);
        check[V - 1] = true;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            bfs = bfs + (q+1 + " ");
            for (int i = 0; i < N; i++) {
                if (!check[i] && array[q][i]) {
                    queue.add(i);
                    check[i] = true;
                }
            }
        }
    }

    private static void dfs(int n) {
        check[n] = true;
        dfs = dfs + (n+1 + " ");
        for (int i = 0; i < N; i++) {
            if(!check[i]&&array[n][i]){
                dfs(i);
            }
        }
    }
}
