import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    static int[][] nodeEdges;
    static boolean[][] checkNodes;
    static int maxCount;
    static int tempCount;
    static int rainyLand;
    static int N;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        nodeEdges = new int[N][N];
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(0);
        maxCount = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                nodeEdges[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                hashSet.add(nodeEdges[i][j]);
            }
        }
        // Iterator(반복자) 생성
        for (Integer integer : hashSet) { // hasNext() : 데이터가 있으면 true 없으면 false
            checkNodes = new boolean[N][N];
            tempCount = 0;
            rainyLand = integer;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (!checkNodes[j][k] && nodeEdges[j][k] > rainyLand) {
                        tempCount++;
                        dfs(j, k);
                    }
                }
            }
            if (maxCount < tempCount) {
                maxCount = tempCount;
            }
        }
        System.out.print(maxCount);
    }

    private static void dfs(int x, int y) {
        checkNodes[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newX < N && newY >= 0 && newY < N) {
                if (!checkNodes[newX][newY] && nodeEdges[newX][newY] > rainyLand) {
                    dfs(newX, newY);
                }
            }
        }
    }
}
