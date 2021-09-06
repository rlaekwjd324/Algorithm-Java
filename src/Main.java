import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, max = 0;
    static ArrayList<Integer> array;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            array.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        back(0);
        System.out.println(max);
    }

    private static void back(int sum) {
        if (array.size() <= 2) {
            max = Math.max(max, sum);
            return;
        }
        for (int idx = 1; idx < array.size() - 1; idx++) {
            int a = array.get(idx);
            array.remove(idx);
            back(sum + array.get(idx - 1) * array.get(idx));
            array.add(idx, a);
        }
    }
}
