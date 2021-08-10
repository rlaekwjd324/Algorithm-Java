import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] nodeEdges;
    static boolean[][] checkNodes;
    static int count;
    static int width;
    static ArrayList<Integer> widthRectangles;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        K = Integer.parseInt(stringTokenizer.nextToken());
        widthRectangles = new ArrayList<>();
        nodeEdges = new boolean[M][N];
        checkNodes = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = a; j < c; j++) {
                for (int k = b; k < d; k++) {
                    nodeEdges[j][k] = true;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!checkNodes[i][j] && !nodeEdges[i][j]) {
                    count++;
                    widthRectangles.add(width);
                    width = 0;
                    dfs(i, j);
                }
            }
        }
        widthRectangles.add(width);
        Collections.sort(widthRectangles);
        System.out.println(count);
        for (int i = 1; i < widthRectangles.size(); i++) {
            System.out.print(widthRectangles.get(i) + " ");
        }
    }

    private static void dfs(int x, int y) {
        checkNodes[x][y] = true;
        width++;
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newX < M && newY >= 0 && newY < N && !checkNodes[newX][newY] && !nodeEdges[newX][newY]) {
                dfs(newX, newY);
            }
        }
    }
}
