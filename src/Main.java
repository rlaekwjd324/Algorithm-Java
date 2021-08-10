import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static ArrayList<Integer>[] nodeEdges;
    static boolean[] checkNodes;
    static int root, leaf, minCount;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        root = Integer.parseInt(stringTokenizer.nextToken());
        leaf = Integer.parseInt(stringTokenizer.nextToken());
        nodeEdges = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            nodeEdges[i] = new ArrayList<>();
        }
        int edgeCount = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < edgeCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            nodeEdges[a - 1].add(b - 1);
            nodeEdges[b - 1].add(a - 1);
        }
        minCount = 1000000000;
        for (int i = 0; i < nodeEdges[root - 1].size(); i++) {
            checkNodes = new boolean[N];
            dfs(nodeEdges[root - 1].get(i), 1);
        }
        if (minCount == 1000000000) {
            System.out.print("-1");
            return;
        }
        System.out.print(minCount);
    }

    private static void dfs(int nodeIdx, int count) {
        if (nodeIdx == leaf - 1) {
            if (count < minCount) {
                minCount = count;
            }
            return;
        }
        if (count > minCount) {
            return;
        }
        if (checkNodes[nodeIdx]) {
            return;
        }
        checkNodes[nodeIdx] = true;
        for (int i = 0; i < nodeEdges[nodeIdx].size(); i++) {
            int nextIdx = nodeEdges[nodeIdx].get(i);
            dfs(nextIdx, count + 1);
        }
    }
}
