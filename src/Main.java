import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] array;
    static boolean[][] checkArray;
    static StringBuilder string = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        array = new int[N][N];
        checkArray = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        string.append("Hing");
        checkArray[0][0] = true;
        dfs(0, 0, array[0][0]);
        System.out.print(string);
    }

    private static void dfs(int x, int y, int dis) {
        int newX = x+dis;
        int newY = y+dis;
        if (newX >= 0 && newX < N && !checkArray[newX][y]) {
            if(array[newX][y]==-1){
                string = new StringBuilder();
                string.append("HaruHaru");
                return;
            }
            checkArray[newX][y] = true;
            dfs(newX, y, array[newX][y]);
        }
        if (newY >= 0 && newY < N && !checkArray[x][newY]) {
            if(array[x][newY]==-1){
                string = new StringBuilder();
                string.append("HaruHaru");
                return;
            }
            checkArray[x][newY] = true;
            dfs(x, newY, array[x][newY]);
        }
    }
}