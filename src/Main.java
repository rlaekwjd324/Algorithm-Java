import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] nodeEdges;
    static boolean[] checkNodes;
    static int virusCount;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nodeCount = Integer.parseInt(bufferedReader.readLine());
        int edgeCount = Integer.parseInt(bufferedReader.readLine());
        nodeEdges = new boolean[nodeCount][nodeCount];
        checkNodes = new boolean[nodeCount];
        virusCount = 0;
//        1. node에 연결된 edge 저장하기
        for (int i = 0; i < edgeCount; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int preNode = Integer.parseInt(stringTokenizer.nextToken());
            int postNode = Integer.parseInt(stringTokenizer.nextToken());

            nodeEdges[preNode - 1][postNode - 1] = true;
            nodeEdges[postNode - 1][preNode - 1] = true;
        }
        dfs(0);

        System.out.print(virusCount - 1);
    }

    private static void dfs(int nodeIdx) {
//        2. 방문한 node 정보 저장
        checkNodes[nodeIdx] = true;
        virusCount++;
//        3. 방문하지 않은 node 방문하기
        for (int i = 0; i < nodeEdges[nodeIdx].length; i++) {
            if (nodeEdges[nodeIdx][i] && !checkNodes[i]) {
                dfs(i);
            }
        }
    }
}
