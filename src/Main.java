import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int N;
    static int[] array = {1, 5, 10, 50};
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        back(0, 0, 0);
        System.out.print(arrayList.size());
    }

    private static void back(int idx, int count, int sum) {
        if (count == N) {
            if (!arrayList.contains(sum)) {
                arrayList.add(sum);
            }
            return;
        }
        for (int i = idx; i < array.length; i++) {
            back(i, count + 1, sum + array[i]);
        }
    }
}
