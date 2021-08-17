import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, count;
    static ArrayList<Integer>[] array;
    static boolean[] check;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        array = new ArrayList[N];
        check = new boolean[N];
        queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            array[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            array[a - 1].add(b - 1);
            array[b - 1].add(a - 1);
        }
        for (int i = 0; i < N; i++) {
            if (!check[i]) {
                queue.add(i);
                check[i] = true;
                bfs();
                count++;
            }
        }
        System.out.print(count);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            int q = queue.poll();
            for (int i = 0; i < N; i++) {
                if (!check[i] && array[q].contains(i)) {
                    queue.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
