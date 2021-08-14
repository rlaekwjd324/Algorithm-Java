import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] nodeEdges;
    static boolean[] checkNodes;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int E = Integer.parseInt(bufferedReader.readLine());
        nodeEdges = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            nodeEdges[i] = new ArrayList<>();
        }
        checkNodes = new boolean[N];
        for (int i = 0; i < E; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            nodeEdges[a - 1].add(b - 1);
            nodeEdges[b - 1].add(a - 1);
        }
        bfs();

        System.out.print(count - 1);
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        checkNodes[0] = true;

        while (!queue.isEmpty()) {
            int q = queue.poll();
            count++;
            for (int a : nodeEdges[q]) {
                if (!checkNodes[a]) {
                    queue.add(a);
                    checkNodes[a] = true;
                }
            }
        }
    }
}
