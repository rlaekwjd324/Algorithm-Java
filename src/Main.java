import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count;
    static boolean[][] nodeEdges;
    static boolean[] checkNode;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int testcase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testcase; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());
            count = 0;
            nodeEdges = new boolean[n][n];
            checkNode = new boolean[n];
//            1. 노드와 간선 정보 저장
            for (int j = 0; j < k; j++) {
                int a = Integer.parseInt(stringTokenizer.nextToken());
                int b = Integer.parseInt(stringTokenizer.nextToken());
                nodeEdges[a][b] = true;
                nodeEdges[b][a] = true;
            }
            dfs(0);
            if(count == n){
                stringBuilder.append("Connected.").append("\n");
            }else{
                stringBuilder.append("Not connected.").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }

    private static void dfs(int nodeIdx) {
//        2. 방문한 노드 체크
        checkNode[nodeIdx] = true;
        count++;
        for (int i = 0; i < nodeEdges[nodeIdx].length; i++) {
//            3. 방문하지 않은 노드 방문
            if (!checkNode[i] && nodeEdges[nodeIdx][i]) {
                dfs(i);
            }
        }
    }
}
