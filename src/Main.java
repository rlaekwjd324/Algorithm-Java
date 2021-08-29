import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] array, pickedArray;
    static boolean[] checkArray;
    static StringBuilder stringBuilder = new StringBuilder();
    static HashSet<String> hashSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        array = new int[N];
        pickedArray = new int[M];
        checkArray = new boolean[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(array);
        back(0, 0);
        System.out.print(stringBuilder);
    }

    private static void back(int idx, int count) {
        if (count == M) {
            String string = "";
            for (int i = 0; i < M; i++) {
                string = string + pickedArray[i] + " ";
            }
            if (!hashSet.contains(string)) {
                for (int i = 0; i < M; i++) {
                    stringBuilder.append(pickedArray[i]).append(" ");
                }
                stringBuilder.append("\n");
                hashSet.add(string);
            }
            return;
        }
        for (int i = idx; i < N; i++) {
            if (!checkArray[i]) {
                checkArray[i] = true;
                pickedArray[count] = array[i];
                back(i + 1, count + 1);
                checkArray[i] = false;
            }
        }
    }
}
