import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[][] array = new int[5][5];
    static ArrayList<String> arrayList = new ArrayList<>();
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < 5; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, String.valueOf(array[i][j]), 1);
            }
        }
        System.out.print(arrayList.size());
    }

    private static void dfs(int x, int y, String value, int count) {
        if (count == 6) {
            if (!arrayList.contains(value)) {
                arrayList.add(value);
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            if (newX >= 0 && newX < 5 && newY >= 0 && newY < 5) {
                dfs(newX, newY, value + array[newX][newY], count + 1);
            }
        }
    }
}
