import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int nodeCount;
    static ArrayList<Integer>[] nodeEdges;
    static boolean[] checkNodes;
    static int[] rootNode;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        nodeCount = Integer.parseInt(bufferedReader.readLine());
        nodeEdges = new ArrayList[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            nodeEdges[i] = new ArrayList<>();
        }
        rootNode = new int[nodeCount];
        checkNodes = new boolean[nodeCount];
        for (int i = 0; i < nodeCount - 1; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            nodeEdges[a - 1].add(b - 1);
            nodeEdges[b - 1].add(a - 1);
        }
        dfs(0);
        for (int i = 1; i < nodeCount; i++) {
            stringBuilder.append(rootNode[i] + 1).append("\n");
        }
        System.out.print(stringBuilder);
    }

    private static void dfs(int nodeIdx) {
        checkNodes[nodeIdx] = true;
        for (int i = 0; i < nodeEdges[nodeIdx].size(); i++) {
            if (!checkNodes[nodeEdges[nodeIdx].get(i)]) {
                rootNode[nodeEdges[nodeIdx].get(i)] = nodeIdx;
                dfs(nodeEdges[nodeIdx].get(i));
            }
        }
    }
}
