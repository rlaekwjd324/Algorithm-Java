import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, min;
    static boolean[][] edges;
    static boolean[] visited;
    static int[] nodes;
    static Queue<Kevin> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        edges = new boolean[N][N];
        nodes = new int[N];
        visited = new boolean[N];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            edges[a - 1][b - 1] = true;
            edges[b - 1][a - 1] = true;
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (edges[i][j]) {
                    nodes[i] += 1;
                    nodes[j] += 1;
                } else {
                    queue = new LinkedList<>();
                    queue.add(new Kevin(i, 0));
                    min = 1000000000;
                    visited = new boolean[N];
                    visited[i] = true;
                    bfs(visited, j);
                    nodes[i] += min;
                    nodes[j] += min;
                }
            }
        }
        int min = nodes[0];
        int idx = 0;
        for (int i = 1; i < N; i++) {
            if (min > nodes[i]) {
                min = nodes[i];
                idx = i;
            }
        }
        System.out.print(idx + 1);
    }

    private static class Kevin {
        int idx, count;

        Kevin(int idx, int count) {
            this.idx = idx;
            this.count = count;
        }
    }

    private static void bfs(boolean[] visited, int dest) {
        while (!queue.isEmpty()) {
            Kevin q = queue.poll();
            if (q.idx == dest) {
                min = Math.min(min, q.count);
                break;
            }
            for (int i = 0; i < N; i++) {
                if (edges[q.idx][i] && !visited[i]) {
                    visited[i] = true;
                    queue.add(new Kevin(i, q.count + 1));
                }
            }
        }
    }
}
